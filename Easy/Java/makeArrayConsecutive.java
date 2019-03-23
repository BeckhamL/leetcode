// Problem: For statues = [6, 2, 3, 8], the output should be makeArrayConsecutive2(statues) = 3. Ratiorg needs statues of sizes 4, 5 and 7.
// Solution: Sort the array and get the highest and lowest value. Subtract them and add 1 since we want inclusive and minus the length of the array so we have missing statues.
// Runtime: O(nlogn)

int makeArrayConsecutive2(int[] statues) {

    Arrays.sort(statues);

    int counter = 0;
    int low = statues[0];
    int high = statues[statues.length-1];

    return (high-low+1) - statues.length;
}
