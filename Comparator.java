import java.util.*;
class Student{
    int rollno;
    String name;
    
    public Student(int r,String s){
        rollno=r;
        name=s;
    }
}

class NameCompare implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        // Student s1=(Student) o1;
        // Student s2=(Student) o2;
        
        return s1.name.compareTo(s2.name);
    } 
}
class NumCompare implements Comparator<Student>{
     public int compare(Student s1,Student s2){
        // Student s1=(Student) o1;
        // Student s2=(Student) o2;
        
        if(s1.rollno>s2.rollno)
        {
            return 1;
        }else if(s1.rollno<s2.rollno){
            return -1;
        }else{
            return 0;
        }
    } 
}
public class MyClass {
    public static void main(String args[]) {
       ArrayList<Student> ar=new ArrayList<Student>();
       ar.add(new Student(41,"vbabyu"));
       ar.add(new Student(1,"raja"));
       ar.add(new Student(21,"varshu"));
       ar.add(new Student(2,"abi"));
       
       System.out.println("Before");
       for(Student x : ar)
       {
           System.out.println(x.rollno+" "+x.name);
       }
       Collections.sort(ar,new NameCompare());
       
       System.out.println("After");
       for(Student x : ar)
       {
           System.out.println(x.rollno+" "+x.name);
       }
    }
}
