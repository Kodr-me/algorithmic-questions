package SortingAndSearching;

class BadVersion {
    private static int badV;

    public BadVersion(int badV) {
        this.badV = badV;
    }

    public static boolean isBadVersion(int n) {
        return n >= badV;
    }

    /*
    This solution linear solution is not really effective, O(N).
    As we know it gets broken after a certain version, we know if have to go higher or lower.
     */
    public int badSolution(int maxVersion) {
        for (int i = 1; i < maxVersion; i++) {
            if (isBadVersion(i)) return i;
        }
        return -1;
    }

    public int firstBadVersion(int max) {
        int left = 1;
        int right = max;

        while (left < right) {
            int mid = (left + right) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);
        return left;
    }

}
