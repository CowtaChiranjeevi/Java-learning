package l14_Equality_Ordering;
import java.util.Objects;

class Student{
    int id;
    String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public int hashCode(){
        return Objects.hash(id,name);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return id == other.id && Objects.equals(name,other.name);
    }
}

public class equalityOrdering {
    public static void main(String[] args) {
        Student s1 = new Student(01,"Rahul");
        Student s2 = new Student(01,"Rahul");
        Student s3 = s1;

        // "==" equality operator checks the memory location of the objects or variables.
        System.out.println(s1 == s2);
        // equals method used to check the content of the objects or variables.
        System.out.println(s3.equals(s1));
        System.out.println(s3.equals(s2));
        // hashCode method which returns a memory location of an object
        // System.out.println(s1.hashCode());
        // System.out.println(s2.hashCode());
        // System.out.println(s1.hashCode() == s2.hashCode());




    }
}
