package cn.design.behavior.strategy;

public abstract class AbstractStategy {
	public int[] split(String str, String opt) {
		String[] nums = str.split(opt);
		int rs[] = new int[2];
		rs[0] = Integer.parseInt(nums[0]);
		rs[1] = Integer.parseInt(nums[1]);
		return rs;
	}
}