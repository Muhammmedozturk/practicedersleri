package day06_NestedIfSwitch;

import java.util.Scanner;

public class C04_SwitchCase {
    // Kullanıcının yasadıgı güne  göre;
// Kullanicinin verecegi gun kadar sonraki günun  hangi gün olduğunu yazdırınız.
// pazartesi hafta başlangıcı
//BulunanGun = (kacGunSonrasi + kacıncıGun) % 7;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Pazartesi  : 1 Salı : 2  Çarşamba 3  Perşembe 4  Cuma : 5  Cumartesi : 6 Pazar 7 Haftanın kaçıncı gününde olduğunuzu giriniz:");
        int kacinciGun= input.nextInt();
        if (kacinciGun<=0 || kacinciGun>7) {
            System.out.println("hatalı veri girdiniz");
        }else {
            System.out.println("kaç gün sonrasını bilmek istiyorsunuz");
            int kacgunsonrasi=input.nextInt();
            int bulunangun=(kacgunsonrasi+kacinciGun)%7;

            switch (bulunangun){
                case 1:
                    System.out.println(kacgunsonrasi+ " gün sonra günlerden Pazartesi");
                    break;
                case 2:
                    System.out.println(kacgunsonrasi+ " gün sonra günlerden Salı");
                    break;
                case 3:
                    System.out.println(kacgunsonrasi+ " gün sonra günlerden Çarşamba");
                    break;
                case 4:
                    System.out.println(kacgunsonrasi+ " gün sonra günlerden Perşembe");
                    break;
                case 5:
                    System.out.println(kacgunsonrasi+ " gün sonra günlerden Cuma");
                    break;
                case 6:
                    System.out.println(kacgunsonrasi+ " gün sonra günlerden Cumarrtesi");
                    break;
                case 0:
                    System.out.println(kacgunsonrasi+ " gün sonra günlerden Pazar");
                    break;
                default:
                    System.out.println("geçerli bir değer giriniz");
            }
        }
    }

}
