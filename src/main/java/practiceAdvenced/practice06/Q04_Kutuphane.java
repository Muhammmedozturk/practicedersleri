package practiceAdvenced.practice06;

public class Q04_Kutuphane {
    /*
    //Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı, sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.
     */

    public static void main(String[] args) {
        Kitap kitap1=new Kitap("Herry Potter", "jk rowling" ,500);
        kitap1.kitapbilgileri();
        new Kitap("1984", "George Orwell",352).kitapbilgileri();



    }
}