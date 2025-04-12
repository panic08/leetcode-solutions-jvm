package minimumOperationsToMakeArraySumDivisibleByK;

public class MinimumOperationsToMakeArraySumDivisibleByK {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        int c = 0;
        while (sum % k != 0) {
            c++;
            sum--;
        }
        return c;
    }
}
