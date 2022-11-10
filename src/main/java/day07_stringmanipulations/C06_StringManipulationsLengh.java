package day07_stringmanipulations;

public class C06_StringManipulationsLengh {
    //length stringin uzunluğunu verir
    //bütün karakterlerin adedi (boşluklar da birer karakterdir)
    public static void main(String[] args) {
        String cumle="Bugün hava yağmurlu";
        System.out.println(cumle.length());
//isim ve soyismi uzunluklar açısından karşşılaştırma
        String isim="Muhmed";
        String soy="Öztürk";
        if (isim.length()>soy.length()){
            System.out.println("isim daha uzun");
        } else if (isim.length()<soy.length()) {
            System.out.println("soyisim uzun");

        }else System.out.println("uzunluklar aynı");

        //Kullanıcıdan 4 harfli bir kelime girin ve girilen kelimeyi tersten yazdırın
        String kelime="jva";
        String ters="";
        if (kelime.length()==4){
            char bir=kelime.charAt(0);
            char iki=kelime.charAt(1);
            char uc=kelime.charAt(2);
            char dort=kelime.charAt(3);
            System.out.println(""+dort+uc+iki+bir);
        } else if (kelime.length()>4) {
            System.out.println("kelime çok uzun");
        }else System.out.println("4 karakterli kelime gir");


    }
}
