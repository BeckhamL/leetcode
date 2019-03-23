// Problem: Some people are standing in a row in a park. There are trees between them which cannot be moved.
// Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!
// For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190]

// Solution: Keep an list of indexes of people and list of people. Sort the people list so they are increasing order. Loop through the indexes
// and update the array at that index to the correct person.
// Runtime: O(n log n)

int[] sortByHeight(int[] a) {

    ArrayList<Integer> indexes = new ArrayList<>();
    ArrayList<Integer> people = new ArrayList<>();

    for (int i = 0; i < a.length; i++) {

        if (a[i] != -1) {
            indexes.add(i);
            people.add(a[i]);
        }
    }

    Collections.sort(people);

    for (int i = 0; i < indexes.size(); i++) {
        a[indexes.get(i)] = people.get(i);
    }

    return a;
}
