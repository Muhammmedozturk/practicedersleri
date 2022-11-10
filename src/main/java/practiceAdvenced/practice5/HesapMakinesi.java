package practiceAdvenced.practice5;

public class HesapMakinesi {
    public void toplama(int...a){
        int toplam=0;
        for (int w:a){
            toplam+=w;
        }
        System.out.println("toplam :"+toplam);
    }
    public void cıkarma(int a,int b){
        System.out.println("Fark : "+(a-b));
    }
    public void carpma(int...a){
        int carpım=1;
        for (int w:a){
            carpım=carpım*w;

        }System.out.println("Carpım:"+carpım);
    }
    public void bolme(double a,double b){
      if (b==0){
          System.out.println("bölen sayı 0 olamaz");
      }
        System.out.println("bölüm :"+(a/b));
    }
}
