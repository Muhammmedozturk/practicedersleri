package day03_ifStatement;

public class C02_AsciiDegerleri {
    public static void main(String[] args) {
        char harf = 'a';
        char harf2 = 'A';
        System.out.println("harf>harf2==>" + (harf > harf2));//true karşılaştırma işlemlerinin sonucunu true yada false döner

        //herhangi bir char variablenin ascii değerlerini kod yaarak bulunuz
        //1.yol
        char space = ' ';
        System.out.println("Spacenin ascii değer:" + (space + 0));//32 spacenin ascii değerini hesaplamak için
        // toplamaya etkisi olmayan 0 ı seçeriz böylece yazdırdığımız değer bize spacenin ascii değerini verir
        char m = 'm';
        System.out.println("m nin ascii değeri:" + (m + 0));
        //2. yol
        int harf3 = 'm';
        System.out.println("m nin ascii değeri:" + (harf3));//char larda java char karektere int te atayabilirim.
        //çünkü charın bir resim karekteri birde sayısal değeri vardır. bu nedenle asciideğerlerini hesaplayabiliriz
        byte b1=12;
        byte b2=-125;
        System.out.println("b1>b2==>"+(b1>b2));

        float f1=2.4564f;
        float f2=5.86786f;
        System.out.println(" b1>f1 ==>"+(b1>f1));

        long lng1=5456456664L;
        System.out.println("b1<lng1==>"+(b1>lng1));
        char ch='h';
        System.out.println("b1>ch .00>"+(b1>ch));//kıyaslamalar her zaman boolean sonuç döndürür

    }

}

