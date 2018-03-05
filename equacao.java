package Equacao;
import java.util.Scanner;

public class equacao {
	
	public static void main(String[] args) 
	{

	double a, b, c, x1, x2, delta;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entre com um numero diferente de zero para o coeficiente 'a' de uma equacao \nde segundo grau\n");
	a = sc.nextDouble();
	
	while (a == 0) 
	{
		System.out.println("Voce digitou zero, por favor digite um número diferente de zero\n");
		a = sc.nextDouble();
	}
	
	System.out.println("Entre com um númrero para o coeficente 'b' da equacao de segundo grau\n");	
	b  = sc.nextDouble();
	
	System.out.println("Entre com um númrero para o coeficente 'c' da equacao de segundo grau\n");	
	c  = sc.nextDouble();
	
	delta = Math.pow(b,2)-4*a*c;
	
	if (delta < 0)
	{
		System.out.println("A equação não possui raízes reais\n");
	}
	else
	{
		if(delta == 0)
			{
			System.out.println("Delta igual a Zero possui uma unica raiz. O Delta é:  \n" + delta);
			x1 = ((-b+Math.sqrt(delta))/(2*a));
			System.out.println("Raiz é igual a: " + x1);
			}
		else
		{
			System.out.println("Delta maior que Zero possui duas raizes reais. O Delta é: \n" + delta);
			x1=((-b+Math.sqrt(delta))/(2*a));
			System.out.println("Raiz 1 é: \n" + x1);
			x2=((-b-Math.sqrt(delta))/(2*a));
			System.out.println("Raiz 2 é: \n" + x2);
		}
	}
}

}