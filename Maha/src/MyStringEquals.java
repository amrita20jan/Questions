public class MyStringEquals {
    public static void main(String a[]){
        String x = "JUNK";
        //String y = "junk";
        String y = "junk";
        //String y=x;
        /**
         * We cannot use '==' operator to compare two strings.
         * We have to use equals() method.
         */
        String obj1 = new String("xyz");

        String obj2 = new String("xyz");

        if(obj1 == obj2)
           System.out.println("obj1==obj2 is TRUE");
        else
          System.out.println("obj1==obj2 is FALSE");
            
        if(x==y){
        	 System.out.println("Both strings are equal.");
    } else {
        System.out.println("Both strings are not equal.");
    }
        
        
        
        if(x.equals(y)){
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }
        /**
         * We can ignore case with equalsIgnoreCase() method
         */
        if(x.equalsIgnoreCase(y)){
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }
    }
}
