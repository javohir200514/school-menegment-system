package schoolManagmentSystem_version4.version3;

import schoolManagmentSystem_version4.schoolMenegment.Person;
import schoolManagmentSystem_version4.schoolMenegment.Student;

public class PersonList {
    private Person[] person;
    private static final int COPOSITY=4;
    private int size;


    public PersonList(){
        person=new Person[COPOSITY];
    }

    public PersonList(int COPOSITY_size){
        person=new Person[COPOSITY_size];
    }

    public Person get(int index){
        return person[index];
    }

    public int coposity(){
        return person.length;
    }

    public Person add(Person people){
        if(person.length<=size){
            Person[] newPerson=new Student[2*person.length];
            for (int i = 0; i < size; i++) {
                newPerson[i]=person[i];
            }
            person=newPerson;
        }
        person[size++]=people;
        return people;
    }

    public int size(){
        return size;
    }
}
