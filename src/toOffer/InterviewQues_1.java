package toOffer;

/**
 * Created by wenjie.zhou on 2017/7/10.
 */

public class InterviewQues_1 {
    public static void main(String[] args){
        int[][] arr = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };
        int data = 5;
        System.out.println(isElement(arr , data));
    }

    public static boolean isElement(int[][] arr, int data) {
        int i = 0 , j = arr[0].length -1;
        while (i<=arr.length-1 && j>=0) {
            while (j >= 0 && arr[i][j] > data) j--;
            if (j < 0) return false;
            while (i <= arr.length - 1 && arr[i][j] < data) i++;
            if (i > arr.length - 1) return false;

            if (arr[i][j] == data) return true;
        }
        return false ;

        /*int low = 0, high = 0 , mid = 0;
        for(int i=0; i<arr.length; i++ ){
            low = 0;
            high = arr[i].length - 1;
            while(low <= high) {
                mid = low + (high - low) / 2;
                if(arr[i][mid] == data) {
                    return true;
                } else if(arr[i][mid] > data) {
                    high = mid - 1;
                } else {
                    low =mid + 1;
                }
            }
        }
        return false;*/
    }
}
