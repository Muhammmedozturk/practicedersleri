package practiceAdvenced.practice10;

public class Q05_Varargs_Ilki_Haric_Topla {
    /*
Parametrelerinin ilki hariç  karakter sayılarını toplayan ve bu toplamı birinci parametrenin karakter sayısıyla çarpan
bir metod yazınız.
(indeks ve if statement kullanmayınız)
   */
    public static void main(String[] args) {
        myMethod("Ali","Sally","Holly","muhammed","nedim");
    }
    public static void myMethod(String a, String...b ){
        int toplam=0;
        for (String w:b){
            toplam+=w.length();
        }int sonuc=toplam*a.length();
        System.out.println(sonuc);
    }
}
