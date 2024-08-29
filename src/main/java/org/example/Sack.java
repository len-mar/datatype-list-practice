// Sack built for ints only - additional data types would require:
// copy/pasting all fields, constructors, and methods, one for each data type
package org.example;
import java.util.Arrays;

public class Sack {
    private int[] array;

    public Sack() {
        this.array = new int[0];
    }

    public void add(int toBeAdded) {
        int[] temp = new int[this.array.length + 1];
        for (int i = 0; i < this.array.length; i++) {
            temp[i] = this.array[i];
        }
        temp[this.array.length] = toBeAdded;
        this.array = temp;
    }

    public int get(int index) {
        return array[index];
    }
    public int size(){
        return array.length;
    }

    public void removeLast(){
        int[] temp = new int[array.length-1];
        for(int i = 0; i < temp.length; i++){
            temp[i] = array[i];
        }
        this.array = temp;
    }

    // removes element at index, replaces array with a new one that's one element shorter
    public void removeByIndex(int index){
        int[] temp = new int[array.length-1];
        boolean found = false;
        for(int i = 0; i < temp.length; i++){
            // once at the index, set found to true
            if(i == index){
                found = true;
                temp[i] = array[i+1];
            }
            // after index has been found, set values with an offset
            if(found) temp[i] = array[i + 1];

            // if not found yet, replace array 1:1
            else temp[i] = array[i];
        }

        // finally, replace array with the fresh temp array
        this.array = temp;
    }

    @Override
    public String toString() {
        return "Sack: " + Arrays.toString(array) +
                '.';
    }
}