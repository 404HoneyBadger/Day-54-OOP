import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Teacher Lisa = new Teacher(1, "Lisa", 500);
    Teacher Mel = new Teacher(2, "Mel", 700);
    Teacher Ken = new Teacher(3, "Ken", 500);

    List<Teacher> teacherList= new ArrayList<>();
    teacherList.add(Lisa);
    teacherList.add(Mel);
    teacherList.add(Ken);

    Student Ashley = new Student(1, "Ashley", 91);
    Student Tom = new Student(2, "Tom", 83);
    Student Jessica = new Student(2, "Jessica", 87);

    List<Student> studentList = new ArrayList<>();
    studentList.add(Ashley);
    studentList.add(Tom);
    studentList.add(Jessica);

    School riverside = new School(teacherList, studentList);

    Ashley.feesPaid(5000);

    Tom.feesPaid(9000);

    System.out.println("Riverside earned $" + riverside.getTotalMoneyEarned());

    Lisa.recieveSalary(Lisa.getSalary());
    Ken.recieveSalary(Ken.getSalary());;

    System.out.println("Spent on salaries $" +( Ken.getSalary() + Lisa.getSalary()) + "\n School has $" + riverside.getTotalMoneyEarned());

    System.out.println(Ashley);
    System.out.println(Ken);
}}
