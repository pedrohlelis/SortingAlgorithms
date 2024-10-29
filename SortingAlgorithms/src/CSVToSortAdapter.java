import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import Algorithms.BubbleSort;
import Algorithms.InsertionSort;
import Algorithms.QuickSort;


public class CSVToSortAdapter {
    private List<Integer> unsortedData;
    private List<Integer> sortedData;

    public CSVToSortAdapter(String filePath) {
    	sortedData = new ArrayList<>();
    	unsortedData = new ArrayList<>();
    	readCSV(filePath);
    }
    
    public CSVToSortAdapter() {
    	sortedData = new ArrayList<>();
    	unsortedData = new ArrayList<>();
    }

    public void readCSV(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            if ((line = br.readLine()) != null && line.contains("Value")) {
                line = br.readLine();
            }
            
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    unsortedData.add(Integer.parseInt(value.trim()));
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }

    public void quickSortData() {
    	sortedData = QuickSort.sort(unsortedData);
    }
    
    public void insertionSortData() {
    	sortedData = InsertionSort.sort(unsortedData);
    }
    
    public void bubbleSortData() {
    	sortedData = BubbleSort.sort(unsortedData);
    }

    public List<Integer> getSortedData() {
        return sortedData;
    }
    
    public List<Integer> getUnsortedData() {
        return unsortedData;
    }
    
}
