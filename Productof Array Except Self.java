// Online Java Compiler
// Use this editor to write, compile and run your Java code //online

class Main {
    public static void main(String[] args) {
        int m[]={1,2,3,4};
        int out[]={24,12,8,6};
        int ans[]=new int[m.length];
        int prodR=1;
      for(int i=m.length-1;i>=0;i--)
      {
          ans[i]=prodR;
          prodR=prodR*m[i];
      }
      int prodL=1;
      for(int j=0;j<m.length;j++)
      {
        ans[j] = ans[j]*prodL;
          prodL=prodL*m[j];
      }
      
     for(int i=0;i<ans.length;i++)
     {
         System.out.print(ans[i]+ " ");
     }
     
        
    }
}
