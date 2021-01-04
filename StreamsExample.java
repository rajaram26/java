import java.util.*;
import java.util.stream.Collectors;
class person{
    String name;
    String city;
    public person(String name,String city){
        this.name=name;
        this.city=city;
    }
}
public class MyClass {
    public static void main(String args[]) {
        List<person> al=new ArrayList<>();
        al.add(new person("raja","mari"));
        al.add(new person("praveen","kumar"));
        al.add(new person("king","uk"));
        al.add(new person("chottu","uk"));
        
        // System.out.println(al);
        al.stream()
            .filter(p -> p.city.startsWith("u"))
            .forEach(p -> System.out.println(p.name));
            
        List<String> names = al.stream()
                            .filter(p -> p.city.startsWith("m"))
                            .map(p -> p.name)
                            .collect(Collectors.toList());
                            
        System.out.println(names);
    }
}
