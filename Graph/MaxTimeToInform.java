package Graph;

import java.util.*;

public class MaxTimeToInform {
    public static void main(String[] args) {
        int n = 6;
        int headID = 2;
        int[] manager = {2, 2, -1, 2, 2, 2};
        int[] informTime = {0, 0, 1, 0, 0, 0};
        System.out.println(maxOfMinutes(n, headID, manager, informTime));
    }

    public static int maxOfMinutes(int n, int headId, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> subordinates = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (manager[i] != -1) {
                int mgrId = manager[i];
                if (!subordinates.containsKey(mgrId)) {
                    subordinates.put(mgrId, new ArrayList<>());
                }
                subordinates.get(mgrId).add(i);
            }
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{headId, 0});
        int maxTime = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int employeeId = current[0];
            int currenTime = current[1];
            maxTime = Math.max(maxTime, currenTime);
            if (subordinates.containsKey(employeeId)) {
                for (int sub : subordinates.get(employeeId)) {
                    queue.add(new int[]{sub, currenTime + informTime[employeeId]});

                }
            }
        }
        return maxTime;
    }
}
