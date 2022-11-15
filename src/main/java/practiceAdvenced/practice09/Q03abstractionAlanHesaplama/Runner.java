package practiceAdvenced.practice09.Q03abstractionAlanHesaplama;

public class Runner {
    //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)

    public static void main(String[] args) {
        Ucgen ucgen=new Ucgen();
        System.out.println(ucgen.alanHesapla(4, 6));
        Dikdortgen dikdortgen=new Dikdortgen();
        System.out.println(dikdortgen.alanHesapla(5, 8));
    }
}
