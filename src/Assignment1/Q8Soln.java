package Assignment1;
class Q8Soln {
    public static int[] findErrorNums(int[] nums) {
        int x[] = new int[nums.length + 1];

        // Count the occurrences of each number
        for (int i : nums) {
            x[i]++;
        }

        int dup = 0, miss = 0;

        // Find the duplicate and missing numbers
        for (int i = 1; i < x.length; i++) {
            if (x[i] == 2) {
                dup = i;
            }
            if (x[i] == 0) {
                miss = i;
            }
        }

        // Return the result as an array
        return new int[]{dup, miss};
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        int[] arr2=findErrorNums(arr);
        for(int x:arr2){
            System.out.print(x+" ");
        }
    }
}