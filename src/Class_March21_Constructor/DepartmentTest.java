package Class_March21_Constructor;

public class DepartmentTest {
    public static void main(String[] args) {
        Department myEmp = new Department("Rumeysa",123,"QA",120000);
        System.out.println(myEmp.toString());
        ItDepartment myIt = new ItDepartment("mehmet",124,"Testing",120000,"Selenium");
        System.out.println(myIt.toString());
        myIt.addSkillSet("SQL");
        System.out.println(myIt.toString());
        AccountingDepartment myAcc = new AccountingDepartment("Inci",125,"QA",120000,15);
        System.out.println(myAcc.toString());
        myAcc.addYearsOfExperience(2);
        System.out.println(myAcc.toString());

    }
}
