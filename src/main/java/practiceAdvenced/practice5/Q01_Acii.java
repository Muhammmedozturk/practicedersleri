package practiceAdvenced.practice5;

import java.util.Scanner;

public class Q01_Acii {
    //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ilk karakteri girin");
        char ilk= input.next().charAt(0);
        System.out.println("ikinci karakteri gir");
        char son= input.next().charAt(0);

        int ilki=Math.min(ilk,son);
        int ikin=Math.max(ilk,son);

        for (int i=ilki; i<ikin; i++){
            System.out.print((char)i+"- ");//type casting yaparak ascii değeri int i değerini chara çevirdik

        }


    }
}
