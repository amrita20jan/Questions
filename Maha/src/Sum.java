
public class Sum {

	public static void main(String[] args) {
		String str = "12 hi when 8 and 9";
		str=str.replaceAll("[\\D]+"," ");
		System.out.println("str===>>>>  "+str);
		String[] numbers=str.split(" ");
		int sum = 0;
		for(int i=0;i<numbers.length;i++){
		    try{
		    	System.out.println("numbers===>>>>  "+numbers[i]);
		    	sum=sum+Integer.parseInt(numbers[i]);
		    	System.out.println("sum    "+sum);
		        //sum+=Integer.parseInt(numbers[i]);
		    }
		    catch( Exception e ) {
		      //Just in case, the element in the array is not parse-able into Integer, Ignore it
		    }
		}
		System.out.println("The sum is:"+sum);
	  }
 }
