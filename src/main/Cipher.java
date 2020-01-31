package main;

import java.io.FileWriter;

public class Cipher {
    String outputFileName;

    public Cipher(String outputFileName) {
        this.outputFileName = outputFileName;
    }

    public void szyfruj(String text) {
        char arrZ[] = text.toCharArray();
        for(int i = 0; i < arrZ.length; i++) {
            arrZ[i] = (char) ((int)arrZ[i] + 13);
        }
        try{
            FileWriter fw = new FileWriter(outputFileName);
            fw.write(arrZ);
            fw.close();
        }catch(Exception e){System.out.println(e);}
    }
    public void odszyfruj(String text) {
        char arrZ[] = text.toCharArray();
        for(int i = 0; i < arrZ.length; i++) {
            arrZ[i] = (char) ((int)arrZ[i] - 13);
        }
        try{
            FileWriter fw = new FileWriter(outputFileName);
            fw.write(arrZ);
            fw.close();
        }catch(Exception e){System.out.println(e);}
    }
}
