package schoolManagmentSystem_version3.version3;


import schoolManagmentSystem_version3.schoolMenegment.Teacher;

public class TeacherList {
    private Teacher[] teachers;
    private static final int COPOSITY=4;
    private int size;


    public TeacherList(){
        teachers=new Teacher[COPOSITY];
    }

    public TeacherList(int COPOSITY_size){
        teachers=new Teacher[COPOSITY_size];
    }

    public Teacher get(int index){
        return teachers[index];
    }

    public int coposity(){
        return teachers.length;
    }

    public Teacher add(Teacher teacher){
        if(teachers.length<=size){
            Teacher[] newTeacher=new Teacher[2*teachers.length];
            for (int i = 0; i < size; i++) {
                newTeacher[i]=teachers[i];
            }
            teachers=newTeacher;
        }
        teachers[size++]=teacher;
        return teacher;
    }
    public int size(){
        return size;
    }
}
