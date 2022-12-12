package inheritancepolimorphism;

public class Car {
    public void engine() {
        System.out.println("All cars have engine");
    }
    public Car(){
        System.out.println("car constructor 1");
    }
    public Car (String engineType){
        System.out.println(engineType);
    }
    public Car(int engineSize){
        this("gas");
        System.out.println(engineSize);
    }
    public Car(String engineSize, int enginePrice) {
        this(5000);
        System.out.println(engineSize + " " + enginePrice);
    }
}