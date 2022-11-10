package day04_ifStatement;

import java.util.Scanner;

public class C01_ifStatement {
    public static void main(String[] args) {
        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         *
         * INPUT  ==>  OUTPUT
         *  Y     ==>   YES ;
         *  N     ==>   NO
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Y/N birini giriniz..:");
      char yes=input.next().charAt(0);
      if (yes=='y' || yes=='Y'){
          System.out.println("yes");
      } else if (yes=='n' || yes=='N') {
          System.out.println("No");

      }else {
          System.out.println("Y veya N giriniz");
      }








    }
}
