// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        // i wanted to 
        
    String s = "anagram";
    String t= "nagaram";
    System.out.println(IsAnagram(s,t));
    
    
    }
    
    public static boolean IsAnagram(String s,String t)
    {
        if(s.length()!=t.length())
        {
            return false;
        }else{
            int count[]=new int[26];
            for(int i=0;i<s.length();i++)
            {
                count[s.charAt(i)-'a']++;
            }
            for(int i=0;i<t.length();i++)
            {
                count[t.charAt(i)-'a']--;
            }
            
            for(int i=0;i<count.length;i++)
            {
                if(count[i]!=0)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
