// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
       //  Input: "India is a beautiful country"
         //Output: "Indi@ is @@ be@@@utiful country"
         
         String str="India is a beautiful country";
         StringBuilder sb=new StringBuilder();
         int count=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            
            if(ch=='a')
            {
                count++;
             for(int j=0;j<count;j++)
            {
                
                sb.append('@');
            }
            }else{
                sb.append(ch);
            }
            
        }
        System.out.println(sb);
         
         
         
    }
}
