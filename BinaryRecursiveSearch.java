public class BinaryRecursiveSearch implements Practice03Search{
    @Override
    public String searchName() {
        return "binary recursive";
    }
    /*
     * search()
     * binary recursive search
     * calls the recrusive search function at the beginning
     * of the array
     */
    @Override
    public int search(int[] arr, int target) {
        return search(arr,target, 0,arr.length-1);
    }

    /* search()
    * binary recursive search
    * base case: starting position in the array is less than the end
    * position
    * recursive calls: find the middle position and compare the value in
    * the middle position to the target.  If the target is bigger
    * than the middle, the start can equal the next position after
    * the middle.  If the target is smaller than the middle, the end
    * can equal the position before the middle.  This process happens
    * until the middle equals the target or the target is not found
    * in the array
     */
    public int search(int[]a,int target,int start, int end){
        if(start>end) {
            return -1;
        }
        int middle = (start+end)/2;
        if(a[middle] == target){
            return middle;
        }
        else if(a[middle] < target){
            return search(a,target,middle+1,end);
        }
        else{
            return search(a,target,start,middle-1);
        }
    }
}
