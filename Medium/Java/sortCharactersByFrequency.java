// Solution: Build a hashmap to store character and frequency. Use a priority queue to store the highest frequency at front of list.
// Loop through the heap, and append the character to the string.
// Runtime: O(n log m)

class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (map.containsKey(s.charAt(i))) {

                int val = map.get(s.charAt(i));
                map.put(s.charAt(i), val +1);
            }
            else {
                map.put(s.charAt(i), 1);
            }
        }

        PriorityQueue<Character> heap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        heap.addAll(map.keySet());

        StringBuilder ans = new StringBuilder();

        while (!heap.isEmpty()) {

            char c = heap.poll();

            for (int i = 0; i < map.get(c); i++) {
                ans.append(c);
            }
        }

        return ans.toString();
    }
}
