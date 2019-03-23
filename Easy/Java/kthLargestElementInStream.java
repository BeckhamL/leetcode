class KthLargest {

    private int k;
    private ArrayList<Integer> list = new ArrayList<>();

    public KthLargest(int k, int[] nums) {
        this.k = k;

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

    }

    public int add(int val) {
        this.list.add(val);

        Collections.sort(list);

        return list.get(list.size() - k);
    }
}
