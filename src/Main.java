import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};

        System.out.println(sortedSquares(nums));
        System.out.println(twoPointersSquare(nums));
    }

    public static int[] sortedSquares(int [] nums){
        return Arrays.stream(nums).map(num -> num * num).sorted().toArray();
    }

    public static int[] twoPointersSquare(int[] nums){
        var output = new int[nums.length];
        int head = 0, tail = nums.length - 1, index = tail;

        while(index >= 0){
            var squaredHead = nums[head] * nums[head];
            var squaredTail = nums[tail] * nums[tail];

            if(squaredHead >= squaredTail){
                output[index--] = squaredHead;
                head++;
            }else{
                output[index--] = squaredTail;
                tail--;
            }
        }

        return output;
    }
}