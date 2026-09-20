package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.User;


public interface UserService extends Remote {

    boolean registerUser(User user) throws RemoteException;

    List<User> getAllUsers() throws RemoteException;

    User getUserByUsername(String username) throws RemoteException;

    boolean updateUser(User user) throws RemoteException;

    boolean deleteUser(String username) throws RemoteException;

    boolean usernameExists(String username) throws RemoteException;

    boolean verifyLogin(String username, String password) throws RemoteException;

    boolean updateRoleToAdmin(String username) throws RemoteException;

    boolean updateRoleToUser(String username) throws RemoteException;
}
