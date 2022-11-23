package method;

import java.util.Scanner;

public class soru2 {
    /*
A şehrinden uçmak isteyen bir yolcu
    B şehrine 500km
    C şehrine  700km
    D şehrine  900 km mesafededir.
Bilet tarifesi:
km birim fiyati : 0.10$
yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
12 ve 24 yas arasindaysa 10% indirim,
65 yasindan buyukse 30% indirim,
bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
Kullanici gecerli bir harf girmezse gecerli harf girinceye kadar kullanicidan yeni bir harf isteyin
*/
    static Double biletParasi;
    static Scanner scan;
    static String adsoyad;
    static String sehir;
    public static void main(String[] args) {
        bilgileriniAl();
        sehirsec();
        yasindirimi();
        gidisdonus();
        sonuc();
    }

    private static void sonuc() {
        System.out.println(adsoyad+" bilet alış işleminiz gerçekleşmiştir. Toplam bilet tutarınız"+biletParasi);
    }

    private static void gidisdonus() {
    scan=new Scanner(System.in);
        System.out.println("Gidişiniz tek yönlü ise T çift yönlü ise C harfi giriniz");
        String yon= scan.next().toUpperCase();
        switch (yon){
            case "T":
                System.out.println("tek yön seyahat için indirim yoktur");
                break;
            case "C":
                biletParasi=biletParasi*2;
                biletParasi=biletParasi-(biletParasi*0.20);
                break;
            default:
                System.out.println("lütfen geçerli tercih yapınız");
                gidisdonus();
                break;
        }

    }

    private static void yasindirimi() {
        scan=new Scanner(System.in);
        System.out.println("Yaş ind. kamp. var indirim için yaşınızı giriniz");
        try {
            int yas= scan.nextInt();
            if (yas<12){
                biletParasi=biletParasi-(biletParasi*0.50);
            } else if ( yas<24) {
                biletParasi=biletParasi-(biletParasi*0.10);
            } else if (yas>65) {
                biletParasi=biletParasi-(biletParasi*0.30);
            }else {
                System.out.println("malesef yaşınıza uygun indirim yoktur");
            }
        }catch (Exception e){
            System.out.println("Yas sayısal değer olur");
            yasindirimi();
        }


    }

    private static void sehirsec() {
        scan=new Scanner(System.in);
        System.out.println("A sehrinden hangi şehre uçmak istersiniz");

        sehir=scan.next().toUpperCase();
       switch (sehir){
           case "B":
               biletParasi=500*0.10;
               break;
           case "C":
               biletParasi=700*0.10;
               break;
           case "D":
               biletParasi=900*0.10;
               break;
           default:
               System.out.println("geçersiz sehir girdiniz");
               sehirsec();
               break;
       }
        System.out.println(biletParasi);
    }

    private static void bilgileriniAl() {
        scan=new Scanner(System.in);
        System.out.println("Havaalanımıza hosgeldiniz");
        System.out.println("Lütfen isim soyisim giriniz");

        adsoyad=scan.nextLine();
    }
}
