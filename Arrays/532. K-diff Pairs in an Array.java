
class Solution {
	// Naive Approach
	public int findPairs(int[] nums, int k) {
		if (nums.length <= 1)
			return 0;

		Set<Pair<Integer, Integer>> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				if (Math.abs(nums[i] - nums[j]) == k) {
					Pair<Integer, Integer> pairA = new Pair(nums[i], nums[j]);
					Pair<Integer, Integer> pairB = new Pair(nums[j], nums[i]);
					if (!set.contains(pairA) && !set.contains(pairB))
						set.add(pairA);
				}
			}
		}
		return (int) (set.stream().count());
	}
}


class Solution {
	public int findPairs(int[] nums, int k) {
		if (k < 0)
			return 0;
		int pairs = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		if (k == 0) {
			for (Integer i : map.keySet())
				if (k == 0 && map.get(i) > 1)
					pairs++;
			return pairs;
		}

		int complimentary;
		for (Integer i : map.keySet()) {
			complimentary = i - k;
			if (map.containsKey(complimentary))
				pairs++;
		}

		return pairs;
	}
}
