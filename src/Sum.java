public class Sum {
    public int[] twoSumSorted(int[] a, int t) {



        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == t) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};  // если ничего не нашли

    }
}
