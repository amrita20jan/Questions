public class MyStrSplit {
 
    public static void main(String a[]){
     
        String str = "This program splits a string based on space";
        String[] tokens = str.split(" ");
        /*for(String s:tokens){
        	System.out.println(s);
        }
        */
        /*str = "This     program  splits a string based on space";
        tokens = str.split("\\s+");
        System.out.println("tokens===========>>>>    "+tokens);
   */ 
      for(int i=0; i<str.length(); i++)
      {
    	  System.out.println(str);
      }
    
    
    
    
    }
}
