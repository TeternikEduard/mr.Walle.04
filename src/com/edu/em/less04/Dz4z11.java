package com.edu.em.less04;

public class Dz4z11 {

//	11. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.

	public static void main(String[] args) {
		double l = 13;
		double S;

		S = (Math.pow(l, 2)) / (Math.PI * 4);

		System.out.println("Площадь круга с длиной окружности \"l\" равна " + S);
	}
}