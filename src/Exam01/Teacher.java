package Exam01;

public class Teacher extends Person{

    private String teacherID;
    private int salary;
    private int month;

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Teacher(String name, int age, int height, int weight, String teacherID, int salary, int month) {
        super(name, age, height, weight);
        this.teacherID = teacherID;
        this.salary = salary;
        this.month = month;
    }
}
