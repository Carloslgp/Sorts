package MyArrayList;

import InsertionSort.*;


public class MyArrayList<T>{
    Object[] data;
    int capacity = 2;
    int size = 0;

    public MyArrayList() {
        this.data = new Object[capacity];
    }

    public MyArrayList(int capacity) {
        this.data = new Object[capacity];
    }

    public void add (T element){
        if (size == capacity){
            increaseCapacity();
        }
        data[size] = element;
        size++;
    }

    public void add (T element, int index){
        if (size == capacity){
            increaseCapacity();
        }
        for (int i = size; i > index; i--){
            data[i] = data[i-1];
        }
        data[index] = element;
        size++;
    }

    public void remove (T element){
        for (int i=0; i<capacity; i++){
            if (data[i] == element){
                data[i] = null;
                size--;
                for (int j=i; j<capacity; j++){
                    data[j] = data[j+1];
                }return;
            }
        }
    }

    public void remove (int index){
        for (int i=index; i<size; i++){
            if (i == size - 1){
                data[i] = null;
            }else {
                data[i] = data[i + 1];
            }
        } size--;
    }

    public void set(int idx, T elmt){
        data[idx] = elmt;
    }

    public T get(int idx){
        return (T)data[idx];
    }

    public boolean contains(T elmt){
        for (int i=0; i<capacity; i++){
            if (data[i] == elmt){
                return true;
            }
        } return false;
    }

    public int indexOf(T elmt){
        for (int i=0; i<size; i++){
            if(data[i] == elmt){
                return i;
            }
        } return -1;
    }

    public Object[] toArray(){
        Object[] array = new Object[size];
        for (int i=0; i<size; i++){
            array[i] = data[i];
        }
        return array;
    }

    public void increaseCapacity(){
        int newCapacity = capacity + (capacity/2);
        Object[] copy = new Object[newCapacity];
        for (int i = 0; i < capacity; i++){
            copy[i] = data[i];
        }
        data = copy;
        capacity = newCapacity;
    }

    public void print(){
        for (int i = 0; i < this.data.length; i++){
            if (data[i] == null){
                return;
            }
            System.out.print(this.data[i] + " ");
        }
        System.out.println(" ");
    }

    public int length(){
        return size;
    }

    public void insertionSort(){
        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();

        sortingAlgorithm.insertionSort((MyArrayList<Integer>) this);
    }

    public void quickSort(){
        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();


        sortingAlgorithm.quickSort((MyArrayList<Integer>) this);
    }


    public void bubbleSort(){
        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();

        sortingAlgorithm.bubbleSort((MyArrayList<Integer>) this);
    }

}