import java.util.HashSet;

public class ConsecutiveNumbers {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        int maxLength = 0;

        for (int num : nums) {
            numSet.add(num);
        }
        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = { 49, 1, 3, 200, 2, 4, 70, 5 };
        int length = longestConsecutive(nums);
        System.out.println("The length of the longest consecutive elements sequence is: " + length);
    }
}
