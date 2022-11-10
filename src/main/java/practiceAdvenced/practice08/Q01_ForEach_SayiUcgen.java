package practiceAdvenced.practice08;

import java.util.Scanner;

public class Q01_ForEach_SayiUcgen {

    /*
             Alttaki şekli veren bir kod yazınız:
                  1 2 3 4 5 6
                   2 3 4 5 6
                    3 4 5 6
                     4 5 6
                      5 6
                       6
         */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("satır sayısınu giriniz");
        int satir= input.nextInt();



        for (int i=1;i<=satir;i++){

            for (int bosluk=1;bosluk<i;bosluk++){
                System.out.print(" ");

            }
            for (int sayi=i;sayi<=satir;sayi++){
                System.out.print(sayi+" ");
            }
            System.out.println();
        }

    }
}
