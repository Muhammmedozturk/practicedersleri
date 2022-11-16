package practiceAdvenced.practice09;

import java.util.HashMap;
import java.util.Map;

public class Q02_Map_UrunFiyatlariniToplaEntrySet {
    /*
    Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
     */
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<String,Double>();
        map.put("Kemer",19.99);
        map.put("Gömlek",29.99);
        map.put("Ayakkabı",89.99);
        map.put("Kazak",24.99);
        map.put("Kravat",19.99);

        System.out.println(fiyatToplami(map));

    }
    public static double fiyatToplami(Map<String,Double> map){
        System.out.println("Ürünler ve fiyatları: "+map);
        double toplam=0;
        for (Map.Entry<String, Double> w:map.entrySet()){
            toplam+=w.getValue();

        }return toplam;
    }
}
