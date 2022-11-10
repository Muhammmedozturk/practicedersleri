package practiceAdvenced.practice5;

public class Q03_ {
    public static void main(String[] args) {
        /*
        //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir method oluşturunuz.
        (Method overloading kullanınız)
         */
        Hacim hacim=new Hacim();
        int karePrizma=hacim.hacimHesapla(5,6)+50;//kare prizmanın hacmi
       int dikdrgnPrizma= hacim.hacimHesapla(5,6,3);//dikdörtgen prizmanın hacmi
        hacim.hacimHesapla(6);
        System.out.println("Kare prizma: "+karePrizma);
        System.out.println("Dikdörtgen Prizma :"+dikdrgnPrizma);
    }
}
