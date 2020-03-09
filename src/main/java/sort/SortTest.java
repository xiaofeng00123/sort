package sort;

import org.junit.Test;

public class SortTest {

    @Test
    public void bubbleTest(){
        Integer[] a = {5,7,6,9,3};
        SortUtil.bubbleSort(a,5);
        for(Integer i : a){
            System.out.println(i);
        }
    }

    @Test
    public void selectTest(){
        Integer[] a = {5,7,6,9,3};
        SortUtil.selectSort(a,5);
        for(Integer i : a){
            System.out.println(i);
        }
    }

    @Test
    public void insertTest(){
        Integer[] a = {5,7,6,9,3};
        SortUtil.insertSort(a,5);
        for(Integer i : a){
            System.out.println(i);
        }
    }

    @Test
    public void mergeTest(){
        Integer[] a = {5,7,6,9,3};
        SortUtil.mergeSort(a,0,4);
        for(Integer i : a){
            System.out.println(i);
        }
    }

    @Test
    public void quickTest(){
        Integer[] a = {5,7,6,9,3};
        SortUtil.quickSort(a,0,4);
        for(Integer i : a){
            System.out.println(i);
        }
    }

}
