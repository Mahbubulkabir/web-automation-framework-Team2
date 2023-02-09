package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.Properties;

public class Utility {

    public static String path = System.getProperty("user.dir");
    public static Properties getProperties(){
        Properties prop = new Properties();
        try {
            InputStream inputStream = new FileInputStream("C:\\Users\\hemal\\IdeaProjects\\group2-automation-final-bootcamp\\src\\test\\config.properties");
            prop.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;
    }
    public static String decode(String key){
        byte[] decodeBytes = Base64.getDecoder().decode(key);
        return new String(decodeBytes);
    }

    public static void main(String[] args) {
//        String toEncode = "hemalhemu_S7mIgW";
//        String encoded = Base64.getEncoder().encodeToString(toEncode.getBytes());
//        System.out.println(encoded);

//       System.out.println(decode("aGVtYWxoZW11X1M3bUlnVw=="));

        String sep = File.separator;
        String path = System.getProperty("user.dir");
        System.out.println(sep);
    }
}
