package class_March25_Polymorphism;

public class LabAttendanceTest {
    public static void main(String[] args) {
        String students[]={"melih","shohrat","ismail"};
        int[] studentIds = {1,2,3};
        String labSubjects[]={"inheritance","polymorphism", "interface_"};
        LabAttendance myLab = new LabAttendance(students,studentIds,labSubjects);
        int[] grades={100,100,100};
        myLab.enterGrades("inheritance",grades);
        myLab.printAllGrades();
        myLab.printAttendanceGrades();
    }

}
