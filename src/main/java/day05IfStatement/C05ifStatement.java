package day05IfStatement;

import java.util.Scanner;

public class C05ifStatement {
    //kullanıcıdan iki sayı alınız küçük sayıyı yazdırın
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz:");
        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();

        System.out.println(sayi1==sayi2  ? "Sayilar Esit " : sayi1> sayi2 ? sayi2 : sayi1);
    }
    }

