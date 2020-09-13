import java.util.*;
class Student implements Comparable<Student>{
    int rollno;
    String name;
    
    public Student(int r,String s){
        rollno=r;
        name=s;
    }
    
    public int compareTo(Student s1){
       if(rollno>s1.rollno)
        {
            return -1;
        }else if(rollno<s1.rollno){
            return 1;
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
       Collections.sort(ar);
       
       System.out.println("After");
       for(Student x : ar)
       {
           System.out.println(x.rollno+" "+x.name);
       }
    }
}
