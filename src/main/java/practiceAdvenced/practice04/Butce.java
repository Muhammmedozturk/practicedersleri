package practiceAdvenced.practice04;

public class Butce {

   public static int butce;
   public int harclık;
   public void harclıkAl(int alınanHarclık){
       harclık+=alınanHarclık;
       butce=butce-alınanHarclık;
   }
   public void butcedenHarca(int harcanacakmiktar){
       butce=butce-harcanacakmiktar;
   }
   public void harclıkHarca(int harclıkHarcamasi){
       harclık=harclık-harclıkHarcamasi;
   }
   public void maasAl(int alinanMaas){
       butce=butce+alinanMaas;
   }
}
