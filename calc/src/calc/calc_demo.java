package calc;

import java.io.IOException;
import java.util.Scanner;

public class calc_demo {
	public static void main(String[] args) throws IOException {
		
		double res=0;
		
		console calc1 = new console();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите а:");
		calc1.a = sc.nextDouble();
		System.out.println("Введите b:");
		calc1.b = sc.nextDouble();
		System.out.println("Введите операцию над числами(*,/,+,-,%):");
		
		calc1.op = (char)System.in.read();
		
		if(calc1.op == '*')res = calc1.multiplication(calc1.a, calc1.b);
		else if(calc1.op == '/')res = calc1.division(calc1.a, calc1.b);
		else if(calc1.op == '+')res = calc1.addition(calc1.a, calc1.b);
		else if(calc1.op == '-')res = calc1.subtraction(calc1.a, calc1.b);
		else if(calc1.op == '%')res = calc1.residue(calc1.a, calc1.b);
		
		System.out.println("Получите результат: " + res);
		
	
	}
}
