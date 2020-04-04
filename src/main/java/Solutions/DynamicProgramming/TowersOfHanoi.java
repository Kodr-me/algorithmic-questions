package Solutions.DynamicProgramming;

import java.util.Stack;

// > You can easily move the smallest disk from one tower to another. It's also pretty easy to move the smallest two disks from one tower to another. Can you move the smallest three disks?

//> Think about moving the smallest disk from tower X=0 to tower Y=2 using tower Z = 1 as a temporary holding spot as having a solution for f(1, X=0, Y=2, Z=1). Moving the smallest two disks is f(2, X=0, Y=2, Z=l).Given that you have a solution for f(1, X=0, Y=2, Z=1) and f(2, X=0, Y=2, Z=1), can you solve f(3, X=0, Y=2, Z=1)?


public class TowersOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        Tower[] towers = new Tower[n];
        for (int i = 0; i < 3; i++) {
            towers[i] = new Tower(i);
        }

        for (int i = n - 1; i >= 0; i--) {
            towers[0].add(i);
        }
        System.out.println("starting towers: ");
        System.out.println(towers[0]);
        System.out.println(towers[1]);
        System.out.println(towers[2]);
        towers[0].moveDisks(n, towers[2], towers[1]);

        System.out.println("ending towers: ");
        System.out.println(towers[0]);
        System.out.println(towers[1]);
        System.out.println(towers[2]);
    }

    private static class Tower {
        private Stack<Integer> disks;
        private int index;

        public Tower(int i) {
            disks = new Stack<>();
            index = i;
        }

        public void add(int d) {
            if(!disks.isEmpty() && disks.peek() <= d) System.out.println("error moving disk: " + d);
            else disks.push(d);
        }

        public void moveTopTo(Tower t) {
            int top = disks.pop();
            t.add(top);
        }

        public int getIndex() {
            return index;
        }

        public void moveDisks(int n, Tower destination, Tower buffer) {
            if (n > 0) {
                moveDisks(n - 1, buffer, destination);
                moveTopTo(destination);
                buffer.moveDisks(n - 1, destination, this);
            }
        }

        @Override
        public String toString() {
            return "Tower{" +
                    "disks=" + disks +
                    ", index=" + index +
                    '}';
        }
    }
}
