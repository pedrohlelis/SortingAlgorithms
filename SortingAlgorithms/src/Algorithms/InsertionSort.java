package Algorithms;
import java.util.List;

public class InsertionSort{

	public static List<Integer> sort(List<Integer> data) {
		return insertionSort(data);
	}
	
	public static void timedInsertionSort(List<Integer> data) {
		long startTime = System.nanoTime();
        
		insertionSort(data);
        
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000;

        
        System.out.println("InsertionSort completed in " + duration + " milliseconds.");
	}
	
	private static List<Integer> insertionSort(List<Integer> data){
		for (int i = 1; i < data.size(); i++) {
            int key = data.get(i);
            int j = i - 1;

            while (j >= 0 && data.get(j) > key) {
                data.set(j + 1, data.get(j));
                j = j - 1;
            }
            data.set(j + 1, key);
        }
		return data;
	}

}
