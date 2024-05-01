package com.edu.em.less04;

public class Dz4z03 {

//	3. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).

	public static void main(String[] args) {
		double x1, x2, y1, y2;
		double l;

		x1 = -3;
		x2 = 8;
		y1 = 11;
		y2 = 33;

		l = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

		System.out.println("Расстояние между двумя точками равно " + l);
	}
}