package interface_comum;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Servico extends UnicastRemoteObject implements IServico{

	public Servico() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

	//	@Override
	public long fibonacci(int numero) throws RemoteException{
		if(numero < 0)
			return 0;
		else if ((numero ==1)|| (numero ==2))
			return 1;
		else
			return fibonacci(numero-2) + fibonacci(numero-1);
	}

	
}
