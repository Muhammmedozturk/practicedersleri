package practiceAdvenced.practice06;

import java.util.Scanner;

public class Q02_RastgeleSifreOlusturma {
    /*
    //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("karakter sayısı giriniz:");
        int sayi= input.nextInt();
        String sifre="";
        String karakterler="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int maxIndex=karakterler.length();
        int sayac=0;
        while (sayac<sayi){
            int rastgeleindex=(int)(Math.random()*maxIndex);
            sifre+=(karakterler.charAt(rastgeleindex));
            sayac++;
        }
        System.out.println("sifre :"+sifre);
    }
}
