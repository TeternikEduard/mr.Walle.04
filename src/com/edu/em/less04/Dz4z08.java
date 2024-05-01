package com.edu.em.less04;

public class Dz4z08 {

//	8. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих
//	чисел.

	public static void main(String[] args) {
		double a, b;
		double sa, sg;
		a = 3.14;
		b = -4.8;

		sa = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		sg = Math.sqrt(Math.abs(a) * Math.abs(b));

		System.out.println("Среднее арифметическое кубов чисел \"a\" и \"b\" = " + sa);
		System.out.println("Среднее геометрическое чисел \"a\" и \"b\" = " + sg);
	}
}