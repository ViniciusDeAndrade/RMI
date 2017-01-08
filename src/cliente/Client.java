package cliente;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.DecimalFormat;
import java.util.Scanner;


import interface_comum.IServico;

public class Client {

	public static void main(String[] args) throws RemoteException, NotBoundException{
		
		Registry registro = LocateRegistry.getRegistry("localhost",1313);
		
		IServico servico = (IServico) registro.lookup("servico");
		
		
		//System.out.println("aqui");
		System.out.println("digite o n�mero que queres que calcule o Fibonacci e o fatorial");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		//cronometro e c�lculo de fibonacci aqui
		//nada
		
		//DecimalFormat df = new DecimalFormat("##.##");
		long start = System.currentTimeMillis();
		System.out.println("� o numero fibonacci �: " +servico.fibonacci(numero));
		long finish = System.currentTimeMillis();
		double tempo = (finish - start)/1000;
				
		System.out.println("o tempo de execu��o foi de " + tempo + " segundos");
	}
}
