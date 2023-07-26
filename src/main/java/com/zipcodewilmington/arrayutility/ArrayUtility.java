package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {

    private  T[] array;

    public ArrayUtility(T[] inputArray) {
        this.array = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        return 0;
    }
    
    
    public T getMostCommonFromMerge(T[] arrayToMerge) {
        return null;
    }
    
    
    public Integer getNumberOfOccurrences(T valueToEvaluate) {
       int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToEvaluate){
                counter++;
            }

        }

        return counter;
    }
    
    
    public T[] removeValue(T valueToRemove) {
        int size = getNumberOfOccurrences(valueToRemove);
        T[] newArray = (T[]) Array.newInstance(valueToRemove.getClass(), array.length-size);
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != valueToRemove){
                newArray[count] = array[i];
                count++;
            }

        }

        return newArray;
    }

    

   

 
}
