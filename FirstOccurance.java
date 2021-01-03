import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner r=new Scanner(System.in);
        TreeMap<String,String> tm=new TreeMap<String,String>();
        for(int i=0;i<5;i++)
        {
            String a=r.nextLine();
            String b=r.nextLine();
            if(!tm.containsKey(a)){
                tm.put(a,b);
            }
        }
        for(Map.Entry<String,String> x : tm.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
