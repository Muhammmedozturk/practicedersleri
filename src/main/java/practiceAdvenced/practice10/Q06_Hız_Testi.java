package practiceAdvenced.practice10;

import java.time.LocalTime;

public class Q06_Hız_Testi {
    //İki java işlemi arasındaki çalışma zamanı farkını gösteren bir kod yazınız.
    public static void main(String[] args) {
        int nano=LocalTime.now().getNano();
        System.out.println(nano);
        int x=0;
        while (x<2000000000){
            int a=1234*1234;
            x++;
        }

        int nano1=LocalTime.now().getNano();
        System.out.println(nano1-nano);
    }
}
