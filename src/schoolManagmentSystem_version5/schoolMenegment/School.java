package schoolManagmentSystem_version5.schoolMenegment;

import schoolManagmentSystem_version5.version3.MyList;

public class School {
    private MyList teachers;
    private MyList students;
    int studentCount=0;
    int teacherCount=0;



    public School() {
        this.students =new MyList();
        this.teachers =new MyList();
    }



    public MyList getTeachers() {

        return teachers;
    }

    public MyList getStudents() {

        return students;
    }

   public double getTotolMonayEarned(){
       double totol=0;
       for (int i = 0; i <students.size() ; i++) {
           Student student=(Student)(students.get(i));

           totol+=student.getFeesPaid();
       }
       return totol;
   }

    public double getTotolMonaySpent(){
        double spent=0;
        for (int i = 0; i <teachers.size() ; i++) {
            Teacher teacher=(Teacher)(teachers.get(i));
            spent+=teacher.getSalaryEarned();
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
