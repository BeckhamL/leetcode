class Solution {
    public String[] findOcurrences(String text, String first, String second) {

        String[] arr = text.split(" ");
        ArrayList<String> list = new ArrayList<>();

        boolean f = false;
        boolean s = false;

        for (int i = 0; i < arr.length-2; i++) {

            if (arr[i].equals(first)) {
                if (arr[i+1].equals(second)) {
                    list.add(arr[i+2]);
                }
            }
        }

        String[] ans = new String[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
