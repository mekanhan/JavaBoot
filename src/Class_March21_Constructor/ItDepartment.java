package Class_March21_Constructor;

public class ItDepartment extends Department {
    private String skillSet;
    public ItDepartment(String emloyeeName, int employeeId, String position, double salary,String skillSet){
        super(emloyeeName,employeeId,position,salary);
        this.skillSet=skillSet;
    }
    public ItDepartment(){
        super();
        this.skillSet="Java";
    }
    public void setSkillSet(String skillSet){
        this.skillSet=skillSet;
    }
    public String getSkillSet(){
        return this.skillSet;
    }

    public void addSkillSet(String newSkill){
        this.skillSet = this.skillSet + " " + newSkill;
    }

    @Override
    public String toString() {
        return "ItDepartment{" +
                "skillSet='" + skillSet + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
