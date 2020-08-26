package class_March21_Constructor;

public class Department {
    protected String employeeName;
    protected int employeeId;
    protected String position;
    protected double salary;
    Department(String employeeName,int employeeId,String position,double salary){
        this.employeeName=employeeName;
        this.employeeId=employeeId;
        this.position=position;
        this.salary=salary;
    }
    Department(){
        this.employeeName="Temp";
        this.employeeId=999;
        this.position="intern";
        this.salary=1000;
    }
    void changePosition(String newPosition){
        this.position=newPosition;
    }
    void riseSalary(double rise){
        this.salary += rise;
    }

    @Override
    public String toString() {
        return "Department{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
