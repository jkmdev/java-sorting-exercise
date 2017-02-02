
import java.util.*;

public class SortingA {

	//divide and conquer
	
	public static int[] mergeSort(int[] a) {
		
		//split array into two parts
		//A[p..q], A [q+1..r]
		
		int q = a.length/2;
		
		if (q != 0) {
		
		int[] a1 = new int[q];
		int[] a2 = new int[q+1];
		
		if (a.length > 1) {
			//public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
			System.arraycopy(a, 0, a1, 0, q);
			//if (q % 2 == 0) {System.arraycopy(a, q+1, a2, 0, a2.length);}
			System.arraycopy(a, q, a2, 0, q+1);
		}
		
		System.out.println(" ");
		
		for (int x = 0; x < 2; x++) {
			for(int i = 0; i < q; i++) {
				if (x == 0) System.out.print(a1[i] + " ");
				else System.out.print(a2[i] + " ");
			}
			System.out.println(" ");
		}
		
		mergeSort(a1);
		mergeSort(a2);
		
		}
		
		return a;
	}
	
	public static int[] merge(int[] a) {
		return a;
	}
	
}
