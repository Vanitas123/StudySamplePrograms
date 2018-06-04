package examples.vanita.programs;

class A
{
  public A() {
	  System.out.println("A cons");
  }
}
 
class B extends A
{
 	public B(){
		 System.out.println("B cons");
	}
}
 
class C
{
     public C() {
    	 System.out.println("C Cons");
     }
}
 
public class OverloadingProblem 
{
    static void overloadedMethod(A a)
    {
        System.out.println("ONE");
    }
     
    static void overloadedMethod(B b)
    {
        System.out.println("TWO");
    }
     
    
    static void overloadedMethod(Object obj)
    {
        System.out.println("THREE");
    }
     
    public static void main(String[] args)
    {
        C c = new C();
         
        overloadedMethod(c);
    }
}