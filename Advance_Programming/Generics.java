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

class Generics{

    public static void main(String[] args){
        ExampleGenerics<Integer> obj = new ExampleGenerics<Integer>();
        obj.add(10);
        obj.add(20);
        System.out.println(obj.getElement(1));
        obj.removeLast();
        obj.print();
        
        System.out.println();

        Integer[] arr = {1, 2, 3};
        GenericMethods obj1 = new GenericMethods();
        obj1.printArray(arr);
    }   
}