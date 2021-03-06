/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;
import java.util.Scanner;
import java.lang.Math;
import java.util.Date;

/**
 *
 * @author Le Binh An
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is sorting program!");
        System.out.print("Enter your arrays size: ");
        int size = input.nextInt();       
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.round(Math.random()*size);
        }       
        Date date = new Date();
        /*System.out.print("This is your array before sorting: ");
        for(int i:array){
            System.out.print(i + " ");
        }*/
        SelectionSort sl = new SelectionSort();
        InsertionSort is = new InsertionSort();
        BubbleSort    bs = new BubbleSort();
        HeapSort      hs = new HeapSort();
        MergeSort     ms = new MergeSort();
        System.out.println(" ");
        System.out.println("What do you want? \n\t1. Selection Sort, 2. Insertion Sort \n\t3. Bubble Sort, 4. Heap Sort");
        System.out.print("Your choice is: ");
        int a = checkInput();
        long start = System.nanoTime();
        switch(a){
            case 1:              
                System.out.print("This is Selection sorted array: ");
                sl.selectionSort(array);      
                break;
            case 2:
                System.out.print("This is Insertion sorted array: ");
                is.insertionSort(array);
                break;
            case 3:
                System.out.print("This is bubble sorted array");
                bs.bubbleSort(array);
                break;
            case 4:
                System.out.print("This is Heap sorted array: ");
                hs.heapSort(array);
                break;
            case 5:
                System.out.println("This is merge sorted array: ");
                ms.mergeSort(array, 0, array.length-1);
                ms.print(array);
                break;                  
        }    
        long timeDuration = System.nanoTime() - start;
        System.out.println(" ");
        System.out.println("Runtime = " + timeDuration/1000000000);
    }
    static int checkInput(){
        Scanner input = new Scanner(System.in);
        Boolean flag = false;
        int a = 0;
        while(!flag){
            try{
                a = input.nextInt();
                flag = true;
            }
            catch(Exception e){
                input.nextLine();
            }
        }
        return(a);
    }    
}
