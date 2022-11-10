package day06_NestedIfSwitch;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        /*
Kullanicidan Final notunu 'A' ,'B' ,'C' seklinde  girmesini isteyiniz,
'A'  ->  "Cok Basarili"
'B'  ->  "Basarili"
'C'  ->  "Orta"    bu notlar disindakilere de
         Digerleri..
            yazdiriniz.Nested Ternary ile cozunuz
 */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen harflerden birini giriniz : A  B   C" );
        char harf=input.next().toUpperCase().charAt(0);
        switch (harf){
            case  'A':
                System.out.println("Java Kolay");
                break;
            case  'B':
                System.out.println("Java eğlenceli");
                break;
            case  'C':
                System.out.println("Çalışmalıyım");
                break;
            default:
                System.out.println("Kütfen geçerli bir harf giriniz");
        }
    }
}
