package com.edu.em.less04;

public class Dz4z10 {

//	10. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы
//	вписанной и описанной окружностей.

	public static void main(String[] args) {
		double a = 6;
		double S, h, r, R;

		h = (a * Math.sqrt(3)) / 2;
		S = (a * h) / 2;
		r = a * (Math.sqrt(3) / 6);
		R = h - r;

		System.out.println("Площадь треугольника S = " + S);
		System.out.println("Высота треугольника h = " + h);
		System.out.println("Радиус вписанной окружности r = " + r);
		System.out.println("Радиус описанной окружности R = " + R);
	}
}