package practiceAdvenced.practice5;

import java.util.Scanner;

public class Q02_NestedFor_Ucgen {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("satır sayısını giriniz:");
        int satir= input.nextInt();
        for (int i=0; i<satir;i++){//satır kontrolü
            for (int bosluk=satir-i;bosluk>1; bosluk--){//en üstten itibaren boşlukları yazdırı
                System.out.print(" ");

            }
            for (int yildiz=0; yildiz<=i;yildiz++){//boşluk bıraktıktan sonraki yıldızları ekler
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
