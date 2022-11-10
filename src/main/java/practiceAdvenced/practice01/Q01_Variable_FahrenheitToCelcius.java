package practiceAdvenced.practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_FahrenheitToCelcius {

    public static void main(String[] args) {
        // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
// formül: c = (f-32)*5/9
        Scanner input=new Scanner(System.in);
        System.out.println("fahrenheit değeri giriniz");
double f =input.nextDouble();

        double sonuc=(f-32)*5/9;

        NumberFormat noformat =new DecimalFormat(".00");
        String formatted =noformat.format(sonuc);
        System.out.println(formatted);
        double doublesonuc=Double.valueOf(formatted);
    }
}
