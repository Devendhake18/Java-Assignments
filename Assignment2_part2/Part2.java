package Assignment2_part2;

public class Part2 {
        public static int findSmallestDistanceNeighbors(int[] arr) {
            if (arr == null || arr.length < 2) {
                System.out.println("Array must have at least 2 elements");
            }
            int minDist = Integer.MAX_VALUE;
            int minDistIndex = -1;
            for (int i = 0; i < arr.length - 1; i++) {
                int dist = arr[i + 1] - arr[i];
                if (dist < minDist) {
                    minDist = dist;
                    minDistIndex = i;
                }
            }
            return minDistIndex;
        }
}
