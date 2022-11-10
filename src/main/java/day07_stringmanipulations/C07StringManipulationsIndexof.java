package day07_stringmanipulations;

public class C07StringManipulationsIndexof {

    public static void main(String[] args) {
        //karakter veya karekterlerin ilk görünüm indexini verir
        //lastindexof son görünümdeki indexi verir


        //verilen bir stringteki karakterlerin tekrarlı olup olmadığını bulan kodu yazınız

        String str="Javacancandır";
        char ch='j';
        if (str.indexOf(ch)== str.lastIndexOf(ch)){
            System.out.println("tekrarsız");
        }else System.out.println("tekrarlı");
    }
}
