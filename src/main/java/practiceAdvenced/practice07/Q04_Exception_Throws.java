package practiceAdvenced.practice07;

public class Q04_Exception_Throws {
    /*
   randomSayi isminde bir method oluşturunuz.
   Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
   Bu iki random sayının toplamını yazdırın.
   Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
   ("Sayı 12'den küçük ise hata verir") yazdırın.
     */
    public static void main(String[] args) throws Exception {

randomsayi();


    }
    public static void randomsayi() throws Exception {
        int x=(int)(Math.random()*11);
        int y=(int)(Math.random()*11);
        System.out.println(x+y);
        if (x+y<12){
            throw new Exception("sayi 12 den küçük olamaz");
        }

    }

}
