package src.exer06julho;

import java.util.Scanner;

public class exc_list1 {

	public static void main(String[] args) {
		int anos, anoHoje, meses, mesHoje, dias, diaHoje, diasPorAno, diasPorMes, diasTotal;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Hora de descobrir quanto tempo voc� est� na terra. ");
		
		System.out.println("Qual � o ano que voc� est�?");
		anoHoje = leia.nextInt();
		
		System.out.println("Em que ano voc� nasceu?");
		anos = leia.nextInt();
		
		System.out.println("Qual � o m�s que voc� est�?");
		mesHoje = leia.nextInt();
		
		System.out.println("E em que m�s voc� nasceu?");
		meses = leia.nextInt();
		
		System.out.println("Que dia do m�s � hoje?");
		diaHoje = leia.nextInt();
		
		System.out.println("Em que dia voc� nasceu?");
		dias = leia.nextInt();
		
		diasPorAno = ((anoHoje-anos)*365);
		diasPorMes =((mesHoje-meses)*30);
		
		diasTotal = (diaHoje-dias) + diasPorAno + diasPorMes;
		
		System.out.println("Voc� est� aqui h� "+diasTotal+" dias!");

	}}


