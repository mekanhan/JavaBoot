package class_March15_Constructor;

public class Employee {
    int id;
    String name;
    String department;
    int salary;
    char type;
    public Employee(){
        this.id=123;
        this.name="sample";
        this.department="Tech";
        this.salary=100000;
        this.type='K';
    }
    // Constructor
    public Employee(int id, String name, String department, int salary, char type){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
        this.type=type;
    }
    public int weeklyPayment (){
        return this.salary / 52;
    }
    public int biWeeklyPayment (){
        return this.salary / 52 * 2;
    }

}
