package study240712.permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> premute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(new ArrayList<>(), nums, visited, result);
        return result;
    }

    // 순열을 만들어서 result에 추가하는 함수
    void backtrack(List<Integer> curr, int[] nums, boolean[] visited, List<List<Integer>> result) {
        // basecase

        // recursive call
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;

            curr.add(nums[i]);
            visited[i] = true;
            backtrack(curr, nums, visited, result);
            curr.remove(nums[i]);
            visited[i] = false;
        }
    }
}
