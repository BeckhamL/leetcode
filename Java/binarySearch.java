public class binaryS {
  public static void main(String[] args) {

    int[] arr =  {1,2,3,4,5,6,7,8};
    System.out.println(binarySearch(arr, 10));
  }

  public static boolean binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
