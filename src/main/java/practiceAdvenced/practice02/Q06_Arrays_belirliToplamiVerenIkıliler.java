package practiceAdvenced.practice02;

public class Q06_Arrays_belirliToplamiVerenIkıliler {
    /*
    Toplamları, verilen bir sayıya eşit olan  Array element çiflerini yazdıran bir method oluşturunuz.
     {4,6,5,-10,8,5,20} ===> 10
     4 + 6 = 10
     5 + 5 = 10
    -10 + 20 = 10
    int[] arr = {4,6,5,-10,8,5,20};
for (int i = 0; i < arr.length; i++) {

    for (int j = i + 1; j < arr.length; j++) {

        if (arr[i] + arr[j] == istenenToplam) {
            System.out.println(arr[i] + " ile " + arr[j]);
        }
    }
     */
    public static void main(String[] args) {
//        int istenenToplam=10;
//        int[] arr = {4,6,5,-10,8,5,20};
//        for (int i=0;i<arr.length;i++){
//            for (int k=i+1;k<arr.length;i++){
//                if (istenenToplam==arr[k]+arr[i]){
//                    System.out.println(arr[i] + " ile " + arr[k]);
//                }
//            }
        int[] arr = {4,6,5,-10,8,5,20};
        ikililerBul(arr,-6);
        }

public static void ikililerBul(int[] arr, int a){
        for (int i=0; i<arr.length;i++){
            for (int k=i+1;k<arr.length;k++){
                if (arr[i] + arr[k]==a) {
                    System.out.println(arr[i]+" + "+arr[k]+" "+a);
                }
            }
        }

    }















}
