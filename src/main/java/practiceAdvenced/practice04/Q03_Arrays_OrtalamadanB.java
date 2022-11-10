package practiceAdvenced.practice04;

public class Q03_Arrays_OrtalamadanB {
    //elementlerin ortalamasından büyük elementleri yazdıran kodu yazınız

    public static void main(String[] args) {
        int arr[]={5,6,8,4,1,5};
        int sum = 0;

        for (int w:arr) {
            sum = sum + w;
        }
            double ort=sum/arr.length;
        System.out.println(ort);
            for (int w:arr){
            if (w>ort){
                System.out.println(w+ " ");
            }
        }

    }
}
