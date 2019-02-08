public class BinaryIterativeSearch implements Practice03Search{
    @Override
    public String searchName() {
        return "binary iterative";
    }

    @Override
    public int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int middle = end/2;
        while(start < end){
            middle = (start+end)/2;
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
