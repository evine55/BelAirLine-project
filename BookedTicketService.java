package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.BookedTicket;

public interface BookedTicketService extends Remote {
    
    boolean bookTicket(String username, String ticketId) throws RemoteException;
    
    List<BookedTicket> getAllBookedTickets() throws RemoteException;
    
    List<BookedTicket> getBookedTicketsByUsername(String username) throws RemoteException;
}
