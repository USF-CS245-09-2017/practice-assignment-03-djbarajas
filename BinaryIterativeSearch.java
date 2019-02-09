public class BinaryIterativeSearch implements Practice03Search{
    @Override
    public String searchName() {
        return "binary iterative";
    }
    /*
    * search()
    * binary iterative search
    * while starting position in the array is less than the end
    * position, find the middle position and compare the value in
    * the middle position to the target.  If the target is bigger
    * than the middle, the start can equal the next position after
    * the middle.  If the target is smaller than the middle, the end
    * can equal the position before the middle.  This process happens
    * until the middle equals the target or the target is not found
    * in the array
     */
    @Override
    public int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int middle = (start+end)/2;
            if(arr[middle] > target){
                end = middle-1;
            }
            else if(arr[middle] < target){
                start = middle+1;
            }
            else if(arr[middle] == target){
                return middle;
            }

        }
        return 0;
    }
}
