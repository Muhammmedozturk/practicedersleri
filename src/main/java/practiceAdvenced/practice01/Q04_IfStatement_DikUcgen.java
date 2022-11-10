package practiceAdvenced.practice01;

import java.util.Scanner;

public class Q04_IfStatement_DikUcgen {
    public static void main(String[] args) {
        /*
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)
        Örnek Ekran Çıktısı:
        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
        Bu bir dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("birinci kenarı giriniz:");
        int bir= input.nextInt();
        System.out.println("birinci kenarı giriniz:");
        int iki= input.nextInt();
        System.out.println("birinci kenarı giriniz:");
        int uc= input.nextInt();
        if ((bir*bir)+ (iki*iki)==uc*uc){
            System.out.println("dik üçgen");
        } else if ((bir*bir)+ (uc*uc)==iki*iki) {
            System.out.println("dik ücgen");

        } else if ((iki*iki)+ (uc*uc)==bir*bir) {
            System.out.println("dik ucgen");
        }else
            System.out.println("dik ucgen değil");

    }
}
