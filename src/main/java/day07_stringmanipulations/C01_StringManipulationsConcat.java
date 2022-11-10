package day07_stringmanipulations;

import java.util.Scanner;

public class C01_StringManipulationsConcat {
    
      /*

    ONEMLI NOT=JAVA YUKARIDAN ASAGI ; SOLDAN SAGA CALISIR.

     *

    public static void main(String[] args) {


        System.out.println(15 + 20 + "Merhaba");//35 merhaba
        System.out.println("Merhaba" + 15 + 20);//merhaba 31520
        System.out.println("Merhaba" + (15 + 20))//;merhaba 35
        System.out.println("Merhaba" + 15 * 20);//merhaba 300

        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola kullanici nasil girerse girsin
        //tam isminin buyuk harfle yazilmasini saglayin.
     */
      public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
          System.out.println("isminizi ve soyisminizi giriniz");
          String isim= input.nextLine().toUpperCase();
          String soyisim=input.nextLine().toUpperCase();
          String tamisim=isim.concat(" "+soyisim);
          System.out.println(tamisim);
      }
}
