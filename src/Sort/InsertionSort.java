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
public class InsertionSort {
    public void insertionSort(int[] n){
        for (int i = 1; i < n.length; i++) {
            int v = n[i];
            int p = i;
            while((p > 0)&&(v < n[p-1])){
                n[p] = n[p - 1];
                p--;
            }
            if(p!=i){
                n[p] = v;
            }
        }
        for (int i:n ){
            System.out.print(i + " ");
        }
    }
}
