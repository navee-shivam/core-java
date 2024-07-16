package com.interview.hackerrank;

public class Square {

	public static void main(String[] args) {
		Point3D p1 = new Point3D(1, 2, 3);
		Point3D p2 = new Point3D(4, 5, 6);
		double d2 = p1.dist2D(p2);
		double d3 = p1.dist3D(p2);
		// The code below uses runtime polymorphism to call the overridden printDistance
		// method:
		Point2D p = new Point2D(0, 0);
		p.printDistance(d2);
		p = p1;
		p.printDistance(d3);
	}
}

class Point2D {
	public int x;
	public int y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double dist2D(Point2D p) {
//		System.out.println("2D dist " + p.x + " " + p.y);
		return Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2);
	}

	public void printDistance(double d) {
		System.out.println(Math.ceil(Math.sqrt(d)));
	}
}

class Point3D extends Point2D {
	public int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public double dist3D(Point3D p) {
		return this.dist2D(p) + Math.pow(p.z - this.z, 2);

	}

	public void printDistance(double d) {
		System.out.println(Math.ceil(Math.sqrt(d)));
	}
}
