package practiceAdvenced.practice09.Q04_MaasHesapla;

public class Runner {
    public static void main(String[] args) {
        /*
    Net maaş hesaplayan bir kod yazınız.(Interface kullanınız)
    Maaş kriterleri: Brüt maaş belirle.
                     Çalışanın toplam çalışma yılına göre her yıl için maaşı 100 dolar  artır.
                     Çalışanın aylık çalışma saatine göre 160 saat üstü  her saat için maaşı 10 dolar artır.
                     10 yıl ve üstü çalışma yılı bulunan çalışanların maaşlarından %30, diğerlerinden %20 vergi kesintisi yap.
     */
        MaasHesapla maasHesapla=new MaasHesapla();
        double ali=maasHesapla.netMaas(10000,20,170);
        System.out.println("Alinin maaşı :"+ali);
    }
}
