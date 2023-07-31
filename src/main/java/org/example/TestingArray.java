package org.example;

public class TestingArray {
    public static int[] returnArray(int[] array){
        int[] result;
        int foundIndex = 0;
        int foundLength = -1;
        for(int i = array.length - 1; i >= 0 ; i--){
            if(array[i] == 0){
                foundIndex = i;
                foundLength = array.length - i - 1;
                break;
            }
        }
        if(foundLength <= 0)
        {
            return new int[0];
        }
        result = new int[foundLength];
        for(int i = 0; i < foundLength; i++)
        {
            result[i] = array[foundIndex + i + 1];
        }
        return result;
    }
    public static boolean checkArray(int[] array){
        for(int i = 0; i < array.length; i++) {
            if(array[i] != 99 && array[i] != 66){
                return false;
            }
        }
        return true;
    }
}
