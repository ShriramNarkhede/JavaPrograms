import java.util.HashMap;

public class twosum {
      public static int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> rMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                  int n = nums[i];
                  int dif = n - target;
                  if (rMap.containsKey(dif)) {

                        return new int[] { rMap.get(dif), i };

                  }
                  rMap.put(n, i);
            }
            return new int[] {};

      }

      public static void main(String[] args) {

            int[] a = { 1, 5, 7, 8, 2 };
            System.out.println(twoSum(a, 3));

      }

}
