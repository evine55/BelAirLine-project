package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.math.BigDecimal;
import java.util.Locale;

public class Ticket implements Serializable { private static final long serialVersionUID = 1L;
   
    private String ticketId;
    private String origin;
    private String destination;
    private Date date;
    private BigDecimal price;
    private String category;  // Changed from Category enum to String
    private String seat;
    private List<BookedTicket> bookings;
    private Set<User> users;
    
    // Constructors
    public Ticket() {}
    
    public Ticket(String ticketId, String origin, String destination, 
                  Date date, BigDecimal price, 
                  String category, String seat) {
        this.ticketId = ticketId;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.price = price;
        this.category = category;
        this.seat = seat;
    }
    
    // Getters and Setters
    public String getTicketId() { 
        return ticketId; 
    }
    public void setTicketId(String ticketId) { 
        this.ticketId = ticketId; 
    }
    
    public String getOrigin() { 
        return origin; 
    }
    public void setOrigin(String origin) { 
        this.origin = origin; 
    }
    
    public String getDestination() { 
        return destination; 
    }
    public void setDestination(String destination) { 
        this.destination = destination; 
    }
    
    public Date getDate() { 
        return date; 
    }
    public void setDate(Date date) { 
        this.date = date; 
    }
    
    public BigDecimal getPrice() { 
        return price; 
    }
    public void setPrice(BigDecimal price) { 
        this.price = price; 
    }
    
    public String getCategory() { 
        return category; 
    }
    public void setCategory(String category) { 
        this.category = category; 
    }
    
    public String getSeat() { 
        return seat; 
    }
    public void setSeat(String seat) { 
        this.seat = seat; 
    }
    
    public List<BookedTicket> getBookings() { 
        return bookings; 
    }
    public void setBookings(List<BookedTicket> bookings) { 
        this.bookings = bookings; 
    }
    
    public Set<User> getUsers() { 
        return users; 
    }
    public void setUsers(Set<User> users) { 
        this.users = users; 
    }

    public void setCategory(Locale.Category category) {
    if (category != null) {
        this.category = category.toString();
    } else {
        this.category = null;
    }
}

}
