
public class Remove {

	
	static String removeDups(String s){
	  boolean seen[]= new boolean[256];
	  StringBuilder sb = new StringBuilder(seen.length);
	  
	  for(int i=0; i<s.length(); i++)
	  {   char ch = s.charAt(i);
		  if(!seen[ch]){
			  System.out.println("seen[ch]  "+seen[ch]);
			  seen[ch]=true;
			  sb.append(ch);
		  }
		  else{
			  System.out.println("in else===>>   "+ch); 
		  }
		  
		  
	  }
	   System.out.println("sb==>>>>  "+sb);
	   return sb.toString();
	}
	
	public static void main(String[] args) {
		removeDups("cutcopypaste");
   
	}
	

}
