// Solution: Get the first string in array and sort it. Make this as a key in a hashmap if it doesnt already exist.
// Now that we have a key, we add the strings into the arraylist.
// Runtime: (n nlogn)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }

            map.get(key).add(strs[i]);

        }

        for (Map.Entry<String, List> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;
    }
}
