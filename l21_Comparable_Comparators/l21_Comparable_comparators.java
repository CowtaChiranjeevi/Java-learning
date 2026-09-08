package l21_Comparable_Comparators;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

// Student class which implements comparable interface to override compareto method so that the objects created with it can be sorted according to their integer id.
class Student implements Comparable<Student>{
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public int compareTo(Student other){
        return Integer.compare(this.id,other.id);
    }
    public String toString(){
        return "ID: "+id+", Name: "+name;
    }
}

// NameSorter class created to implement comparator 
class NameSorter implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}
class IDsorter implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return Integer.compare(s1.id,s2.id);
    }
}

public class l21_Comparable_comparators {
    public static void main(String[] args) {
        // Created an integer arraylist using list interface to add multiple numbers
        List<Integer> num01 = new ArrayList<>();
        num01.add(354137); 
        num01.add(198300); 
        num01.add(12480); 
        num01.add(4730); 
        num01.add(94386); 
        num01.add(3889); 
        // Collections class' sort method used to sort by default , does ascending order by default.
        Collections.sort(num01);
        // System.out.println(num01);

        // Created a string arraylist using listinterface 
        List<String> colors = new ArrayList<>();
        colors.add("Violet");
        colors.add("Indigo");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Red");
        // sort method for strings does alphabetical order in and also follows ASCII code values and capital letters comes before small letters. 
        Collections.sort(colors);
        // System.out.println(colors);

        // Created a students arraylist to store objects, to sort objects Collections.sort cannot be used by default as it does not know which to sort it with , id or name. To solve this issue we have comparable and comparator and we need to override the compareTo method implementing Comparable interface.
        List<Student> students = new ArrayList<>();
        students.add(new Student(36,"Rahul"));
        students.add(new Student(12,"Priyansh"));
        students.add(new Student(23,"Praful"));
        students.add(new Student(40,"Jagan"));
        students.add(new Student(19,"Manohar"));
        students.add(new Student(26,"Yusuf"));
        Collections.sort(students);

        System.out.println("Students sorted by id: ");
        // Each student object printed on a new line using for each loop
        for(Student s : students){
            System.out.println(s);
        }
        System.out.println();

        // Sorted by names
        Collections.sort(students, new NameSorter());
        for(Student s : students){
            System.out.println(s);
        }
        System.out.println();

        // Sorted by IDs
        Collections.sort(students, new IDsorter());
        for(Student s : students){
            System.out.println(s);
        }
        System.out.println();

    }
}
