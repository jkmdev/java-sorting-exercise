
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
	
		int[] a = new int[20];
		Random rgen = new Random();
		
		for (int i = 0; i < a.length; i++) {
			a[i] = rgen.nextInt(10);
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		SortingA.mergeSort(a);

	}

}
