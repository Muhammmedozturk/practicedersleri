package practiceAdvenced.practice10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Q03_Text_OKuma {
    //bir text dosyasındaki 3. satırın kelime sayısını veren bir kod yazınız
    public static void main(String[] args) throws IOException {
      BufferedReader bf=  new BufferedReader(new FileReader ("src/main/java/practiceAdvenced/practice10/text"));
        bf.readLine();
        bf.readLine();
        String line3=bf.readLine();
        String []arr=line3.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println("3. satırın eleman sayısı"+arr.length);

        //son satırı okutma
        String line=null;
        while (bf.readLine() != null) {
            line = bf.readLine();
        }
        System.out.println(line);


    }
}
