// Problem: Given two strings, find the number of common characters between them.
// Solution: Make 2 arrays that act as the alphabet. Loop through the characters of the string and at that characters index location, increase
// the count by 1. Get the minimum of occurences for each alphabet.
// Runtime: O(n log n)

int commonCharacterCount(String s1, String s2) {

    int[] set1 = new int[26];
    int[] set2 = new int[26];

    char[] arr = s1.toCharArray();
    char[] arr2 = s2.toCharArray();

    for (int i = 0; i < arr.length; i++) {
        set1[arr[i] - 'a'] = set1[arr[i] - 'a'] + 1;
    }

    for (int i = 0; i < arr2.length; i++) {
        set2[arr2[i] - 'a'] = set2[arr2[i] - 'a'] + 1;
    }

    int counter = 0;

    for (int i = 0; i < 26; ++i) {
         counter += Math.min(set1[i],set2[i]);
    }

    return counter;
}
