package ch05.array04;

import java.util.Scanner;

//3. 7명의 학생의 학점을 입력받고 총점과 평균을 출력하세요
public class Resolve3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] grade = new double[7];

		for (int i = 0; i <grade.length; i++) {
			System.out.print((i + 1) + "번째 학생 학점을 입력하세요 >>");
			grade[i] = sc.nextDouble();
		}
		int total = 0;
		double avg = 0.;
		for (int i = 0; i < grade.length; i++) {
			total += grade[i];
		}
			avg = total / grade.length;
		

			System.out.println("총점: " + total);
			System.out.println("평균: " + avg);
			sc.close();

		}
	}
