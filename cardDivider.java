import java.util.*;
public class Deck {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=Integer.parseInt(r.nextLine());
        TreeMap<String,String> map=new TreeMap<String,String>();
        for(int i=0;i<n;i++){
            String id=r.nextLine();
            String num=r.nextLine();
            
            if(map.containsKey(id)){
               String k=map.get(id);
               map.replace(id,k,k+"+"+num);
            }else{
                map.put(id,num);
            }
        }
        // System.out.println(map);
        for(Map.Entry<String,String> x : map.entrySet())
        {
            String k[]=x.getValue().split("[+]");
            System.out.println("The elements are");
            for(int i=0;i<k.length;i++)
                System.out.println(x.getKey()+" "+k[i]);
            System.out.println("size = "+k.length);
            if(k.length==1){
                System.out.println(k[0]);
            }else{
                int sum=0; 
                for( String l : k)
                    sum+=Integer.parseInt(l);
                System.out.println(sum);
            }
        }
    }

}
