package schoolManagmentSystem_version5.version3;

import schoolManagmentSystem_version5.schoolMenegment.Student;

public class MyList {
    private Object[] elements;
    private static final int COPOSITY=4;
    private int size;


    public MyList(){
        elements=new Object[COPOSITY];
    }

    public MyList(int COPOSITY_size){
        elements=new Student[COPOSITY_size];
    }

    public Object get(int index){
        return elements[index];
    }

    public int coposity(){
        return elements.length;
    }

    public Object add(Object element){
        if(elements.length<=size){
            Object[] newObject=new Object[2*elements.length];
            for (int i = 0; i < size; i++) {
                newObject[i]=elements[i];
            }
            elements=newObject;
        }
        elements[size++]=element;
        return element;
    }

    public int size(){
        return size;
    }



}
