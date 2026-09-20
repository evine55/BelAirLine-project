package dao;

import model.Ticket;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.List;

public class TicketDao {

    public Ticket addTicket(Ticket ticket) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();

            // Generate and set custom ticket ID like "BEL001"
            String newId = generateCustomId(ss);
            ticket.setTicketId(newId);

            ss.save(ticket);
            tr.commit();
            ss.close();

            return ticket;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

  private String generateCustomId(Session ss) {
    String prefix = "BEL";
    int nextNumber = 1;

    try {
        // Get the latest ticketId ordered descending
        Query query = ss.createQuery("SELECT t.ticketId FROM Ticket t ORDER BY t.ticketId DESC");
        query.setMaxResults(1);
        String lastId = (String) query.uniqueResult();

        if (lastId != null && lastId.startsWith(prefix)) {
            String numberPart = lastId.substring(prefix.length()); // get the numeric part after "BEL"
            nextNumber = Integer.parseInt(numberPart) + 1;
        }
    } catch (Exception e) {
        e.printStackTrace();
        // fallback to 1 if error occurs
    }

    return String.format("%s%03d", prefix, nextNumber);
}



 public Ticket updateTicket(Ticket updatedTicket) {
    Transaction tr = null;
    Ticket existingTicket = null;

    if (updatedTicket.getTicketId() == null) {
        System.out.println("❌ Cannot update ticket: ticketId is null.");
        return null;
    }

    try  {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        tr = ss.beginTransaction();

        // Fetch existing ticket by ID
        existingTicket = (Ticket) ss.get(Ticket.class, updatedTicket.getTicketId());

        if (existingTicket != null) {
            // Update values
            existingTicket.setOrigin(updatedTicket.getOrigin());
            existingTicket.setDestination(updatedTicket.getDestination());
            existingTicket.setDate(updatedTicket.getDate());
            existingTicket.setPrice(updatedTicket.getPrice());
            existingTicket.setCategory(updatedTicket.getCategory());
            existingTicket.setSeat(updatedTicket.getSeat());

            tr.commit();
        } else {
            System.out.println("❌ Ticket with ID " + updatedTicket.getTicketId() + " not found.");
        }

        ss.close();

    } catch (Exception e) {
        if (tr != null) tr.rollback();
        e.printStackTrace();
    }

    return existingTicket;
}


 
 
 public Ticket getTicketById(String ticketId) {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        return (Ticket) ss.get(Ticket.class, ticketId);
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}









    public Ticket deleteTicket(Ticket ticket) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(ticket);
            tr.commit();
            ss.close();
            return ticket;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Ticket searchById(String ticketId) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Ticket ticket = (Ticket) ss.get(Ticket.class, ticketId);
            ss.close();
            return ticket;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public List<Ticket> readAllTickets() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Ticket> tickets = ss.createQuery("FROM Ticket ORDER BY ticketId").list();
            ss.close();
            return tickets;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public List<Ticket> searchTickets(String origin, String destination, String category) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            String hql = "FROM Ticket WHERE origin = :origin AND destination = :destination AND category = :category";
            List<Ticket> tickets = ss.createQuery(hql)
                .setParameter("origin", origin)
                .setParameter("destination", destination)
                .setParameter("category", category)
                .list();
            ss.close();
            return tickets;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
