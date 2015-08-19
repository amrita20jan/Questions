
interface Animal {
	
	void show();
	void canFly();
	
}

class Bird implements Animal
{
	public void show(){
		System.out.println("I am Bird");
	}

	@Override
	public void canFly() {
		System.out.println("I can fly");
		
	}

}

class Cat implements Animal
{
public void show(){
	System.out.println("I am Cat");
	}

	public void canFly() {
		System.out.println("I cannot fly");
		
	}
	
}

class Dog implements Animal
{
	public void show(){
		System.out.println("I am Dog");
		}

		public void canFly() {
			System.out.println("I cannot fly");
			
		}

}

 class TestMain
{
  public static void main(String args[])
  {
	Animal ob = new Bird();
	Animal ob1 = new Cat();
	Animal ob2 = new Dog();
	/*Bird b=new Bird();
	Cat c=new Cat();
	Dog d=new Dog(); 
	*/
	ob.show();
	ob.canFly();
	
	ob1.show();
	ob1.canFly();
	
	ob2.show();
	ob2.canFly();
	
	
	
  }


}