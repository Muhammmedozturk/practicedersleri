package day04_ifStatement;

public class C02_İfStatement {
    public static void main(String[] args) {
        int not=23;
        if (not>=90 && not<=100){
            System.out.println("Çok iyi not A");
        } else if (not>=80 && not<=90) {
            System.out.println("Not B iyi");
        }else if (not>=70 && not<=80) {
            System.out.println("Not C ota");
        }else if (not>=60 && not<=70) {
            System.out.println("Not D geçer");
        }else if (not>=0 && not<=60) {
            System.out.println("Not F zayıf");
        }
    }
}
