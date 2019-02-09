public class LinearSearch implements Practice03Search {

    @Override
    public String searchName() {
        return "linear";
    }
    /*
    * search()
    * linear search, searches for a specified target
    * starting from the beginning of the array
    * until the end
     */
    @Override
    public int search(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) {
                return i;
            }
        }
        return 0;
    }
}
