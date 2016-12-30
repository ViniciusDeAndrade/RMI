package interface_comum;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Fibonacci extends Remote {

	public long fibonacci(int numero) throws RemoteException;
}
