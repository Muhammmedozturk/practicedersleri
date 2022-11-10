package day07_stringmanipulations;

public class C08_StringManipulations {
    //Soru 1) Kullanicidan email adresini girmesini isteyin,
// mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
// @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
// @gmail.com ile bitmiyorsa "lutfen yazimı kontrol edin" yazdırın

    public static void main(String[] args) {
        String mail="muhammd@gmail.co";
        if (!mail.contains("@gmail.com")){
            System.out.println("Lütfen gmail adresinizi giriniz");
        } else if (mail.endsWith("@gmail.com")) {
            System.out.println("e mail adresiniz kaydedildi");

        }else System.out.println("yazımınızı kontrol ediniz");
    }
}
