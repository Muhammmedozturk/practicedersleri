package practiceAdvenced.practice10;

public class Q02_Method_faktöriyel {
    public static void main(String[] args) throws Exception {

        System.out.println(faktoriyel(6));
    }


    public static int faktoriyel(int a) throws Exception {
        if (a > 0) {
            if (a == 1) {
                return 1;
            } else {
                return a * faktoriyel(a - 1);
            }
        }else
            throw new Exception("Sayı sıfırdan büyük olmalı");
    }
}