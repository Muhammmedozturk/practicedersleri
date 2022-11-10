package practiceAdvenced.practice07;

import practiceAdvenced.practice06.Random;

public class Q05_Exception_Throw {
       /*
   rastgeleSayi isminde bir method oluşturunuz.
   Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
   Bu iki random sayının toplamını yazdırın.
   Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
   ("Sayı 12'den küçük ise hata verir") yazdırın.
     */
       public static void main(String[] args) {
           randomsayi();
       }




    public static void randomsayi() {
         int toplam=0;
         while (true){

        int x=(int)(Math.random()*11);
        int y=(int)(Math.random()*11);

        try {
            System.out.println(x+y);
            if (x+y<12){
                throw new Exception();
            }else {
                System.out.println(x+"--+--"+y);
                System.out.println(x+y);
                break;
            }
        }catch (Exception e){
            System.out.println("sayıların toplamı"+(x+y));
            System.out.println("toplam 12 den küçük olamaz");
        }
        }



    }
}