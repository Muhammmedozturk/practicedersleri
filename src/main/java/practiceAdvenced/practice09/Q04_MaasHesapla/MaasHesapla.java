package practiceAdvenced.practice09.Q04_MaasHesapla;

public class MaasHesapla implements MaasArttır, Vergi{
    @Override
    public double yillikExtre(int calismaYili) {
        System.out.println("Yıllık ekstra :"+calismaYili*100);
        return calismaYili*100;
    }

    @Override
    public double saatlikEkstre(int saat) {
        if (saat-160>0){
            return (saat-160)*10;
        }else return 0;

    }

    @Override
    public double vergi(double brutMaas, int calismaYili) {
        if (calismaYili>=10){
            return  brutMaas*30/100;
        }else {
            return brutMaas*20/100;
        }

    }
    public double netMaas(double brutMaas, int calismaYili, int saat){
        return brutMaas+yillikExtre(calismaYili)+saatlikEkstre(saat)-vergi(brutMaas, calismaYili);
    }
}
