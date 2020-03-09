package sort;

public class SortUtil {

    /**
     * 冒泡排序（稳定）
     * 依次比较相邻两个数，大的数往后放
     * @param a
     * @param length
     */
    public static void bubbleSort(Integer[] a, int length){
        for(int i = 0; i<length; i++){
            for(int j = 0; j<length-1-i; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

    /**
     * 选择排序（不稳定）
     * 每次选择最小的数放在合适的位置
     * @param a
     * @param length
     */
    public static void selectSort(Integer[] a, int length){
        for(int i =0; i<length; i++){
            int min = i;
            for(int j = i+1; j<length; j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            int temp = a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }

    /**
     * 插入排序（稳定）
     * 分成两部分，一部分已经拍好序，另一部分未排序，每次都把未排序部分的一个数插入排序部分的合适位置
     * @param a
     * @param length
     */
    public static void insertSort(Integer[] a, int length){
        for(int i = 1; i<length; i++){
            int value = a[i];
            int j = i-1;
            for(; j>=0; j--){
                if(a[j]>value){
                    a[j+1]=a[j];
                }else
                    break;
            }
            a[j+1]=value;
        }
    }

    /**
     * 归并排序 (不是原地排序，合并两个有序数组时需申请一个额外空间)
     * 先递归再合并
     * @param a
     * @param left
     * @param right
     */
    public static void mergeSort(Integer[] a, int left, int right){
        if(left<right){
            // 先递归
            int middle = (left+right)/2;
            mergeSort(a,left,middle);
            mergeSort(a,middle+1,right);
            // 开始合并
            merge(a,left,middle,right);
        }
    }

    /**
     * 归并排序的归并操作，即相当于合并两个有序数组
     * 递归方式合并两个有序数组
     */
    public static void merge(Integer[] a, int left, int middle, int right){
        //新建一个数组存放合并的两个有序数组，相当于合并两个有序链表时新建一个链表存放
        Integer[] temp = new Integer[right-left+1];
        //i和j相当于两个要合并的有序数组的下标
        int i = left;
        int j = middle+1;
        //k是新建的数组的下标
        int k = 0;
        while(i<=middle&&j<=right){
            if(a[i]<a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        while(i<=middle)
            temp[k++] = a[i++];
        while(j<=right)
            temp[k++] = a[j++];
        for(int k2 = 0; k2<temp.length; k2++){
            a[k2+left] = temp[k2];
        }
    }

    public static void quickSort(Integer[] a, int low, int high){
        if(low>high)
            return;
        int i = low;
        int j = high;
        int value = a[low];
        while(i<j){
            while(a[j]>=value&&i<j){
                j--;
            }
            while(a[i]<=value&&i<j){
                i++;
            }
            if(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        a[low] = a[i];
        a[i] = value;
        quickSort(a,low,i-1);
        quickSort(a,i+1,high);
    }

}
