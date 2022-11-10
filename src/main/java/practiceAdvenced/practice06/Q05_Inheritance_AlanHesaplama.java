package practiceAdvenced.practice06;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Q05_Inheritance_AlanHesaplama {
    //kare prizma silindir ve koni hacmini hesapayan bir kod yazınız
    public static void main(String[] args) {
        KarePrizma karePrizma=new KarePrizma();
        double karePrizmahacmi=karePrizma.hacimHesapla(5,6);
        System.out.println("Kare Prizma Hacmi..:"+karePrizmahacmi);

        Koni koni=new Koni();
       double konihacmi= koni.hacimHesapla(3,5);
        NumberFormat obj=new DecimalFormat(".00");
        System.out.println("Koninin hacmi..:"+obj.format(konihacmi));

        Silindir silindir=new Silindir();
        double silindirHacmi=silindir.hacimHesapla(1,5);
        System.out.println("Silindir hacmi..:"+obj.format(silindirHacmi));
    }


}
