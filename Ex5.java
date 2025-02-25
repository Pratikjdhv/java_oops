class Person {
    String name;
    String doj;  // Changed type to String (Date of Joining)

    // Constructor for Person
    Person(String name, String doj) {
        this.name = name;
        this.doj = doj;
    }

    void pdetails() {
        System.out.println("Name of Employee: " + name);
        System.out.println("Date of Joining: " + doj);
    }
}

class Employee extends Person {
    int eid;
    double salary;  // Changed salary to double for more flexibility

    // Constructor for Employee
    Employee(String name, String doj, int eid, double salary) {
        super(name, doj); // Calls Parent class constructor
        this.eid = eid;
        this.salary = salary;
    }

    @Override
    void pdetails() {
        super.pdetails();
        System.out.println("Employee ID: " + eid);
        salary = salary * 100000;
        System.out.printf("Salary of Employee: Rs.%.2f per year\n", salary );  // Formats salary properly
    }
}

class Manager  extends Employee {
    String Department ;
    Double increass_salary ;
    Manager (String name, String doj, int eid, double salary ,String Department ){
        super (name ,doj, eid ,salary);
        this.Department = Department ;
    }
    @Override
    void pdetails (){
        super.pdetails();
        System.out.println("Department : " + Department );
    }
    public void increass_salary(double percentage){
        increass_salary = (salary * percentage ) / 100 ;
        System.out.printf("\nIncreases Salary is : Rs.%.2f per year" , increass_salary);
    }
}

class Director extends Manager{
    double  Bonus  ;
    double annualbonus;
    Director  (String name, String doj, int eid, double salary ,String Department  , double Bonus ){
        super (name ,doj, eid ,salary , Department);
        this.Bonus = ( salary * Bonus )/100;
    }
    @Override
     void pdetails(){
        super.pdetails();
        System.out.printf("Bonus is : Rs.%.2f per year" , Bonus);
    }
    public void annualbonus  (double percentage ){
        annualbonus = (salary *percentage)/100;
        System.out.printf("\nAnnual Bonus is : Rs.%.2f per year" , annualbonus);
    }
    public void totalcompensation (){
        Double tc = (Bonus  + salary + annualbonus  + increass_salary );
        System.out.printf("\nTotal compensation is : Rs.%.2f per year" , tc);
    }
}


public class Ex5 {
    public static void main(String[] args) {
       Director d1= new Director("pratik","20-05-2023",119,10,"tech" , 10 );
       System.out.println();
       d1.pdetails();
       d1.increass_salary(10);
       d1.annualbonus(5);
       d1.totalcompensation();
    }
}
