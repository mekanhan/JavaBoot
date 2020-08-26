package class_March15_Constructor;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee myTest = new Employee();
        System.out.println("Your weekly payment is $" + myTest.weeklyPayment());
        System.out.println("Your biweekly payment is $" + myTest.biWeeklyPayment());
        System.out.println("Your department is " + myTest.department);

    }
}
