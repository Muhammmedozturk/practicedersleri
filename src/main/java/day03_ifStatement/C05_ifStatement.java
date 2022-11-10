package day03_ifStatement;

import java.util.Scanner;

public class C05_ifStatement {
    //kullanıcıdan alacağınız iki sayıyı yine kullanıcıyaseçtireceğiniz dört işlemden biri
    // ile işleme koyup sonucu yazdır
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("toplama işlemi için 1 e \n çıkarma işlemi için 2 ye \nbölme işlemi için 3 e \n çarpma işlemi için 4 e \n basınıziki sayı giriniz..:");
        int islem = input.nextInt();//kullanıcının işlem tercihi için bir variable oluşturduk
        System.out.println("ik tam sayı giriniz..:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        if (islem == 1) {
            System.out.println("toplama sonucu: "+num1 + num2);

        } else if (islem==2) {
            System.out.println("çıkarma işlemi: "+(num1-num2));
        }else if (islem==3){
            System.out.println("bölme işlemi :"+(num1/num2));
        } else if (islem==4) {
            System.out.println("carpma sonucu: "+(num1*num2));


        }else System.out.println("hatalı giriş yptınız");
        {
        }
    }
}