public class sort{
    int list[] = new int[10];
    int size, lwr = list[0], uppr = list[end];
    void swap(int list[firstElement], int list[secondElement]){
        int temp;
        temp = list[firstElement];
        list[firstElement] = list[secondElement];
        list[secondElement] = list[firstElement];
    }
    int (int list[], int noOfEle){
        int pivot = list[0];
        int start = pivot;
        int end = list[noOfEle - 1];
        while(start < end){
            while(list[start] < pivot){
                start++; 
            }
            while(list[end] > pivot){
                end--;
            }
            if(start < end)
            swap(list[start], list[end]);
        }
        swap(list[lwr], list[end]);
        return end;
    } 
    void quick(    )
    

}