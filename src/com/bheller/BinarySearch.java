package com.bheller;

/**
 * Created with IntelliJ IDEA.
 * User: bheller84
 * Date: 11/8/12
 * Time: 1:19 PM
 * To change this template use File | Settings | File Templates.
 */


public class BinarySearch {

    public boolean binarySearch(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;


        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return true;
            }

            if (arr[mid] < key) {
                low = mid +1;
            }

            if (arr[mid] > key) {
                high = mid -1;
            }
        }


        return false;

    }

    public static void main(String[] args) {

        BinarySearch objBinarySearch = new BinarySearch();


        int[] array = {1, 2, 3, 4, 5, 8, 9, 10};
        boolean result = objBinarySearch.binarySearch(array, 5);


        System.out.println("Found? " + result);


    }
}
