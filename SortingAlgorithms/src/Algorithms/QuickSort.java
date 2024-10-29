package Algorithms;
import java.util.List;
import java.util.Random;


public class QuickSort{
	
	private static Random random = new Random();
	
	public static List<Integer> sort(List<Integer> data) {
        return quickSort(data, 0, data.size() - 1);
    }
	
	public static void timedQuickSort(List<Integer> data) {
		long startTime = System.nanoTime();
        
        quickSort(data, 0, data.size() - 1);
        
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000;
        
        System.out.println("QuickSort completed in " + duration + " milliseconds.");
	}

    private static List<Integer> quickSort(List<Integer> data, int low, int high) {
        if (low < high) {
            int pi = partition(data, low, high);
            quickSort(data, low, pi - 1);
            quickSort(data, pi + 1, high);
        }
        return data;
    }
    

    private static int partition(List<Integer> data, int low, int high) {
        int randomPivotIndex = low + random.nextInt(high - low + 1);
        swap(data, randomPivotIndex, high);

        int pivot = data.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (data.get(j) < pivot) {
                i++;
                swap(data, i, j);
            }
        }
        swap(data, i + 1, high);
        return i + 1;
    }

    private static void swap(List<Integer> data, int i, int j) {
        int temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
    }

}
