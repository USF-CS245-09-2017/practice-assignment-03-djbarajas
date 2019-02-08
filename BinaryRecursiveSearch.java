public class BinaryRecursiveSearch implements Practice03Search{
    @Override
    public String searchName() {
        return "binary recursive";
    }

    @Override
    public int search(int[] arr, int target) {
        return search(arr,target, 0,arr.length-1);
    }
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
