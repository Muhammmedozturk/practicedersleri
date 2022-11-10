package day05IfStatement;

import java.util.Scanner;

public class C02IfStatement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz..:");
        int yas= input.nextInt();
    if (yas>=65){
        System.out.println("emekli olabilirsin");

    }else {
        System.out.println("emekli olamazsın");
        System.out.println(65-yas+ " sene daha çalışmalısın");
    }

    if (yas>=0){
        if (yas>65){
            System.out.println("emekliolabilirsin");
        }else {
            System.out.println("emekli olamazsın");
            System.out.println(65-yas + " sene daha çalışmalısın");
        }
    }
    }
}
