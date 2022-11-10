package practiceAdvenced.practice03;

import java.util.Arrays;

public class Q03_Arrays {
    /*
    Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri bulan bir kod yazınız.

            input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
    output: min:-90, max:10001, secMax: 8787
     */
    public static void main(String[] args) {
        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int min=arr[0];
        int max=arr[arr.length-1];
        int maxx=arr[arr.length-2];
        System.out.println("ikinci büyük "+maxx+" en büyük değer "+max+" en küçük değer "+min);
        //2. yol
        int mini=arr[0];
        int secondm=arr[0];
        int maxi=arr[0];
        for (int w:arr){
            if (w<mini){
                mini=w;
            }else if (w>maxi){
                secondm=maxi;
                maxi=w;
            }else if(w>secondm){
                secondm=w;

            }

        }System.out.println("En küçük sayı "+mini);
        System.out.println("En büyük sayı "+maxi);
        System.out.println("En büyük sayı "+secondm);


    }

}
