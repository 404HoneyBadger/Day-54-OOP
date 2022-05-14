
public class Student {
  
  /*Money managment system for school
  - Keep track of students for school
  - fees already paid
  - teachers salary

  // School
  - teachers, students,
  - total money earned,
  - total money spent on salaries
  
  // Teacher
  - id, name, salary
  
  // Student
  - id must be unique, name, grade
  - fees paid initially is 0
  - fees total -30k per year
  
  OOP */

  private int id;
  private String name;
  private int grade;
  private int feesPaid;
  private int feesTotal;

  public Student(int id, String name, int grade){
    this.id=id;
    this.name=name;
    this.grade=grade;
    this.feesTotal=30000;
    feesPaid=0;
  }

  // Students name and id will stay constant cause they never change
  // Set is for paramters that change

  // setGrade updates students grade, parameters is the new grade
  public void setGrade(int grade){
    this.grade=grade;
  }

  // Add fees to 'feesPaid', the school will recieve funds, parameters are the fees that were paid
  // Keep adding fees to feedPaid field
  public void feesPaid(int fees){
    feesPaid+=fees;
    School.updateTotalMoneyEarned(feesPaid);
  }

  public int getId(){
    return id;
  }

  public String getName(){
    return name;
  }

  public int getGrade(){
    return grade;
  }

  public int getFeesPaid(){
    return feesPaid;
  }

  public int getFeesTotal(){
    return feesTotal;
  }

  public int getRemaingFees(){
    return feesTotal-feesPaid;
  }

  @Override
  public String toString(){
    return "Student's name: " + name + " Total fees paid $:" + feesPaid;
  }


}
