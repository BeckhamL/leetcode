// Solution: Keep a hasmap of the points and its euclidean distance. Then, we add them into a maxheap and if we find a value
// smaller than the max, we remove the max.
// Runtime: O(n log n)

class Solution {
    public int[][] kClosest(int[][] points, int K) {

        HashMap<int[], Integer> map = new HashMap<>();
        int[][] ans = new int[K][2];

        for (int i = 0; i < points.length;i++) {

            int val = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);

            map.put(points[i], val);
        }

        // This takes the value of the hasmap and orders them highest to lowest (maxheap)
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        for (Map.Entry<int[], Integer> entry : map.entrySet()) {

            heap.add(entry.getKey());

            if (heap.size() > K) {
                heap.remove();
            }
        }

        for (int i = 0; i < K; i++) {
            ans[i] = heap.remove();
        }

        return ans;
    }
}
