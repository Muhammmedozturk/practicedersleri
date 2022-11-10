package day02_variables;

import java.util.Scanner;

public class sifreOrnegi {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Şifrenizi giriniz");
        String sifre = input.nextLine();

        //koşul4) Şifre en az 5, en fazla 8 karakter olmalı ("Eksiz veya fazla karakter girdiniz")
        boolean kosul4 = sifre.length() > 4 && sifre.length() < 9;

        //Koşul1) Şifre büyük harf ile başlamak zorunda ("İlk karakter büyük harf olmak zorunda")
        boolean kosul1 = sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z';

        //Koşul2) Şifrede sadece bir tane harf karakteri olmak zorunda ("Şifrede sadece 1 tane harf olmak zorunda")
        boolean kosul2 = sifre.replaceAll("[^a-zA-Z]", "").length() == 1;

        //koşul3) Şifre "space" karakteri içermemeli ("Şifre boşluk karakteri içermemeli")
        boolean kosul3 = sifre.replaceAll("[^ ]", "").length() == 0;

        boolean gecerliSifre = kosul1 && kosul2 && kosul3 && kosul4;

        if (gecerliSifre){
            System.out.println("Başarılı Şifre");
        }else{
            System.out.println("İlk karakter büyük harf olmak zorunda\n" +
                    "Şifrede sadece 1 tane harf olmak zorunda\n" +
                    "Şifre boşluk karakteri içermemeli\n" +
                    "Eksiz veya fazla karakter girdiniz\n" +
                    "Lütfen tekrar deneyiniz...");
        }

    }

}

