package day03_ifStatement;

public class C04_MantıkOperatorleri {

    //&& ile & arasındaki far iki && ile bulduğu ilk durumda cvp verir ancak tek & bütün satırı kontrol eder
//sonuç arasında fark yok sadece biri ilk hatayı bulunca duru diğeri sonuna kadar gider
    public static void main(String[] args) {
        System.out.println(5+2==8);
        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println(sonuc1);
        boolean sonuc2=5>4 && 7>9 && 6+3==9 && 5+2!=9;

        int sayi1=15;//java 3 lü karşılaştırma yapmaz ikili karşılaştırmlar yapıp mantıksal öperotörlerle birleştirmeliyiz
        System.out.println(10<sayi1 && sayi1>20);

        int sayi2=5;
        System.out.println(sayi2<10 || sayi2<20);//sayının 10 ile 20 arasında olmadığını gösteren kodu yaz

    }
}
