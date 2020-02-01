package mm;

import java.io.FileWriter;
import java.io.IOException;

public class Kodowanie {

    private static final int shift = 20;

    public static String code (String msg){
        return caesarCipher(msg, shift);
    }

    public static String decode (String msg){
        return caesarCipher(msg, 26 - shift);
    }

    private static String caesarCipher(String msg, int shift) {
        char[] ch = msg.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char) ((ch[i] - 'A' + shift) % 26 + 'A');
            } else if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char) ((ch[i] - 'a' + shift) % 26 + 'a');
            }
        }
        return new String(ch);
    }

        public static void writer (String nazwa, String code){
            try {
                FileWriter fw = new FileWriter(nazwa);
                fw.write(code);
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
