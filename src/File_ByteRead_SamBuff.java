import org.apache.groovy.util.Arrays;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class File_ByteRead_SamBuff {
    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        while (true) {
            int count = in.read(buff);
            if(count != -1) {
                System.out.println("количество = " + count + ", buff = " + buff.toString() + ",str =" + new String(buff,0,count,"cp1251"));
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "E:\\MyFile.txt";
        InputStream inFile = null;
        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        }
        catch (IOException e) {
            System.out.println("Щшибка открфытия - закрытия файла " + fileName + e);
        }
        finally {
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException ignore) {

                }
            }
        }
    }
}
