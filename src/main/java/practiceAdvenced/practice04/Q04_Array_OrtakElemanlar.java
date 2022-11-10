package practiceAdvenced.practice04;

import java.util.ArrayList;
import java.util.List;

public class Q04_Array_OrtakElemanlar {
    /*
     * İki Array'de ortak bulunan elementleri yazdırınız.
     * (case sensitivity olmadan)

     * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}

     * Output : [brad,sofia,emily]
     */
    public static void main(String[] args) {
        String [] Input1 = {"John","Brad","Angel","Sofia","Emily"};
        String []Input2 = {"sofia","brad","grace","emily","hazel"};
        List<String> list=new ArrayList<>();
        for (String w:Input1){
            for (String x:Input2){
                if (w.equalsIgnoreCase(x)){
                    list.add(w);
                }
            }
        }
        System.out.println("ortak elementler :"+list);
    }
}
