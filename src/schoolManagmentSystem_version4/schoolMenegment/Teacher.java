package schoolManagmentSystem_version4.schoolMenegment;


public class Teacher extends Person {
    private double salary;
    private School school;
    private double salaryEarned;

    Teacher(int id, String firstName, String lastName, double salary){
        super(id,firstName,lastName);
        this.salary=salary;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName(){
        return getFirstName()+" "+getLastName();
    }

    public School getSchool() {
        return school;
    }

    public double getSalaryEarned() {
        return salaryEarned;
    }

    public void receiveSalary(){
        salaryEarned+=salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + getId() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", salary=" + salary +
                ", school=" + school +
                ", salaryEarned=" + salaryEarned +
                '}';
    }
}
