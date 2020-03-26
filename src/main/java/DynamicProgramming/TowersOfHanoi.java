package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class TowersOfHanoi {

    Tower initialTower = new Tower(3);
    Tower middleTower = new Tower();
    Tower lastTower = new Tower();

    public void solution(int disks) {
        System.out.println(initialTower.disks);
    }

    private class Tower {
        List<Disk> disks = new ArrayList<>();

        public Tower() {}

        public Tower(int diskNumber) {
            for (int i = 0; i < diskNumber; i++) {
                this.disks.add(new Disk(i));
            }
        }
    }

    private class Disk {
        int data;

        public Disk(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Disk{" +
                    "data=" + data +
                    '}';
        }
    }
}
