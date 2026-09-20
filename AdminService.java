package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Admin;

public interface AdminService extends Remote {
    Admin createAdmin(Admin theAdmin) throws RemoteException;
    Admin deleteAdmin(Admin theAdmin) throws RemoteException;
    Admin updateAdmin(Admin theAdmin) throws RemoteException;

  
    boolean authenticateAdmin(String username, String password) throws RemoteException;
    boolean isAlreadyAdmin(String username) throws RemoteException;

   
}
