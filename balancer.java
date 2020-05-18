import java.util.*;
public class test{
    
    
    public static int sol(String s,int n)
    {
        char c[]=s.toCharArray();
        Stack<Character> sd=new Stack<Character>();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='<')
            {
                sd.push(c[i]);
            }else{
                if(sd.isEmpty())
                {
                    n--;
                    continue;
                }else{
                    if(gettop(sd.peek())==c[i])
                        sd.pop();
                }
            }
        }
        if(sd.isEmpty() && n>=0)
        {
            return 1;
        }
        return 0;
    }
    
    public static char gettop(char c)
    {
        if(c=='<')
            return '>';
        if(c=='>')
            return '<';
        return '#';
    }
    
    public static void main(String args[])
    {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        String bra[]=new String[n];
        r.nextLine();
        for(int i=0;i<n;i++)
        {
            bra[i]=r.nextLine();
        }
        n=r.nextInt();
        int count[]=new int[n];
         for(int i=0;i<n;i++)
        {
            count[i]=r.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(sol(bra[i],count[i]));
        }
    }
}
