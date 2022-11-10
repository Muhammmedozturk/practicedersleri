package practiceAdvenced.practice04;

public class Q05_StringBuilderPalindrome {
//bir string değerin palindome olup olmadığını kontrol eden bir kod yazınız

    public static void main(String[] args) {


        String str = "nazan1";
        StringBuilder stb = new StringBuilder(str);
        String stbReverse = stb.reverse().toString();

        if (str.equals(stbReverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Palindrome degil");



            String isim="muhammed";
        String ters="";
        for (int i=isim.length()-1; i>-1;i--){
          ters=ters+isim.charAt(i);


        }


        System.out.println(ters);
        if (isim.equalsIgnoreCase(ters)){
            System.out.println("palindromdur");
        }else System.out.println("palindrom değil");

    }
}}
