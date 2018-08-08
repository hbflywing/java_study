package win.sz90.algorithm;

public class BinarySearch {
    public static int binarySearch(int[] sortArr,int search){
        int begin = 0;
        int end = sortArr.length;
        while(begin <= end){
            int mid = (begin+end)/2;
            if(sortArr[mid]>search){
                end = mid;
            }else if(sortArr[mid]<search) {
                begin = mid;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        System.out.println(binarySearch(array,8));

    }
}
