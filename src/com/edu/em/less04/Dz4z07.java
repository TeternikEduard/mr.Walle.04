package com.edu.em.less04;

public class Dz4z07 {

//	7. Найти произведение цифр заданного четырехзначного числа.

	public static void main(String[] args) {
		int a, b, c, d, x, res;
		x = 3546;

		a = x / 1000;
		b = (x - a * 1000) / 100;
		c = (x - a * 1000 - b * 100) / 10;
		d = x - a * 1000 - b * 100 - c * 10;
		res = a * b * c * d;

		System.out.println("Результат произведения цифр числа " + x + " равен " + res);
	}
}