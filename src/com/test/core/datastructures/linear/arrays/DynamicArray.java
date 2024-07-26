package com.test.core.datastructures.linear.arrays;
/*
This program will dynamically increase/grow the size of the Array when it is full, and it should automatically shrink
when we remove elements.
 */
public class DynamicArray {

    private int[] items;
    private int count;
    public DynamicArray(int length){
        items = new int[length];
    }
    public void insert(int item) {
        if(items.length == count){
            //If the Array size is full, resize the Array by double
            int[] newItems = new int[count * 2];
            //Copy of the old Array elements into new Array
            for(int i = 0; i < count; i++){
                newItems[i] = items[i];
            }
            //Set "items" to this new array
            items = newItems;
        }
        items[count++] = item;
    }
    public void print(){
        for(int i = 0; i < items.length; i++){
            System.out.print(items[i] + " ");
        }
    }
    public void removeAt(int index){
        //Validate the index
        if(index < 0 || index >= count)
            throw new IllegalArgumentException("Index value is not found");
        //Shift the items to the left till the index position that is removed
        //[10, 20, 30, 40]
        //index : 1
        // 1 <- 2
        // 2 <- 3
        for(int i = index; i < count; i++){
            items[i] = items[i + 1];
        }
        count--;
    }
    public int indexOf(int item){
        //If we find return the index otherwise return -1
        //Time complexity is O(1) in best case and O(n) in worst case and we need to consider the worst case scenario
        //so the Time complexity is O(n)
        for(int i = 0; i < count; i++) {
            if (items[i] == item)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(3);
        dynamicArray.insert(10);
        dynamicArray.insert(20);
        dynamicArray.insert(30);
        dynamicArray.insert(40);
        //dynamicArray.removeAt(3);
        System.out.println(dynamicArray.indexOf(50));
        dynamicArray.print();
    }
}
