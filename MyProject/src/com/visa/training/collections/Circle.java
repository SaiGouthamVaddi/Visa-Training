package com.visa.training.collections;

public class Circle {

		private double radius;

		public Circle(double r) {
			super();
			this.radius = r;
		}
		
		public double getRadius() {
			return radius;
		}

		public String getShape() {
			return "Circle";
		}
		
		public double getArea() {
			return 3.14*radius*radius;
		}
}


