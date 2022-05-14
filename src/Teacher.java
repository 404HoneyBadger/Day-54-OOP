
/* // Teacher
 - id, name, salary*/

public class Teacher {
  private int id;
  private String name;
  private int salary;  
  private int salaryEarned;

//Creates new Teacher object
public Teacher(int id, String name, int salary){
  this.id=id;
  this.name=name;
  this.salary=salary;
  this.salaryEarned=0;

}

public int getId(){
  return id;
}

public String getName(){
  return name;
}

public int getSalary(){
return salary;
}

// Set is for attributes that change/update
public void setSalary(int salary){
  this.salary=salary;
}


//Adds to the salary and removes from total money earned by school
public void recieveSalary(int salary){
salaryEarned +=salary;
School.updateTotalMoneySpent(salary);
}

@Override
public String toString(){
  return "Teacher's name : " + name + " Total salary earned $" + salaryEarned;
  
}

}