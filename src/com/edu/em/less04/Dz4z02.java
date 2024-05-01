package com.edu.em.less04;

public class Dz4z02 {

//	2. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.

	public static void main(String[] args) {

		double a, b;
		double c, p, S;

		a = 3;
		b = 4;

		c = Math.sqrt((a * a) + (b * b));
		p = a + b + c;
		S = (a * b) / 2;

		System.out.println("Периметр треугольника = " + p + "\nПлощадь треугольника = " + S);
	}
}