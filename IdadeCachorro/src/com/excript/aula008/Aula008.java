package com.excript.aula008;

import java.util.Scanner;

public class Aula008 {
	
	public static void main(String[] args) {
		System.out.println("Informe a idade do seu Cachorro");
		
		Scanner in = new Scanner (System.in);
		
		int idadeCachorro = in.nextInt();
		idadeCachorro = idadeCachorro * 7;
		
		System.out.println("O seu cachorro tem "+idadeCachorro+" anos." + "Comparado a idade de um Ser Humano");
	}

}
