package Advance_Programming;
import java.util.*;

//Generic Classes

class ExampleGenerics<T>{
    private List<T> list = new ArrayList<>();

    public void add(T val){
        list.add(val);  //adds element
    }

    public void removeLast(){
        if(list.isEmpty()){
            System.out.println("List is empty");
        }
        list.remove(list.size() - 1); //last index removed
    }

    public T getElement(int index){
        return list.get(index); //gets element
    }

    public void print(){
        for( T el : list){
            System.out.print(el + " ");
        }
    }
}

//Generic Methods

class GenericMethods {
    public <T> void printArray(T[] arr){
        for (T val : arr){
            System.out.print(val + " ");
        }
    }
}

//Bounded Type Parameters

class Calculator <T extends Number>{
    public double add(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }
} 

class Generics{

    public static void printArray(List<? extends Number> list){  //only read access
        for( Number val : list){
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args){
        List<Number> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        printArray(list);
    }   
}