import java.util.List;

public class School {

  //School has many teachers/students
  private List<Teacher> teachers;
  private List<Student> students;
  private static int totalMoneyEarned;
  private static int totalMoneySpent;

//Parameter- teachers list of teachers in school
//Parameter- students list of students
  public School(List<Teacher> teachers, List<Student> students){
    this.teachers=teachers;
    this.students=students;
    totalMoneyEarned=0;
    totalMoneySpent=0;
  }

  // return list of teachers in school
  public List<Teacher> getTeachers() {
    return teachers;
  }


  //Adds teacher to school
 public void addTeachers(Teacher teacher) {
   teachers.add(teacher);
 }


 //return list of student in the school
  public List<Student> getStudents() {
    return students;
  }

  //Adds student to school
  public void addStudents(Student student) {
    students.add(student);
  }


  //Total money earned by the school
  public  int getTotalMoneyEarned() {
    return totalMoneyEarned;
  }

  //Adds total money earned by schoool
  //Parameter- money that is supposed to be added
  public static void updateTotalMoneyEarned(int moneyEarned) {
    totalMoneyEarned += moneyEarned;
  }

  //The total money spent by school
  public int getTotalMoneySpent() {
    return totalMoneySpent;
  }

  //Updates the money spent by school(the salary)
  //Parameter the money spent by school
  public static void updateTotalMoneySpent(int moneySpent) {
  totalMoneyEarned -= moneySpent;
  }





}
