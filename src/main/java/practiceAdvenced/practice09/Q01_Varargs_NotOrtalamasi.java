package practiceAdvenced.practice09;

import java.util.Scanner;

public class Q01_Varargs_NotOrtalamasi {
    //	4 öğrencinin not ortalamasını sırasıyla 6, 4, 3 ve 5 sınav olacak şekilde hesaplayan bir method yazınız.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
ortalamaHesapla("Ali",96.9,96.7,100,100,96,95);
        ortalamaHesapla("Ayşe",77,88,90,99,100,100);
    }

    public static void ortalamaHesapla(String isim, double...not){
        double toplam=0;
        for (double w:not){
            toplam+=w;
        }
        System.out.println(isim+" 'nin not ortalaması: "+String.format("%.2f",toplam/not.length));
    }
}
