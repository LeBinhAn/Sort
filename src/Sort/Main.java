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
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 5 , 7, 9, 4, 3};
        SelectionSort sl = new SelectionSort();
        InsertionSort is = new InsertionSort();
        System.out.println("What do you want? 1. Bubble Sort, 2. Insertion Sort");
        int a = checkInput();
        switch(a){
            case 1:
                sl.selectionSort(array);
                break;
            case 2:
                is.insertionSort(array);
                break;
        }            
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
