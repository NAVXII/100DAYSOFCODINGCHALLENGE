import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args){
         ArrayList arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add( "Hello");
        arrayList.add( "World");
        printArray(arrayList);
    }
    static <E> void printArray(List<E> e){
        e.forEach(System.out::println);
    }

}
