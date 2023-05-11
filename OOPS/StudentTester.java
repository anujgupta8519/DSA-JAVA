public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId(1001);
        s1.setStudentName("Jacob");
        s1.setQulayifyingMarks(80f);
        s1.setYearOfEngg(3);
        s1.setResidentalStatus('H');
        System.out.println(s1.getStudentName());
    }
}
class Student{
    private  int studentId;
    private String studentName;
    private float qulayifyingMarks;
    private char residentalStatus;
    private int yearOfEngg;

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public float getQulayifyingMarks() {
        return qulayifyingMarks;
    }
    public void setQulayifyingMarks(float qulayifyingMarks) {
        this.qulayifyingMarks = qulayifyingMarks;
    }
    public String getResidentalStatus() {
        if (this.residentalStatus=='H') {
            return "Hostellers";
        }
        return"Day Scoller";
        
    }
    public void setResidentalStatus(char residentalStatus) {
        this.residentalStatus = residentalStatus;
    }
    public int getYearOfEngg() {
        return yearOfEngg;
    }
    public void setYearOfEngg(int yearOfEngg) {
        this.yearOfEngg = yearOfEngg;
    }

    
}
