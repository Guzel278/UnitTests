package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0,9,8};
        System.out.println(returnArray(arr));
    }

    public static int[] returnArray(int[] array){
        int[] res = new int[] {};
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                int k = 0;
                for(int y = i+1; y < array.length; y++){
                    res[k]= array[y];
                    k++;
                }

            }
        }
        return res;
    }

}