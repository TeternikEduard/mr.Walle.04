package com.edu.em.less04;

public class Dz4z01 {

//	1. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

	public static void main(String[] args) {
		double a = 2, b = 1, c = 5;
		double temp, res, sqr;

		temp = 2 * a;
		sqr = Math.pow(b, 2) + 4 * a * c;

		if (temp == 0) {
			System.out.println("Знаменатель равен 0");
		} else if (sqr < 0) {
			System.out.println("Корень из отрицательного числа - не то, что нам нужно!");
		} else {
			res = ((b + sqr) / temp) - Math.pow(a, 3) * c + Math.pow(b, -2);
			System.out.println("Ответ: " + res);
		}
	}
}