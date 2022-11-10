package day07_stringmanipulations;

public class C02_StringManipulationsSubstring {
    //stringin ortasından bir parça almaya yarar
    //veya verilen indexten sonrasını alır
    public static void main(String[] args) {
        String cumle="Her dert java gibi olsa";
        System.out.println(cumle.substring(10));//10.karakterden sonra al
        System.out.println(cumle.substring(14));//14. karakterden sonuna kadar al
        System.out.println(cumle.substring(0,10));//0 ile 10. karakter arasını alır
        System.out.println(cumle.substring(11));//11. karakkterden sonra al
    }
}
