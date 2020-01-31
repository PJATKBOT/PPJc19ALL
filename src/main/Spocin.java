package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Spocin {

    public static void encrypt () {

        FileInputStream fis;
        StringBuilder input = new StringBuilder();

        try {
            fis = new FileInputStream("msg.txt");

            int c;

            while ((c = fis.read()) != -1) {
                input.append((char)c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        char [][] board = {
                {'a','b','c','d','e'},
                {'f','g','h','i','j','k'},
                {'l','m','n','o','p','.'},
                {'q','r','s','t','u',','},
                {'v','w','x','y','z',' '}
        };

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length() ; i++) {

            for (int j = 0; j < board.length; j++) {
                for (int k = 0; k < board[j].length; k++) {

                    if ((input.charAt(i) == board[j][k]) || (input.charAt(i) == ((board[j][k])-32))) {
                        output.append(j);
                        output.append(k);
                    }
                }
            }

        }

        FileOutputStream fos;
        try {
            fos = new FileOutputStream("Spocin.txt");

            for (int i = 0; i < output.length(); i++) {

                fos.write(output.charAt(i));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public static void decrypt () {

        FileInputStream fis;
        StringBuilder input = new StringBuilder();

        try {

            fis = new FileInputStream("Spocin.txt");

            int c;

            while ((c = fis.read()) != -1) {
                input.append((char)c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        char [][] board = {
                {'a','b','c','d','e'},
                {'f','g','h','i','j','k'},
                {'l','m','n','o','p','.'},
                {'q','r','s','t','u',','},
                {'v','w','x','y','z',' '}
        };

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i=i+2) {

            output.append(
                    board[input.charAt(i)-48][input.charAt(i+1)-48]
            );
        }

        System.out.println(output);

    }
}
