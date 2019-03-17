// Problem: Given an array of strings, return another array containing all of its longest strings.
// Solution: Loop through the array and if the length of the string is greater than the max; clear list and add value.
// If the curr length is the same as the max, just add into list
// Runtime: O(n)

String[] allLongestStrings(String[] inputArray) {

    ArrayList<Integer> indexes = new ArrayList<>();

    int max = 0;
    int curr = 0;

    for (int i = 0; i < inputArray.length; i++) {

        curr = inputArray[i].length();

        if (curr > max) {
            max = curr;
            indexes.clear();
            indexes.add(i);
        }
        else if (curr == max) {
            indexes.add(i);
        }
    }

    String[] ans = new String[indexes.size()];

    for (int i = 0; i < indexes.size(); i++) {
        ans[i] = inputArray[indexes.get(i)];
    }

    return ans;
}
