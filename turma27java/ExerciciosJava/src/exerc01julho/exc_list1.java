package src.exer06julho;

import java.util.Scanner;

public class exc_list1 {

	public static void main(String[] args) {
		int anos, anoHoje, meses, mesHoje, dias, diaHoje, diasPorAno, diasPorMes, diasTotal;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Hora de descobrir quanto tempo você está na terra. ");
		
		System.out.println("Qual é o ano que você está?");
		anoHoje = leia.nextInt();
		
		System.out.println("Em que ano você nasceu?");
		anos = leia.nextInt();
		
		System.out.println("Qual é o mês que você está?");
		mesHoje = leia.nextInt();
		
		System.out.println("E em que mês você nasceu?");
		meses = leia.nextInt();
		
		System.out.println("Que dia do mês é hoje?");
		diaHoje = leia.nextInt();
		
		System.out.println("Em que dia você nasceu?");
		dias = leia.nextInt();
		
		diasPorAno = ((anoHoje-anos)*365);
		diasPorMes =((mesHoje-meses)*30);
		
		diasTotal = (diaHoje-dias) + diasPorAno + diasPorMes;
		
		System.out.println("Você está aqui há "+diasTotal+" dias!");

	}}


