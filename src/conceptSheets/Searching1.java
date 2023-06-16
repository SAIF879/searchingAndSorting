package conceptSheets;

public class Searching1 {

    public static int binarySearch(int arr[], int number){
        int length = arr.length;
        int start = 0 ;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+end/2;
            if (arr[mid]==number) return mid;
            else if(arr[mid]<number){start = mid+1;}
            else end = mid -1;
        }
        return -1;
    } //o(logN) , no aux space

    public static void main(String[] args) {

        //BINARY SEARCH

        // int arr[] = {10 ,20 , 30 , 40 , 50 , 60};
        //int x = 40;
        //System.out.println(binarySearch(arr, 20));


        //COUNT OCCURRENCE IN SORTED ARRAY


        //NAIVE
        //EFFECTIVE

        //COUNT NO OF 1'S IN SORTED ARRAY
        //NAIVE
        //EFFECTIVE

        //SQUARE ROOT OF AN INTEGER

        //SEARCH IN INFINITE SIZED ARRAY

        //SEARCH IN SORTED ROTATED ARRAY

        //FIND PEAK ELEMENT

        //FIND PAIRS WITH GIVEN SUM

        //REPEATING ELEMENTS

        //ALLOCATE MINIMUM PAGES**

        //MEDIAN OF 2 SORTED ARRAYS WITH DIFFERENT SIZE**

        //MAJORITY ELEMENT

        //COUNT ONLY REPEATED

        //ROOF TOP

    }
}
