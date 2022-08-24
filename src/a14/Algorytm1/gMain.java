package a14.Algorytm1;


import java.util.ArrayList;
import java.util.Collections;

public class gMain {

    public static void main(){

        ArrayList<Point> points = new ArrayList<Point>();
        points.add(new Point("A",1,2));
        points.add(new Point("B",2,5));
        points.add(new Point("C",3,3));
        points.add(new Point("D",1,1));

        Collections.sort(points);
        for (Point loopPoint : points) {
            System.out.println(loopPoint.name);
        }


    }

    static class Point implements Comparable<Point>{
        String name;
        int x;
        int y;
        int z;

        public Point(String name, int x, int y) {
            this.name = name;
            this.x = x;
            this.y = y;
            this.z = x+y;
        }

        @Override
        public int compareTo(Point p) {
            if (this.z == p.z) {
                return 0;
            }
            else if (this.z < p.z){
                return this.z - p.z;
            }
            else {
                return this.z + p.z;
            }
        }

    }
}
