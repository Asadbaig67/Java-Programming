package collectionframework.Map;


import java.util.HashMap;
import java.util.Objects;

public class HashCodeAndEqualsExample {

    public static void main(String[] args) {


        HashMap<Student, String> map1 = new HashMap<>();
        Student stu1 = new Student("Asad", 1);
        Student stu2 = new Student("Dagwood", 2);
        Student stu3 = new Student("Danish", 3);
        Student stu4 = new Student("Asad", 1);

        map1.put(stu1, "Engineer");
        map1.put(stu2, "Doctor");
        map1.put(stu3, "Soho");
        map1.put(stu4, "Doctor");

        System.out.println("HashMap size :"+ map1.size() );
        System.out.println("HashMap size :"+ map1.get(stu1) );
        System.out.println("HashMap size :"+ map1.get(stu4) );

    }
}

class Student {

    int id;
    String name;


    Student(String name, int id){
        this.id= id;
        this.name = name;

    }


    @Override
    public int hashCode() {  // returns the memory address hash
//        System.out.println("This is value in hashCode:" + Objects.hash(id, name));
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) { // returns true only if the two references point to the same object
        Student stu = (Student) obj;
//        System.out.println("This is name : "+ this.name + "This is id : "+ this.id);
//        System.out.println("This is name student : "+ stu.name + "This is id student : "+ stu.id);
//        System.out.println("This is value in equals method : " + (this.id == stu.id && Objects.equals(this.name, stu.name)));
        return this.id == stu.id && Objects.equals(this.name, stu.name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
