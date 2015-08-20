interface A
{
   void displayA();
}

abstract class B
{
   public void displayB()
   {
     System.out.println("Display-B");
   }
   abstract public void display();
}

class  C extends B implements A
{
	   public void displayB(){
	      System.out.println("Abstract Display-B");
	  }
	   
	  public void displayA(){
	     System.out.println("Display-A");
	  }
	  
	  public void display() {
		  System.out.println("Display");
	  }
}

class  TestClass
{
  public static void main(String args[])
 {
   C obj=new C();
   obj.display();
   obj.displayA();
   obj.displayB();
 }
}  
