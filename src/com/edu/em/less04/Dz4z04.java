package com.edu.em.less04;

public class Dz4z04 {

//	4. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2),(х3, у3). Найти его периметр и площадь.

	public static void main(String[] args) {
		double x1, y1, x2, y2, x3, y3;
		double p, pp, S, a, b, c;

		x1 = 4;
		y1 = 3;
		x2 = 8;
		y2 = -4;
		x3 = -3;
		y3 = 8;

		a = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		b = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
		c = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
		p = a + b + c;
		pp = p / 2;
		S = Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));

		System.out.printf("Периметр треугольника = %5.5f\n", p);
		System.out.printf("Площадь треугольника = %5.5f", S);
	}
}