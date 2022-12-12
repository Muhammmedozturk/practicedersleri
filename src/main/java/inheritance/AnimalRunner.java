package inheritance;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.eat();
        c1.drink();
        c1.meav();
        Dog d1=new Dog();
        d1.eat();
        d1.drink();
        Bird b1=new Bird();
        b1.eat();
        b1.eat();

        /*
        1)we use inheritance
            i)to prevent repitition
            ii)make manintenance easy
            iii)to make our classes atomic
        2) to make a class child of another class we use extend keyword
        3)child classes can use class members from the parent class
        however parent class can not use anything from the child classes
        4)every class in java has at least one parent class which is object class
        5)inheritance types in java
            i)multilevel inheritabce (like apatrment)
            ii)Hierarchical inheritance
            iii)Multiple inheritance(java does not support it)
            iiii)single inheritance
         */
    }
}
