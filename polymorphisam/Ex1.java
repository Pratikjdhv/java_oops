
// 🔹 What is Polymorphism?

// Polymorphism allows the same method to have different behaviors based on the object that calls it. There are two types:

// Compile-time Polymorphism (Method Overloading) – Multiple methods with the same name but different parameters.
// Runtime Polymorphism (Method Overriding) – A subclass provides a specific implementation of a method that is already defined in its superclass.


class mathoperation {
    int add(int a, int b){
        return a+b ;
    }
    int add(int a, int b , int c ){
        return a+b + c ;
    }
    double add(double a, double b ){
        return a+b;
    }
}
public class Ex1{
    public static void main ( String [] args ){
        mathoperation m1= new mathoperation ();
        System.out.println("Sum of two number is : " + m1.add(4,7));
        System.out.println("Sum of two number is : " +  m1.add(4,7,9));
        System.out.println("Sum of two number is : " + m1.add(5.5 ,4.3));
       
    }
}