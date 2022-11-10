package practiceAdvenced.practice04;

public class Q06_StaticButce_Runner {
    //Basit bir ev bütçesi kodu yazınız

    public static void main(String[] args) {
    Butce baba=new Butce();
        System.out.println("Maaş öncesi "+Butce.butce);
    baba.maasAl(5000);
        System.out.println("Maaş öncesi "+Butce.butce);
        System.out.println("Babanın harclığı :"+baba.harclık);
        baba.harclıkAl(500);
        System.out.println(Butce.butce);

        baba.harclıkHarca(266);
        baba.butcedenHarca(1000);


        System.out.println(Butce.butce);
        System.out.println(baba.harclık);
        System.out.println("Baba harclık :"+baba.harclık);

        Butce anne=new Butce();
        anne.maasAl(2000);
        anne.maasAl(3000);

        anne.harclıkAl(2000);
        anne.harclıkHarca(300);

        Butce kız=new Butce();
        kız.harclıkAl(500);
        kız.harclıkHarca(275);


        System.out.println(Butce.butce);
        System.out.println(anne.harclık);

    }
}
