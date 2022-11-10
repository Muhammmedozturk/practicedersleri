package practiceAdvenced.practice02;

public class odev {
    public static void main(String[] args) {
        int[] arr = {4,6,5,-10,8,5,20};
        int istenenToplam=10;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == istenenToplam) {
                    System.out.println(arr[i] + " ile " + arr[j]);
                }
            }
    }
}}
