package schoolManagmentSystem_version4.schoolMenegment;

import schoolManagmentSystem_version3.version3.TeacherList;
import schoolManagmentSystem_version4.version3.PersonList;

public class School {
    private PersonList teachers;
    private PersonList students;
    private Person person;
    int studentCount=0;
    int teacherCount=0;



    public School() {
        this.students =new PersonList();
        this.teachers =new PersonList();
    }



    public PersonList getTeachers() {

        return teachers;
    }

    public PersonList getStudents() {

        return students;
    }

   public double getTotolMonayEarned(){
       double totol=0;
       for (int i = 0; i <students.size() ; i++) {

           Student student=(Student) (students.get(i));
           totol+=student.getFeesPaid();
       }
       return totol;
   }

    public double getTotolMonaySpent(){
        double spent=0;
        for (int i = 0; i <teachers.size() ; i++) {
            Teacher teacher=(Teacher) (teachers.get(i));
            spent+=teacher.getSalaryEarned();
        }
        return spent;
    }

    public void addTeacher(Person teacher){
        teachers.add(teacher);
        Teacher teacher1=(Teacher)(teacher);
        teacher1.setSchool(this);
    }

    public void addStudent(Student student){
        students.add(student);
    }


}
