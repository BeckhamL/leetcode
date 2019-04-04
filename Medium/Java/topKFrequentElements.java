// Solution: Keep a hashmap of integers and the frequency they occur at. Create a PriorityQueue that stores the less frequent element first.
// Add the values into the heap and when the size is larger than k, remove the smallest item (at head). Add the heap into list.
// Runtime: O(n logn)

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int val = map.get(nums[i]);
                map.put(nums[i],val+1);
            }
            else {
                map.put(nums[i], 1);
            }
        }

        // sorts from least to greatest
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1,n2) -> map.get(n1) - map.get(n2));

        for (int n : map.keySet()) {
            heap.add(n);

            if (heap.size() > k) {
                heap.poll();
            }
        }

        while (!heap.isEmpty()) {
            ans.add(heap.poll());
        }

        Collections.reverse(ans);

        return ans;
    }
}
