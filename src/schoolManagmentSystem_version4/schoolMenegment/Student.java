package schoolManagmentSystem_version4.schoolMenegment;

public class Student extends Person {
    private int grade;
    private double feesPaid;
    private double feesTotal;
    private School school;

    public Student(int id, String firstName, String lastName, int grade, double feesTotal){
        super(id,firstName,lastName);
        this.grade=grade;
        this.feesPaid=feesPaid;
        this.feesTotal=feesTotal;
    }

    public int getGrade() {
        return grade;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public double getFeesTotal() {
        return feesTotal;
    }

    public double getRemainingFees(){
        feesTotal-=feesPaid;
        return feesTotal;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName(){
        return getFirstName()+" "+getLastName();
    }

    public void pay(int fees){
        feesPaid+=fees;
    }

    @Override
    public String toString() {
        return "Student[" +
                "id=" + getId()+
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal +
                ", school=" + school +
                ']';
    }

}
