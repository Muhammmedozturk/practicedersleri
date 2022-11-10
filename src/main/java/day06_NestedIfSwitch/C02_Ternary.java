package day06_NestedIfSwitch;

import java.util.Scanner;

public class C02_Ternary {
    /*
Kullanicidan Final notunu 'A' ,'B' ,'C' seklinde  girmesini isteyiniz,
'A'  ->  "Cok Basarili"
'B'  ->  "Basarili"
'C'  ->  "Orta"    bu notlar disindakilere de
         Digerleri..
            yazdiriniz.Nested Ternary ile cozunuz
 */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("final notunu giriniz");
        String fnl=input.next();
        String sonuc =(fnl.equalsIgnoreCase("a"))? "çok başarılı" :
        (fnl.equalsIgnoreCase("b")) ? "başarılı" :
        (fnl.equalsIgnoreCase("c")) ? "ortta": "diğerleri";
        System.out.println(sonuc);
    }
}
