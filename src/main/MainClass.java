package main;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("main인 시작");
		//kim - 로그인 관련 기능 만드세요
		//cho - 회원 관리 기능을 만드세요
		Scanner input=new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1.로그인   2.회원관리");
			num=input.nextInt();
			switch(num) {
			case 1: 
				break;
			case 2:
				break;
			}
		}
	}
}
