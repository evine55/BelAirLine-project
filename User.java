// User Entity
package model;


import java.io.Serializable;
import java.util.List;
import java.util.Set;


public class User implements Serializable { private static final long serialVersionUID = 1L;
   
    private Long id;
    
   
    private String username;
    
   
    private String firstName;
    
   
    private String lastName;
    
   
    private String phoneNumber;
    
    private String address;
    
   
    private String password;
    
   
    private String role;
    
  
    private Admin admin;
    
  
    private List<BookedTicket> bookedTickets;
    
   
    private Set<Ticket> tickets;
    
    // Constructors
    public User() {}
    
    public User(String username, String firstName, String lastName, 
                String phoneNumber, String address, String password, String role) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.password = password;
        this.role = role;
    }
    
    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getUserName() { return username; }
    public void setUserName(String username) { this.username = username; }
    
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    
    public Admin getAdmin() { return admin; }
    public void setAdmin(Admin admin) { this.admin = admin; }
    
    public List<BookedTicket> getBookedTickets() { return bookedTickets; }
    public void setBookedTickets(List<BookedTicket> bookedTickets) { this.bookedTickets = bookedTickets; }
    
    public Set<Ticket> getTickets() { return tickets; }
    public void setTickets(Set<Ticket> tickets) { this.tickets = tickets; }
}

// Role Enum
