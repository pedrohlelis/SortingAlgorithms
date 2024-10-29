import java.util.List;

import Algorithms.QuickSort;
import Algorithms.BubbleSort;
import Algorithms.InsertionSort;

public class Main {

	public static void main(String[] args) {
		CSVToSortAdapter adapter = new CSVToSortAdapter();
		
		sortingRandomData("./src/DataSets/aleatorio_100.csv", "./src/DataSets/aleatorio_1000.csv", "./src/DataSets/aleatorio_10000.csv", adapter);
		sortingAscendingData("./src/DataSets/crescente_100.csv", "./src/DataSets/crescente_1000.csv", "./src/DataSets/crescente_10000.csv", adapter);
		sortingDescendingData("./src/DataSets/decrescente_100.csv", "./src/DataSets/decrescente_1000.csv", "./src/DataSets/decrescente_10000.csv", adapter);
	}
	
	public static void sortingRandomData(String filePath1, String filePath2, String filePath3, CSVToSortAdapter adapter) {
		System.out.println("\nAlgorithms sorting random data with 100 elements: ");
		runDataComparison(filePath1, adapter);
		System.out.println("=========================================");
		System.out.println("\nAlgorithms sorting random data with 1.000 elements: ");
		runDataComparison(filePath2, adapter);
		System.out.println("=========================================");
		System.out.println("\nAlgorithms sorting random data with 10.000 elements: ");
		runDataComparison(filePath3, adapter);
		System.out.println("=========================================");
		System.out.println("=========================================");
	}
	
	public static void sortingAscendingData(String filePath1, String filePath2, String filePath3, CSVToSortAdapter adapter) {
		System.out.println("\nAlgorithms sorting ascending data with 100 elements: ");
		runDataComparison(filePath1, adapter);
		System.out.println("=========================================");
		System.out.println("\nAlgorithms sorting ascending data with 1.000 elements: ");
		runDataComparison(filePath2, adapter);
		System.out.println("=========================================");
		System.out.println("\nAlgorithms sorting ascending data with 10.000 elements: ");
		runDataComparison(filePath3, adapter);
		System.out.println("=========================================");
		System.out.println("=========================================");
	}
	
	public static void sortingDescendingData(String filePath1, String filePath2, String filePath3, CSVToSortAdapter adapter) {
		System.out.println("\nAlgorithms sorting descending data with 100 elements: ");
		runDataComparison(filePath1, adapter);
		System.out.println("=========================================");
		System.out.println("\nAlgorithms sorting descending data with 1.000 elements: ");
		runDataComparison(filePath2, adapter);
		System.out.println("=========================================");
		System.out.println("\nAlgorithms sorting descending data with 10.000 elements: ");
		runDataComparison(filePath3, adapter);
		System.out.println("=========================================");
		System.out.println("=========================================");
	}
	
	public static void runDataComparison(String filePath, CSVToSortAdapter adapter) {
		adapter.readCSV(filePath);
		List<Integer> data = adapter.getUnsortedData();
		
		
		InsertionSort.timedInsertionSort(data);

		QuickSort.timedQuickSort(data);

		BubbleSort.timedBubbleSort(data);

	}
	
}
