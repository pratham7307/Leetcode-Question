// class Solution {
//     public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
//         int count=0;
//         for(int i=0;i<arr1.length;i++){
//             boolean valid = true; 
//             for (int j = 0; j < arr2.length; j++) {
//                 if (Math.abs(arr1[i] - arr2[j]) <= d) { 
//                     valid = false; 
//                     break; } 
//                     } 
//                 if (valid) count++;
//                   }
//         return count;
//     }
// }
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);

        int count = 0;
        for (int x : arr1) {

            int left = x - d;
            int right = x + d;
            int idx = lowerBound(arr2, left);
            if (idx == arr2.length || arr2[idx] > right) {
                count++;
            }
        }

        return count;
    }
    private int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}
