package practiceAdvenced.practice02;

import java.util.Scanner;

public class Q02_For_Continue {
    public static void main(String[] args) {
        // kullanıcıdan 5 adet sayı giriniz
        //bu sayılardan 5 ile 10 arasındakiler hariç diğerlerinin toplamını bulunuz
        Scanner input=new Scanner(System.in);
   int toplam=0;
        for (int i=0;i<5;i++){
            System.out.println("1 adet sayı giriniz");
            int s1= input.nextInt();

            if (s1>5 && s1<10){
                System.out.println("işleme alınmayacak");
                continue;

            } toplam+=s1;

        }
        System.out.println(toplam);
    }
}
