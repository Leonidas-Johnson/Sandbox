

public static void main(String[] args) {
    System.out.println("Hello World!");

    ArrayList<Integer> nums = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
        int temp = (int) (Math.random() * 100);
        nums.add(temp);
    }

    int[] A = {1, 5, 4, 9, 8, 2, 3, 6, 10, 7};

    System.out.println("kth smallest element of nums: " + Tester.MoM(nums, 3));

    System.out.println("Unsorted contents of nums: " + nums);
    System.out.println("-------------------------");
    Tester.QUICKSORT(nums, 0, nums.size() - 1);
    System.out.println("Sorted contents of nums: " + nums);
    
}