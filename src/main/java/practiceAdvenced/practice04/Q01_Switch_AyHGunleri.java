package practiceAdvenced.practice04;

import java.util.Scanner;

public class Q01_Switch_AyHGunleri {
     /*

Girilen yil ve ay numarasına göre ayin kaç gün olduğunu yazdiran bir kod yazınız.
    Girdi yıl: 2000 ay: 2
    Çıktı: 29

*/
     public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
         System.out.println("Yılı Giriniz:");
         int year=input.nextInt();
         System.out.println("Ay numarasını giriniz:");
         int month= input.nextInt();
         int gun;
         switch (month){
             case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                 gun=31;
                 System.out.println("Girdiğiniz ayın gün sayısı: " +gun);
                 break;
             case 4:case 9:case 6:case 11:
                 gun=30;
                 System.out.println("Girdiğiniz ayın gün sayısı: " +gun);
             case 2:
                 if((year%4==0 && year%100!=0)|| (year%400==0)){
                     gun=29;
                     System.out.println("Girdiğiniz ayın gün sayısı: " +gun);

                 }else
                     gun=28;
                     System.out.println("Girdiğiniz ayın gün sayısı: " +gun);
          break;
             default:
                 System.out.println("geçerli bir ay numarası giriniz" );
         }



     }
}
