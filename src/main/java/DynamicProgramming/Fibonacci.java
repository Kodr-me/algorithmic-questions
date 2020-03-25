package DynamicProgramming;

public class Fibonacci {

    int solution(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;
        return solution(n - 1) + solution(n - 2);
    }

    int memoized(int n) {
        return memoized(n, new int[n + 1]);
    }

    private int memoized(int n, int[] cache) {
        if (n == 1 || n == 0) return n;
        if (cache[n] == 0) { // add the calculated result to the cache, in that index
            cache[n] = memoized(n - 1, cache) + memoized(n - 2, cache);
        }
        return cache[n]; // return the computation that we have done saved in the cache
    }

    int botomUp(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;

        int[] cache = new int[n];
        cache[0] = 0;
        cache[1] = 1;

        for (int i = 2; i < n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n - 1] + cache[n - 2];
    }

    int simplifiedBottomUp(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;

        int a = 0;
        int b = 1;

        for (int i = 2; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a + b;
    }
}
