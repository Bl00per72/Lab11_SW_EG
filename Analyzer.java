public class Analyzer {
    //method for linear search
    public static int linearSearch (String[] dataSet, String element) {
        for (int i = 0; i < dataSet.length; i++) {
            if(dataSet[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
    //method for binary search
    public static int binarySearch (String[] dataSet, String element) {
        int low = 0;
        int high = dataSet.length - 1;
        while (low <= high) {
            int mid = (low + high)/2;
            //compareTo function compares input element to array at mid
            int det = element.compareTo(dataSet[mid]);
            //if elements are the same, returns 0, and returns mid, where the element is located
            if (det == 0) {
                return mid;
            }
            //returns positive integer, ignores left half of array
            else if (det > 0) {
                low = mid + 1;
            }
            //returns negative integer, ignores right half of array
            else if (det < 0) {
                high = mid - 1;
            }
        }
        return -1;
    }
    //beginning of program
    public static void main (String[] args) {
        String[] dataArray = StringData.getData();
        //time for linear search for not_here
        long startTime1 = System.nanoTime();
        linearSearch(dataArray, "not_here");
        System.out.println("not_here, linear: " + (System.nanoTime() - startTime1) + " milliseconds");
        //time for linear search for aaaaa
        long startTime2 = System.nanoTime();
        linearSearch(dataArray, "aaaaa");
        System.out.println("aaaaa, linear: " + (System.nanoTime() - startTime2) + " milliseconds");
        //time for linear search for mzzzz
        long startTime3 = System.nanoTime();
        linearSearch(dataArray, "mzzzz");
        System.out.println("mzzzz, linear: " + (System.nanoTime() - startTime3) + " milliseconds");
        //time for binary search for not_here
        long startTime4 = System.nanoTime();
        binarySearch(dataArray, "not_here");
        System.out.println("not_here, binary: " + (System.nanoTime() - startTime4) + " milliseconds");
        //time for binary search for aaaaa
        long startTime5 = System.nanoTime();
        binarySearch(dataArray, "aaaaa");
        System.out.println("aaaaa, binary: " + (System.nanoTime() - startTime5) + " milliseconds");
        //time for binary search for mzzzz
        long startTime6 = System.nanoTime();
        binarySearch(dataArray, "mzzzz");
        System.out.println("mzzzz, binary: " + (System.nanoTime() - startTime6) + " milliseconds");
    }
//end
    //a nice little change for github
}
