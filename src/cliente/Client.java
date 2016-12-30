package cliente;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import interface_comum.Fibonacci;

public class Client {

	public static void main(String[] args) throws RemoteException, NotBoundException{
		Registry registro = LocateRegistry.getRegistry("localhost",2001);
		
		Fibonacci fib = (Fibonacci) registro.lookup("fibonacci");
		
		System.out.println("é o numero" +fib.fibonacci(4));
	}
}
