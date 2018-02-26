/*
* 实现从数组中得到相加值为目标数的两个数的位置（如果有重复则只取首先符合条件的一对结果）
* 使用HashMap方法，并且只有一遍循环;(边循环边插入)
* 将时间复杂度减少到O(n)，空间复杂度为O(n);
* 传统两遍循环时间复杂度为O(n^2);
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {1,4,8,10};
		int[] result = twoSum(nums, 11);
		
		System.out.println(Arrays.toString(result));
	}
	public static int[] twoSum(int[] nums,int target) {
		Map<Integer,Integer> maps = new  HashMap<>();
		for(int i = 0;i<nums.length;i++) {
			int number = target - nums[i] ;
			if (maps.containsKey(number)) {
				return new int[] {maps.get(number),i};
			}
			maps.put(nums[i], i);
		}
		throw new IllegalArgumentException("No Solution!");
	}
}
