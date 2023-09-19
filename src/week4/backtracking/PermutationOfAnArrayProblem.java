package week4.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfAnArrayProblem {
    public static void main(String[] args) {
        System.out.println("\t :::: Final Code ::::");
        int[] arr = {1, 2, 3, 4};
        List<List<Integer>> output = permute(arr);
        System.out.println(output);
    }
    static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> output = new ArrayList<>();
        permuteHelper(nums, 0, nums.length - 1, output);

//        sorting the final list
        output.sort((list1, list2) -> {
            for (int i=0; i<list1.size(); i++){
                if (!list1.get(i).equals(list2.get(i))){
                    return list1.get(i) - list2.get(i);
                }
            }
            return 0;
        });
        return output;
    }

    static void permuteHelper(int[] nums, int l, int r, List<List<Integer>> ans) {
        if (l == r){
            ArrayList<Integer> tempList = new ArrayList<>();
            for (int ele : nums){
                tempList.add(ele);
            }
            ans.add(tempList);
            return;
        }
        for (int i=l; i<=r; i++){
            swap(nums, i, l);
            permuteHelper(nums, l+1, r, ans);
            swap(nums, i, l);
        }
    }
    static void swap(int[] nums, int i, int l){
        int temp = nums[i];
        nums[i] = nums[l];
        nums[l] = temp;
    }
}
