package com.itheima.d9_genericity_method;

public class GenericiDemo<E> {
    public static void main(String[] args) {
        String[] names = {"c", "b", "a"};
        Integer[] ages = {10, 20, 30};
        printArray(ages);

        Integer[] ages2 = pintArray(ages);
        String[] ages3 = pintArray(names);

    }
    public static <T> T[] pintArray(T[] arr) {
        return arr;
    }



    public static <T> void printArray(T[] arr){
        if(arr!=null){
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length - 1 ? "" : "");
            }
            sb.append("]");
        }else {
            System.out.println(arr);
        }

        T e = null;
    }
}
