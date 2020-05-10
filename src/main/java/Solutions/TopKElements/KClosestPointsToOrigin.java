package Solutions.TopKElements;

import java.util.*;

class Point {
    int x;
    int y;
    double distance;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.distance = Math.sqrt(distFromOrigin());
    }

    public int distFromOrigin() {
        // ignoring sqrt
        return (x * x) + (y * y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", distance=" + distance +
                '}';
    }
}

class KClosestPointsToOrigin {

    public static List<Point> findClosestPoints(Point[] points, int k) {
        ArrayList<Point> result = new ArrayList<>();

        PriorityQueue<Point> minHeap = new PriorityQueue<>(Comparator.comparingDouble(p -> p.distance));

        for (Point p: points) minHeap.add(p);

        for (int i = 0; i < k; i++) {
            result.add(minHeap.poll());
        }

        System.out.println(minHeap);
        System.out.println(minHeap.peek());
        // put the elements in a max heap and return k elements

        return result;
    }

    public static void main(String[] args) {
        Point[] points = new Point[] { new Point(1, 3), new Point(3, 4), new Point(2, -1) };
        List<Point> result = KClosestPointsToOrigin.findClosestPoints(points, 2);
        System.out.print("Here are the k points closest the origin: ");
        for (Point p : result)
            System.out.print("[" + p.x + " , " + p.y + "] ");
    }
}

