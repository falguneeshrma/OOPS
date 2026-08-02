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

class TypeErasure<T>{
    T value;    

    public void setVal(T value){
        this.value = value;
    }

    public T getVal(){
        return value;
    }
}
//Java coverts the type 'T' as 'Object' during runtime
class TypeErasure<Object>{
    Object value;    

    public void setVal(Object value){
        this.value = value;
    }

    public Object getVal(){
        return value;
    }
}

// or


//upper bound
class TypeErasure<T extends Number>{
    T value;    

    public void setVal(T value){
        this.value = value;
    }

    public T getVal(){
        return value;
    }
}
//Java coverts the type 'T' as 'Number' during runtime
class TypeErasure<Number>{
    Number value;    

    public void setVal(Number value){
        this.value = value;
    }

    public Number getVal(){
        return value;
    }
}






class Generics{

    //upper bound
    public static void printArray(List<? extends Number> list){  //only read access
        for( Number val : list){
            System.out.print(val + " ");
        }
    }


    //lower bound
    public static void writeArray(List<? super Number> list){
        list.add(10);
        list.get(0);                        //read access given //read and store is not allowed
        System.out.println(list.get(0));

    }
    

    public static void main(String[] args){
        List<Number> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        printArray(list);
        writeArray(list);

        //raw type 
        List ls = new ArrayList<>();
        ls.add(10);
        ls.add(10.9);
        ls.add("hello");
        for(Object obj : ls){
            System.out.println(obj);
        }
    }   
}