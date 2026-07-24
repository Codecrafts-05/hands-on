import java.util.*;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        // Put all friend IDs in a HashSet for O(1) lookup
        Set<Integer> friendSet = new HashSet<>();
        for (int f : friends) {
            friendSet.add(f);
        }
        
        // Keep only friends, in the same order as 'order'
        List<Integer> result = new ArrayList<>();
        for (int id : order) {
            if (friendSet.contains(id)) {
                result.add(id);
            }
        }
        
        // Convert list back to array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}