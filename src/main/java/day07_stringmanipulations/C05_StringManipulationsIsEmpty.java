package day07_stringmanipulations;

import java.util.Scanner;

public class C05_StringManipulationsIsEmpty {


    public static void main(String[] args) {
        String str="Hi";
        System.out.println(str.isEmpty());

        String str1=" ";
        System.out.println(str1.isEmpty());

        //kullanıcıdan alacagınız bir stringte boşluk olup olmadığını kontrol ediniz
        Scanner input=new Scanner(System.in);
        System.out.println("bir ifade giriniz");
        String ifade = input.nextLine();
        if (ifade.isEmpty()){
            System.out.println("hiç bir şey girmediniz");
        }else System.out.println("tebrikler girebildiniz");
    }
}
