package Class_March21_Constructor;

public class AccountingDepartment extends Department {
    private int yearsOfExperience;

    public AccountingDepartment(String employeeName, int employeeId, String position, double salary, int yearsOfExperience){
        super(employeeName,employeeId,position,salary);
        this.yearsOfExperience=yearsOfExperience;
    }
    public void setYearsOfExperience(int years){
        this.yearsOfExperience=years;
    }
    public int getYearsOfExperience(){
        return this.yearsOfExperience;
    }
    public void addYearsOfExperience(int years){
        this.yearsOfExperience+=years;
    }

    @Override
    public String toString() {
        return "AccountingDepartment{" +
                "yearsOfExperience=" + yearsOfExperience +
                ", employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
