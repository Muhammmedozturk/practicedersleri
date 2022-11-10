package day02_variables;

import java.util.Scanner;

public class C03_Scanner {
    ////Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir
    // program yazdirin
    ////( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Yarıçap giriniz..:");
        double cap= input.nextDouble();
        System.out.println("Çevresi"+2*3.14*cap);
        System.out.println("alanı:"+3.14*cap*cap);
        ////Soru 2 )  Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini isteyip o dikdortgenin alan ve
        //// cevre hesabini yapan bir program yaziniz.
        Scanner input1=new Scanner(System.in);
        System.out.println("uzun kenar:");
        double uk= input.nextDouble();
        System.out.println("Kısa kenar:");
        double kk= input.nextDouble();
        System.out.println("çevre:" +(2*kk+2*uk)+ "alan:" +kk*uk);
////Soru 3) Kenar uzunluklari kullanicidan alinana bir ucgenin cevresini hesaplayan bir program yaziniz.(byte kullanin)
//// Ucgenin cevresi=a+b+c
        Scanner input2=new Scanner(System.in);
        System.out.println("üçgenin kenar uzunluklarını gir");
        byte birk=input2.nextByte();
        byte ikik=input2.nextByte();
        byte uck=input2.nextByte();
        System.out.println("çevresi:"+(ikik+birk+uck));
        //// Soru4)   /*Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturan bir kod yaziniz
        //
        ///*
        //             A
        //            A A
        //           A A A
        //    */
        Scanner input3=new Scanner(System.in);
        System.out.println("bir karekter giriniz:");
        char krk=input3.next().charAt(0);
        System.out.println("  "+krk+"  ");
        System.out.println(" "+krk+" "+krk);
        System.out.println(krk+" "+krk+" "+krk);


    }

}
