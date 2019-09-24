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
public class MergeSort {
    public static void mergeSort(int[] array, int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            mergeSort(array, left, mid);
            mergeSort(array, mid+1, right);
            merge(array, left, mid, right);
        }        
    }
    public static void merge(int[] array, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = array[left + i];
        for (int j = 0; j < n2; ++j) 
            R[j] = array[mid + 1 +j];   
        int i = 0, j = 0;
        int k = left;
        while((i < n1) && (j < n2)){
            if (L[i] <= R[j]) {
            array[k] = L[i];
            i++;
            }
            else{
                array[k] = R[j];
                j++;
                }
            k++;
        }
        while(i < n1){
        array[k] = L[i];
        i++;
        k++;
        }
    }
    static void print(int[] array){
        for (int i:array) {
            System.out.print(i + " ");            
        }
        System.out.println();
    }
}