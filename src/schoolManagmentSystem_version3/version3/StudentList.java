package schoolManagmentSystem_version3.version3;

import schoolManagmentSystem_version3.schoolMenegment.Student;

public class StudentList {
    private Student[] students;
    private static final int COPOSITY=4;
    private int size;


    public StudentList(){
        students=new Student[COPOSITY];
    }

    public StudentList(int COPOSITY_size){
        students=new Student[COPOSITY_size];
    }

    public Student get(int index){
        return students[index];
    }

    public int coposity(){
        return students.length;
    }

    public Student add(Student student){
        if(students.length<=size){
            Student[] newStudent=new Student[2*students.length];
            for (int i = 0; i < size; i++) {
                newStudent[i]=students[i];
            }
            students=newStudent;
        }
        students[size++]=student;
        return student;
    }

    public int size(){
        return size;
    }



}
