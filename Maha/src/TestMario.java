interface IMario
{
  void behavior();
}

class  Mario implements IMario
{
 public void behavior()
 {
     System.out.println("This is simple Mario");
 }
}

class  SuperMario implements IMario
{
  public void behavior()
  {
     System.out.println("This is Super Mario with power");
  }
}

class  TestMario
{
   public static void main(String args[])
   {
        System.out.println("----game started----");
        IMario obj=new Mario();
        obj.behavior();
        System.out.println("-----After Mashroom-----");
        obj=new SuperMario();
        obj.behavior();
        System.out.println("-----After Power Loss-----");
        obj=new Mario();
        obj.behavior();
   }
}