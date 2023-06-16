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
    public static int naiveFirstOccurrence(int arr[] , int number){
        int length = arr.length;
        int index = -1;
        for (int i = 0 ; i < length ; i++ ){
            if (arr[i]==number){
                index = i;
                break;
            }

        }
        return index;
    }//o(N) no aux space
    public static int effectiveFirstOccurrence(int arr[] , int number ){
    int length = arr.length;
    int startIndex = 0;
    int endIndex= length-1;
    int index = -1;
    while (startIndex<=endIndex){

        int mid = (startIndex+endIndex)/2;
        if (arr[mid]== number){index = mid ; break;}
        else if (arr[mid]<number){startIndex = mid+1;}
        else {endIndex=mid-1;}
    }
    return index;
    }//o(logN) no aux space
    public static int naiveLastOccurrence(int arr[] , int number){
        int length = arr.length;
        int count = -1;
        for (int i = 0 ; i < length; i++){
            if (arr[i]==number){count = i;}
        }
        return count;
    } //o(logN) no aux space
    public static int effectiveLastOccurrence(int arr[] , int number){
        int length = arr.length;
        int startIndex = 0;
        int lastIndex = length-1;
        int count = -1;
        while (startIndex <= lastIndex){
            int mid = (startIndex+lastIndex)/2;
            if (arr[mid]==number){count=mid;}
            else if(arr[mid]<number){startIndex = mid+1;}
            else {lastIndex=mid-1;}
        }
        return count;
    }

    public static void main(String[] args) {

        //BINARY SEARCH

        // int arr[] = {10 ,20 , 30 , 40 , 50 , 60};
        //int x = 40;
        //System.out.println(binarySearch(arr, 20));

        //INDEX OF FIRST OCCURRENCE

         int arr[] = {10,10 , 10 , 20 ,20 , 20 , 40};
         int x = 10;
        //NAIVE METHOD -->  System.out.println(naiveFirstOccurrence(arr ,x ));
        //EFFECTIVE METHOD--> System.out.println(effectiveFirstOccurrence(arr , x));

        //INDEX OF LAST OCCURRENCE

        //NAIVE METHOD
        //System.out.println(naiveLastOccurrence(arr, x));
        //EFFECTIVE METHOD



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
