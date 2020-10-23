public class First
 {
// user defined method - belong to class

public int sum(int i,int j)
 {
int result= i+j; 
return result;  // last line of method
 }

public void sub()
 {
System.out.println(4-2);
 }

// predefined method - belong to jvm
   public static void main(String[] args)
     {
First f= new First(); // default constructor
int x=f.sum(12,12); // call method
System.out.println(x);
f.sub();

       } // end of main
 } // end of class

