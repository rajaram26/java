import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner r=new Scanner(System.in);
        String s=r.nextLine();
        for(int i=0;i<s.length();i++)
        {
            String letter="";
            String number="";
            for(int j=i;j<s.length();j++){
                if(Character.isLetter(s.charAt(j))){
                    letter+=s.charAt(j)+"";
                }else{
                    i=j;
                    break;
                }
            }
            for(int j=i;j<s.length();j++){
                if(Character.isDigit(s.charAt(j))){
                    number+=s.charAt(j)+"";
                }else{
                    i=j-1;
                    break;
                }
            }
            for(int j=0;j<Integer.parseInt(number);j++)
            {
                System.out.print(letter);
            }
        }
    }
}
