package servidor;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ServiceConfigurationError;

import interface_comum.Servico;

public class Server {
	protected Server()throws RemoteException{
		super();
	}
	
	public static void main(String[] args) throws RemoteException, AlreadyBoundException{
		
		Servico servico = new Servico();
		
		Registry registro = LocateRegistry.createRegistry(1313);
		System.out.println("registro criado");
		
		registro.bind("fibonacci", servico);
	}

}
