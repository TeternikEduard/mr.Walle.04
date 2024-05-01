package com.edu.em.less04;

public class Dz4z09 {

//	9. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.

	public static void main(String[] args) {
		double x = 5;
		double s1, s2, v;

		s1 = Math.pow(x, 2);
		s2 = s1 * 6;
		v = Math.pow(x, 3);

		System.out.println("Площадь грани равна " + s1);
		System.out.println("Площадь поверхности куба равна " + s2);
		System.out.println("Объем куба равен " + v);
	}
}