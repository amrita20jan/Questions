import java.util.PriorityQueue;

public class PositiveArray {

	public static void main(String[] args) {
		
	int[] unsorted = { -3, -95, 20, -4, 5, -6, -9, 9, 8 };

	PriorityQueue<Integer> q = new PriorityQueue<>(unsorted.length);

	for (int a : unsorted) {
	    if (a > 0)
	        q.add(a);
	}

	while (!q.isEmpty()) {
	    System.out.println(q.poll());
	}

  }
}