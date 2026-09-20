
package model;

import java.io.Serializable;



public class Admin implements Serializable { private static final long serialVersionUID = 1L;
  
    private Long id;
    
   
    private String username;
    
   
    private User user;
    
    // Constructors
    public Admin() {}
    
    public Admin(String username, User user) {
        this.username = username;
        this.user = user;
    }
    
    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}