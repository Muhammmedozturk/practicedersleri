package day06_NestedIfSwitch;

import java.util.Scanner;

public class C01_Ternary {
    /*
    Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
    Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
 3 basamaklı degilse çift olup olmadigini kontrol edin.
    Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
    Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sıfırdan büyük pozitif bir tamsayı giriniz...:");
        int sayi= input.nextInt();


        String sonuc=(sayi>0 ) ? (sayi>99 && sayi<1000)? "3 basamaklı sıfırdan büyük sayı":
        sayi%2==0 ? "3 basamaklı çift sayı": "3 basamaklı olmayan teksayı" : "lütfen sıfırdan büyük sayı gir";
        System.out.println(sonuc);


        //2.yol
        if (sayi>0){
            if (sayi>99 && sayi<1000){
                System.out.println("3 basamaklı pozitif sayı");
            } else if (sayi%2==0) {
                System.out.println("3 basamaklı olmayan çift sayı");

            }else System.out.println("3 basamaklı olmayan tek sayı");
        }else System.out.println("lütfen sıfırdan büyük pozitif bir tamsayı giriniz");

    }
}
