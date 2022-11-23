package method;

import java.util.HashSet;

public class soru1 {
    /*
    Main method altinda bir double hashSet olusturunuz.
    ve bu seti, adi setOlustur ve return tipi hashSet double olan
    ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.
    Adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul edecek ayri bir method olusturarak
    hashSetin degerlerinin toplamini alacaksiniz.
    Çıktı--> sonuc = 44.69
     */
    public static void main(String[] args) {
        HashSet<Double>numara=new HashSet<>();
        setOlustur(numara);
        toplaminial(numara);
    }

    private static void toplaminial(HashSet<Double> numara) {
        double toplam=0;
        for (Double w:numara){
            toplam=toplam+w;
        }
        System.out.println(toplam);
    }

    private static HashSet<Double> setOlustur(HashSet<Double> numara) {
        numara.add(3.23);
        numara.add(3.10);
        numara.add(5.12);
        numara.add(10.12);
        numara.add(23.12);
        return numara;
    }
}
