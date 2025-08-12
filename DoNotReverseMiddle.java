// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        
        String input ="washina";
        char ch[]=input.toCharArray();
        
        reverse(ch,0,2);
        reverse(ch,4,6);
        

        System.out.println(Arrays.toString(ch));
        String s1="";
        for(int i=0;i<ch.length;i++)
        {
            s1+=ch[i];
        }
        
        System.out.println(s1);

    }
    
         public static void reverse(char ch[],int start,int end)
         {
             
             while(start<end)
             {
                 char temp= ch[start];
                 ch[start]=ch[end];
                 ch[end]=temp;
                 start++;
                 end--;
             }
         }

}
