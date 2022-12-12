package inheritancepolimorphism;

public class Civic extends Honda {
    public void civic() {
        System.out.println("civic iyi arabadır");
    }
    public Civic() {
        System.out.println("Civic constructor  1");
    }
    public Civic(int year){
        super(true);
        System.out.println(year);
    }
}