package day07_stringmanipulations;

public class C03_StringManipulationsReplace {
    public static void main(String[] args) {
        String str="$45.99";
        System.out.println(str.replaceAll("\\D", ""));//tüm rakam dışı karakterler
        /*

        \\d ==tüm rakamlar
        \\w == tüm büyük harf küçük harf ve rakamları içerir
        \\W == tüm büyük harf küçük harf ve rakamları dışındaki herşey
        \\s  === space tüm boşluklar
        \\S space dışındaki herşey

        */
        //verilen cümleyi * ile gizleyip 10. karakterden sonrasını yazdırın

        String cumle="Her dert java gibi olsa";
        System.out.println(cumle.replaceAll("\\w","*")+cumle.substring(10));

       //a harfini @ ile değiştir
        String ders="olağanustü";
        System.out.println(ders.replace("a","@"));

//replacefirst sadece ilk karakteri değiştirir
        //stringteki bütün a ları e ye değiştirin
        String txt="merhaba dünya";
        System.out.println(txt.replace("a","e"));

        System.out.println(txt.replaceFirst("a","e"));

        //bir dizi kümesini değiştirme
        String str1="Dolma kalem";
        System.out.println(str1.replaceAll("kalem","biber"));


        String str3="merhaba";
        String st="merhaba";

        boolean birebiresitmi=str1.equals("merhaba");
        System.out.println("birebiresitmi=" +birebiresitmi);
        System.out.println(str3.equals(st));
        System.out.println(str3.equals("merhaba"));
        System.out.println(str3.equalsIgnoreCase("MerHabA"));
        System.out.println(str.equalsIgnoreCase("merha"));

    }
}
