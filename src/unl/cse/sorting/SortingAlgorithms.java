package unl.cse.sorting;

import java.util.Arrays;

public class SortingAlgorithms {

	public static Location [] javaSort(Location list[]) {
		Location result[] = Arrays.copyOf(list, list.length);
		Arrays.sort(result);
		return result;
	}
	
	public static Location [] bubbleSort(Location list[]) {
		//TODO: make a copy of the original list into an array called result
		//TODO: implement bubble sort here
		return result;
	}

	public static Location [] selectionSort(Location list[]) {
		//TODO: make a copy of the original list into an array called result
		//TODO: implement selection sort here
		return result;
	}

	public static Location [] insertionSort(Location list[]) {
		//TODO: make a copy of the original list into an array called result
		//TODO: implement insertion sort here
		return result;
	}
	
	public static Location [] quickSort(Location list[]) {
		//TODO: make a copy of the original list into an array called result
		//TODO: call quickSortRecursive here
		return result;
	}

	private static void quickSortRecursive(Location list[], int low, int high) {
		//TODO: implement quick sort here
	}
}
