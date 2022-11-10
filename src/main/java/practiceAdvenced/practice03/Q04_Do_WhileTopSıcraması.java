package practiceAdvenced.practice03;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Q04_Do_WhileTopSıcraması {
    /*
 Bir top belirli yükseklikten atılmaktadır.
 Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
 Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
 Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
 */
    public static void main(String[] args) {
       double yukseklik=2;
        int counter=0;
        double toplyol=0;
        do {
            counter++;
           toplyol+= yukseklik;
           yukseklik=yukseklik*0.75;
           toplyol+=yukseklik;


        }while (yukseklik>1);
        System.out.println("yere vurma sayısı :"+counter);
        System.out.println("Alınan yol :"+toplyol);
        NumberFormat format=new DecimalFormat(".##");
        System.out.println(format.format(toplyol));
    }
}
