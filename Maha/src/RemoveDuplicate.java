
public class RemoveDuplicate {
	
	public static String removeDuplicates(String str) {
	    boolean seen[] = new boolean[256];
	    StringBuilder sb = new StringBuilder(seen.length);

	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        System.out.println("ch===    "+ch);
	        if (!seen[ch]) {
	        	seen[ch] = true;
	            System.out.println("seen===    "+seen[ch]);
	            sb.append(ch);
	        }
	    }
        System.out.println("sb=   "+sb);
	    return sb.toString();
	 	}
	
	public static void main(String args[])
	 {
		removeDuplicates("geeksforgeeksgeeksforgeeks");
		removeDuplicates("cutcopypaste");
	 }
}
