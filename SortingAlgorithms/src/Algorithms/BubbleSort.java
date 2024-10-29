package Algorithms;
import java.util.List;

public class BubbleSort {

	public static List<Integer> sort(List<Integer> data) {
		return bubbleSort(data);
	}
	
	public static void timedBubbleSort(List<Integer> data) {
		long startTime = System.nanoTime();
        
		bubbleSort(data);
        
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000;
        
        System.out.println("BubbleSort completed in " + duration + " milliseconds.");
	}
	
	private static List<Integer> bubbleSort(List<Integer> data) {
		int n = data.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data.get(j) > data.get(j + 1)) {
                    int temp = data.get(j);
                    data.set(j, data.get(j + 1));
                    data.set(j + 1, temp);
                }
            }
        }
        return data;
	}

}
