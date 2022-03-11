package SortingAlgorithms;

public class QuickSort {
    DataStructures data = new DataStructures();

    public void driver() {
        System.out.println("Unsorted Array: ");
        int n = data.unsortedArray.length;
        data.printArray(data.unsortedArray, n);
        sort(data.unsortedArray, 0, n - 1);
        System.out.println("\nSorted Array: ");
        data.printArray(data.unsortedArray, n);


    }

    public void sort(int[] arr, int low, int high){
        if(low < high) {
            int pi = partition(arr,low,high);

            sort(arr,low, pi - 1); //sorting elements before partition
            sort(arr, pi + 1, high); //sorting after partition
        }
    }

    /**
     * this function takes the last element of the array as the pivot, places
     * the pivot elements at this correct positions in a sorted array, and places
     * all smaller (than the pivot) to the left and all greater to the right
     */
    public int partition(int[] arr, int low, int high) {
        //pivot set to the right
        int pivot = arr[high];
        int i = low - 1;

        //step through the array and 'swap' neighboring elements accordingly
        for(int j = low; j <= high - 1; j++){
            //checks that the current element is smaller than the pivot
            if(arr[j] < pivot){
                i++; //increment index of the smaller element
                swap(arr, i ,j);
            }
        }
        swap(arr, i + 1, high);
        return (i +1);
    }

    /**
     *  simply swap the elements with one another
     */
    public void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
