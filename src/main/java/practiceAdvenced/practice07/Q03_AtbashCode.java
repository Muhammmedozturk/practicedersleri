package practiceAdvenced.practice07;

import java.util.Scanner;

public class Q03_AtbashCode {
    /*
      Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.
      Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
      Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
      Örn: A-->Z, B-->Y ...
      "abcdefghijklmnopqrstuvwxyz";
      "zyxwvutsrqponmlkjihgfedcba";
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime= input.next();

       String str= "abcdefghijklmnopqrstuvwxyz";
        String str1="zyxwvutsrqponmlkjihgfedcba";

        for (int i=0;i<kelime.length();i++){
            for (int j=0; j<str.length();j++){
                if (kelime.charAt(i)==str.charAt(j)){
                    System.out.print(str1.charAt(j));
                }
            }
        }
        //2.yol
        System.out.println("Bir kelime giriniz");
        String kelime1= input.next();//burada girilen kelimenin ilk karakteri z den çıkarılıp a ya eklenince ...
        for (int i=0; i<kelime1.length();i++){
            int indexes='z'-kelime1.charAt(i);
            System.out.print((char)('a'+indexes));
        }























    String kelime2="Ali";
        String st="abcdefghijklmnopqrstuvwxyz";
                String st2="zyxwvutsrqponmlkjihgfedcba";
                for (int i=0; i<kelime2.length();i++){
                    for (int j=0;j<st.length();j++){
                        if (kelime2.charAt(i)==st.charAt(j)){
                            System.out.print(st2.charAt(j));
                        }
                    }
                }

         }
















    }

