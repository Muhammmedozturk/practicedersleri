package day06_NestedIfSwitch;

import java.util.Scanner;

public class C06_SwitchCase {
    //girilen pozitif 3 basamaklı bir sayıyı yazı ile yazdıran bir kod yazınız
    //ex: 568
    //beşyüzaltmışsekiz
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Pozitif 3 basamaklı sayı giriniz:");
        int sayi= input.nextInt();

        int birlerbas=(sayi%10);
        int onlarbas=(sayi/10)%10;
        int yuzlerBas=(sayi/100);
        if (sayi>99 && sayi<1000){
            switch (yuzlerBas) {
                case 0:
                    System.out.print("0");
                    break;
                case 1:
                    System.out.print("yüz");
                    break;
                case 2:
                    System.out.print("ikiyüz");
                    break;
                case 3:
                    System.out.print("üçyüz");
                    break;
                case 4:
                    System.out.print("dörtyüz");
                    break;
                case 5:
                    System.out.print("beşyüz");
                    break;
                case 6:
                    System.out.print("altıyüz");
                    break;
                case 7:
                    System.out.print("yediyüz");
                    break;
                case 8:
                    System.out.print("sekizyüz");
                    break;
                case 9:
                    System.out.print("dokuzyüz");
                    break;
            }
                    switch (onlarbas) {
                        case 0:
                            System.out.print("");
                            break;
                        case 1:
                            System.out.print("on");
                            break;
                        case 2:
                            System.out.print("yirmi");
                            break;
                        case 3:
                            System.out.print("otuz");
                            break;
                        case 4:
                            System.out.print("kırk");
                            break;
                        case 5:
                            System.out.print("elli");
                            break;
                        case 6:
                            System.out.print("altmış");
                            break;
                        case 7:
                            System.out.print("yetmiş");
                            break;
                        case 8:
                            System.out.print("seksen");
                            break;
                        case 9:
                            System.out.print("doksan");
                            break;
                    }
                    switch (birlerbas){
                        case 0:
                            System.out.print("");
                            break;
                        case 1:
                            System.out.print("bir");
                            break;
                        case 2:
                            System.out.print("iki");
                            break;
                        case 3:
                            System.out.print("üç");
                            break;
                        case 4:
                            System.out.print("dört");
                            break;
                        case 5:
                            System.out.print("beş");
                            break;
                        case 6:
                            System.out.print("altı");
                            break;
                        case 7:
                            System.out.print("yedi");
                            break;
                        case 8:
                            System.out.print("sekiz");
                            break;
                        case 9:
                            System.out.print("dokuz");
                            break;
            }

        }else System.out.println("Lütfen 3 basamaklı bir sayı giriniz");
    }
}
