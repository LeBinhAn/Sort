/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

/**
 *
 * @author Le Binh An
 */
public class HeapSort {
    public static void heapSort(int[] array){
        int n = array.length;
        for (int i =   n/2 - 1;i >= 0; i--){
            createHeap(array, n, i);
        }
        for (int i = n-1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            createHeap(array, n, i);
        }
        for (int a:array) {
            System.out.print( a + " ");
        }
    }
    static void createHeap(int[] array, int n, int i){
        int largest = i;
        int leftChild = 2*i+1;
        int rightChild = 2*i+2 ;
        if (leftChild < n && array[leftChild] > array[largest] ) {
            largest = leftChild;
        }
        if (rightChild < n && array[rightChild] > array[largest]) {
            largest = rightChild;
        }
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            createHeap(array, n, largest);
        }
    }
}
