package main;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// Create package!!!!! for your main code
        FileInputStream fis = null;
        StringBuilder sb = null;
        try {
            fis = new FileInputStream("msg.txt");


            sb = new StringBuilder();
            int c;

            while ((c = fis.read()) != -1) {
                sb.append((char) c);
            }

            System.out.println(sb);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        Cipher cipher = new Cipher("testowy.txt");

        Caesar10.encrypt();
        Caesar10.decrypt();

        System.out.println("\n---------------------------------------------------------------------------------------");

        Spocin.encrypt();
        Spocin.decrypt();
    }
}
