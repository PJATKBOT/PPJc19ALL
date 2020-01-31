package main;

import java.io.*;

public class Caesar10 {

    public static void encrypt() {
        try {
            FileInputStream fis = new FileInputStream("msg.txt");
            FileWriter fw = new FileWriter("Caesar10.txt");
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c=fis.read()) != -1) {
                sb.append((char)(c+10));
            }
            System.out.println(sb);
            fw.write(String.valueOf(sb));
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void decrypt() {
        try {
            FileInputStream fis = new FileInputStream("Caesar10.txt");
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c=fis.read()) != -1) {
                sb.append((char)(c-10));
            }
            System.out.println(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
