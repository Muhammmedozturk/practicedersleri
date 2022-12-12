package inheritancepolimorphism;

public class Honda extends Car {
    public void hondamake() {
        System.out.println("made in honda");

    }

    public Honda() {
        System.out.println("Honda constructor 1");
    }
    public Honda(boolean isNew){
        super("hybrit");
        if (isNew) {
            System.out.println("brad new");
        }else {
            System.out.println("used");
        }
    }
}