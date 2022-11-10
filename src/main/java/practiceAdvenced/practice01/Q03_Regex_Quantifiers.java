package practiceAdvenced.practice01;

public class Q03_Regex_Quantifiers {
    public static void main(String[] args) {
        //Bir String değerin belirli sayıda karakter içerip belirli bir karakter
        // ile bitip bitmediğini kontrol eden bir kod yazınız.
        String str="as";
        System.out.println(str.matches(".s"));//herhangi bir karakter ile başlayıp s ile bitiyor==true
//matches metodu regex ile çalışıp String değeri regex ile karşılaştırmasını yapar


        //Bir String değerin ikinci karakterinin belirli bir karakter olup olmadığını kontrol eden bir kod yazınız.
String str1="daha";
        System.out.println(str1.matches(".a.*"));//(.*) nokta ve yıldızdan sonra istediğin karakter olabilr

        //bir string değerin sadece harf içerip içermediğini kontrol eden kod yazınız
        System.out.println("abc".matches("[a-zA-Z]*"));//harf içeriyorsa true verir


        //bir string değerin belirli bir sayıda belirli karakterleri içerdiğini kontrol eden bir kod yazınız
        System.out.println("abcdhd".matches("[a-zA-Z]{5}"));//5 ten fazla ve az olanlarda false verir

        //Bir String değerin belirli karakterleri en az belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("12345".matches("[0-9]{6,}"));

        ///Bir String değerin belirli karakterleri en az ve en çok belirli sayıda içerip içermediğini
        // kontrol eden bir kod yazınız.
        System.out.println("lkjuhgdd".matches("\\w{7,10}")); // w={a-zA-Z0-9}

        // ilk karakter 1, ikinci karekter noktalama işareti ve kalan 8 karakter rakam toplam 10 karakter olmali,
        System.out.println("1.??564855".matches("[1][\\p{Punct}][0-9]{8}"));//birinci karakter 1 ikinci karakter
        //noktalama işareti 3 tane noktalama işareti ve kalan 8 tane de rakam olacak şekilde

    }

}
