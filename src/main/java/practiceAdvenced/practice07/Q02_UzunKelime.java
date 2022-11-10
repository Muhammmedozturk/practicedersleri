package practiceAdvenced.practice07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_UzunKelime {
    /*
          Kullanıcıdan alınan cümledeki en uzun kelimeyi(kelimeleri) return eden bir method oluşturunuz.
         */

    public static void main(String[] args) {


        System.out.println(uzunkelime());
        System.out.println(kelimeler());

    }
    public static List<String> uzunkelime(){
        Scanner input=new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
         String cumle= input.nextLine();

        String arr[]=cumle.split(" ");
        int max=0;
        for (String w:arr){
            if(w.length()>max){
                max=w.length();
            }

        }
        List<String> en=new ArrayList<>();
        for (String w:arr){
            if (w.length()==max){
                en.add(w);
            }
        }
        return en;
////////////////////////////////////////////////////////////////////////////

    }

  public static List<String> kelimeler(){
      String kelime="java güzeldir ama çalışırsan";
      String arr1[]=kelime.split(" ");
      int max1=0;
      for (String w:arr1){
          if (w.length()>max1){
              max1=w.length();
          }
      }
      List<String>enx=new ArrayList<>();
      for (String w:arr1){
          if (w.length()==max1){
              enx.add(w);
          }
      }
      return enx;
  }

}
