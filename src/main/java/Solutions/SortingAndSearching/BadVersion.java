package Solutions.SortingAndSearching;

class BadVersion {

    int badVersion;

    public BadVersion(int badVersion) {
        this.badVersion = badVersion;
    }

    private boolean isBadVersion(int n) {
        return n >= this.badVersion;
    }

    public int firstBadVersion(int n) {
        if (isBadVersion(n) && !isBadVersion(n - 1)) return n;

        int low = 1;
        int max = n;

        while (low < max) {
            int mid = low + (max - low) / 2;

            System.out.println("mid " + mid);

            if (isBadVersion(mid) && !isBadVersion(mid - 1)) return mid;

            if (!isBadVersion(mid)) { // go higher
                System.out.println("going higher");
                low = mid + 1;
            } else {
                System.out.println("going lower");
                max = mid;
            }

        }

        return -1;
    }
}
