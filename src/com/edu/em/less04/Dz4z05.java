package com.edu.em.less04;

public class Dz4z05 {

//	5. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.

	public static void main(String[] args) {
		double R;
		double l, S;
		R = 3;

		l = Math.PI * 2 * R;
		S = Math.PI * Math.pow(R, 2);

		System.out.printf("Длина окружности = %5.5f\n", l);
		System.out.printf("Площадь круга = %5.5f", S);
	}
}