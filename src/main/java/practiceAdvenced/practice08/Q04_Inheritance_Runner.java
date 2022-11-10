package practiceAdvenced.practice08;

public class Q04_Inheritance_Runner {
    public static void main(String[] args) {
        B obj=new B();
        obj.i=0;//0
        System.out.println(obj.i);//1

        A obj1=new A();
        obj1.yazdir();

        A obj2=new B();
        System.out.println(obj2.j);
    }

}
