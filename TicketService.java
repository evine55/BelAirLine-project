
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Ticket;


public interface TicketService extends Remote {
    
    boolean addTicket(Ticket ticket) throws RemoteException;
    
    Ticket searchById(String ticketId) throws RemoteException;
    
    List<Ticket> readAllTickets() throws RemoteException;
    
    boolean deleteTicketById(String ticketId) throws RemoteException;
    
    boolean updateTicket(Ticket ticket) throws RemoteException;
    
    List<Ticket> searchTickets(String origin, String destination, String category) throws RemoteException;
}

