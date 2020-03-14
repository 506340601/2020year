package test;
/*

11、输入一个递增排序的数组nums和一个数字target (数组nums中的数字和target的数值均为整数)，
        在数组中查找两个数，使得它们的差正好是target。如果有多对数字的差等于target，输出全部组合。

        要求: 要考虑时间复杂度和空间复杂度
        如果数组中不存在目标值，返回 [-1, -1]。
        示例 1:
        输入: nums = [1,2,4,7,8,11,15], target = 3
        输出: [4,7]， [8,11]
        示例 2:
        输入: nums = [5,7,9,10,13], target = 7
        输出: [-1,-1]
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<Integer>> twoNumSub(int[] nums,int target){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int len = nums.length;
        HashMap map = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i <len ; i++) {
            if (map.containsKey(target/nums[i])){

                list1.add((Integer) map.get(target/nums[i]));
                list1.add(nums[i]);
                list.add(list1);
            }
        }

        if (list1.size() == 0){
            list1.add(-1);
            list1.add(-1);
            list.add(list1);
        }
        return list;
    }
}
