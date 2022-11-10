package day02_variables;

import java.util.Scanner;

public class besbasamaki {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Beş basamaklı bir sayı giriniz..:");
        int num= input.nextInt();
        int ilkikiRakam=num/1000;
        System.out.println("İlk iki rakam:"+ilkikiRakam);
        int ilkIkiRakamtop=(ilkikiRakam%10)+(ilkikiRakam/20);
        System.out.println("ilk iki sayının toplamı:"+ilkIkiRakamtop);
        int sonIkiRakam= num%100;
        System.out.println("son iki rakam:"+sonIkiRakam);
        int sonIkıToplam=(sonIkiRakam%10)+(sonIkiRakam/10);
        System.out.println("son iki rakam toplam"+sonIkıToplam);
        int toplam=ilkikiRakam+sonIkiRakam;
        System.out.println("toplam:"+toplam);
    }
}
