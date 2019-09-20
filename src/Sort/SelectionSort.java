/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;
import java.util.Scanner;
/**
 *
 * @author Le Binh An
 */

public class SelectionSort {
    public static void selectionSort(int[] n){
        for (int i = 0; i < n.length-1; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if(n[i] > n[j]){
                int temporary = n[i];
                n[i] = n[j];
                n[j] = temporary;
                }                
            }
        }
        for (int i:n ) {
            System.out.print(i + " ");
        }
    }    
}
