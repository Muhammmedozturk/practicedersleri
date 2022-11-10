package practiceAdvenced.practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_ListeEkleCıkar {
    /*
Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen,
list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.
 */

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        List<Integer> liste=new ArrayList<>();

        while (true){
            System.out.println("YEkleme yapmak için 'add' \n "+
            "güncelleme yapmak için 'update' \n"+
            "Silmek için 'delete'\n"+
                    "Çıkmak için 'quit' komutunu giriniz");
            String option = input.next();
            if (option.equalsIgnoreCase("add")){
                System.out.println("eklemek istediğiniz sayıyı giriniz");
                int ekleneceksayi=input.nextInt();
                liste.add(ekleneceksayi);
            } else if (option.equalsIgnoreCase("update")) {
                System.out.println("güncelleme yapmak istediğiniz sayıyı giriniz");
                int guncelleneceksayi= input.nextInt();
                System.out.println("girmek istediğiniz yeni sayıyı giriniz");
                int yenisayi= input.nextInt();
                liste.set(liste.indexOf(guncelleneceksayi),yenisayi);

            } else if (option.equalsIgnoreCase("delete")) {
                System.out.println("Silmek istediğiniz elementi giriniz");
                int silinecek= input.nextInt();
                liste.remove(liste.indexOf(silinecek));//list remove((Integer)silinecek) şeklinde değişken objeye dönüştürülerek silinebilir


            } else if (option.equalsIgnoreCase("quit")) {
                break;
            }else System.out.println("geçerli bir komut giriniz");
            System.out.println(liste);
        }



    }
}
