package com.edu.em.less04;

public class Dz4z06 {

//	6. Написать программу, которая выводит на экран первые четыре степени числа π.

	public static void main(String[] args) {

		double p, res;
		int i = 0;
		p = Math.PI;

		while (i <= 4) {
			res = Math.pow(p, i);
			System.out.println("Число Пи в степени " + i + " равна " + res); // Не понял нужна ли "нулевая" степень, так
			i++;															 // что сделал до 4ой, включая 0.
		}
	}
}