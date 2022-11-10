package practiceAdvenced.practice06;

import java.util.Scanner;

public class Q01_RastgeleSayiMatriksi {
    /*
    Kullanıcıdan aldığımız bir sayyı kadar satır ve sutun sayısına sahip alttaki rstgele 0 ve 1 lerden oluşan matriksi yazdırın
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi= input.nextInt();

        for (int i=0; i<sayi;i++){
            for (int j=0; j<sayi;j++){
                System.out.print((int)(Math.random()  * 2)+" ");
            }
            System.out.println();
        }

    }
}
