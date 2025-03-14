package schoolManagmentSystem_version3.schoolMenegment;

import schoolManagmentSystem_version3.version3.StudentList;
import schoolManagmentSystem_version3.version3.TeacherList;

public class School {
    private TeacherList teachers;
    private StudentList students;
    int studentCount=0;
    int teacherCount=0;



    public School() {
        this.students =new StudentList();
        this.teachers =new TeacherList();
    }



    public TeacherList getTeachers() {

        return teachers;
    }

    public StudentList getStudents() {

        return students;
    }

   public double getTotolMonayEarned(){
       double totol=0;
       for (int i = 0; i <students.size() ; i++) {

           totol+=students.get(i).getFeesPaid();
       }
       return totol;
   }

    public double getTotolMonaySpent(){
        double spent=0;
        for (int i = 0; i <teachers.size() ; i++) {

            spent+=teachers.get(i).getSalaryEarned();
        }
        return spent;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
        teacher.setSchool(this);
    }

    public void addStudent(Student student){
        students.add(student);
    }


}
