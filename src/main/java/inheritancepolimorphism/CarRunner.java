package inheritancepolimorphism;

public class CarRunner {
    public static void main(String[] args) {
        Car e=new Car("Honda",10000);
Honda h1=new Honda();
        Civic cv=new Civic(2021);
        //super can be used with parameters as well
        //when a class has amultiple constructor to select the constructer we need we use super with parameters
    }
//super is used to call constructor from parent class
    //super is in the first line of every constructor
    //super is invisible as default if you want to typ eit explicitly

    //1)when you try to access to varable by using object in inheritance start to look for the variable in the class
    //used in the data type of the object
    //2)when you try to access to method by using object in inheritance start to look for the object in the class
    //   whose constructor was used
    //3) data type of object can be selected from the class or from the parent class
    //4)private class can not be inherited and default class members can be inherited if the child class in the same package
    // with the parent class
    //5)in the fist line of every constructor there is invisible super to call default constructor from the parent class
    //if you want to type it explicitly
}
//this is used to call constructur from the same class
//this must be in the first line in a constructer body
//this is used to call constructor from the same class super is used to call constructor frım parent class
