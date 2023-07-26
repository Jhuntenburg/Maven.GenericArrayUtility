package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {

    private T[] array;

    public ArrayUtility(T[] inputArray) {
        this.array = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        T[] newArray = (T[]) Array.newInstance(valueToEvaluate.getClass(), array.length + arrayToMerge.length);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];

        }
        for (int i = array.length; i < array.length + arrayToMerge.length; i++) {
            newArray[i] = arrayToMerge[i - array.length];

        }
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == valueToEvaluate) {
                count++;

            }
        }


        return count;
    }


    public T getMostCommonFromMerge(T[] arrayToMerge) {
        return null;
    }


    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToEvaluate) {
                counter++;
            }

        }

        return counter;
    }


    public T[] removeValue(T valueToRemove) {
        int size = getNumberOfOccurrences(valueToRemove);
        T[] newArray = (T[]) Array.newInstance(valueToRemove.getClass(), array.length - size);
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != valueToRemove) {
                newArray[count] = array[i];
                count++;
            }

        }

        return newArray;
    }


}
