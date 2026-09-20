package dao;

import model.BookedTicket;
import model.Ticket;
import model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class BookedTicketDao {

    // Book a ticket for a user
    public boolean bookTicket(String username, String ticketId) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            // Load the Ticket entity by ticketId
            Ticket ticket = (Ticket) session.get(Ticket.class, ticketId);
            if (ticket == null) {
                System.out.println("Ticket ID not found: " + ticketId);
                return false;
            }

            // Load the User entity by username
            String userHql = "FROM User WHERE username = :username";
            Query userQuery = session.createQuery(userHql);
            userQuery.setParameter("username", username);
            User user = (User) userQuery.uniqueResult();
            if (user == null) {
                System.out.println("User not found: " + username);
                return false;
            }

            // Create BookedTicket object
            BookedTicket bookedTicket = new BookedTicket();
            bookedTicket.setUsername(username);
            bookedTicket.setPhoneNumber(user.getPhoneNumber());
            bookedTicket.setAddress(user.getAddress());
            bookedTicket.setBookingDate(new Date(System.currentTimeMillis()));
            bookedTicket.setTicket(ticket);
            bookedTicket.setUser(user);

            // Save the BookedTicket
            session.save(bookedTicket);

            transaction.commit();
            session.close();
            return true;

        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
        return false;
    }

    // Get all booked tickets
    public List<BookedTicket> getAllBookedTickets() {
        List<BookedTicket> list = new ArrayList<>();
        Transaction tx = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            Query query = session.createQuery("FROM BookedTicket");
            list = query.list();
            tx.commit();
            session.close();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
        return list;
    }

    // Get booked tickets by username
    public List<BookedTicket> getBookedTicketsByUsername(String username) {
        List<BookedTicket> list = new ArrayList<>();
        Transaction tx = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            String hql = "FROM BookedTicket WHERE username = :username";
            Query query = session.createQuery(hql);
            query.setParameter("username", username);
            list = query.list();
            tx.commit();
            session.close();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
        return list;
    }
}
