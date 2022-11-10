package practiceAdvenced.practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q02_MarketGunlukGelir {
    /*
      Günlük gelir market programı yazınız.
     -Tüm günlerin gelirlerini gösteren bir method,
     -Haftalık gelir ortalamasını gösteren bir method,
     -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,
     */

    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe",
            "Cuma", "Cumartesi", "Pazar"));
    static List<Double> gunlukGelir = new ArrayList<>();

    static double toplamGelir = 0;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int gun = 0;
        while (gun < 7) {
            System.out.println(gunler.get(0) + " Gelirini giriniz");
            double gununGeliri = input.nextDouble();
            gunlukGelir.add(gununGeliri);
            toplamGelir += gununGeliri;

            gun++;

        }
        System.out.println(gunlukGelir);
        System.out.println("Toplam gelir :"+toplamGelir);
        System.out.println("Gelir ortalaması: " + gelirortalamasi());
        System.out.println("ortalama ustü günler :" + ortalamaUstuGunler());
        System.out.println("ortalama altı günler :" +ortalamaaltıGunler());

    }

    static double gelirortalamasi() {
        return toplamGelir / 7;
    }

    static String ortalamaUstuGunler() {
        String str = "";
        for (int i = 0; i < gunlukGelir.size(); i++) {
            if (gunlukGelir.get(i) > gelirortalamasi()) {
                str += gunler.get(i) + " ";
            }
        }
        return str;
    }

    static String ortalamaaltıGunler() {
        String str = "";
        for (int i = 0; i < gunlukGelir.size(); i++) {
            if (gunlukGelir.get(i) < gelirortalamasi()) {
                str += gunler.get(i) + " ";
            }
        }
        return str;
    }
}