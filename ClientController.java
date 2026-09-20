package controller;

import java.rmi.Naming;
import service.UserService;
import service.TicketService;
import service.AdminService;
import service.BookedTicketService;

public class ClientController {

    public static UserService userService;
    public static TicketService ticketService;
    public static BookedTicketService bookedTicketService;
    public static AdminService adminService;

    public static void init() {
        try {
            String url = "rmi://127.0.0.1:6000/";
            userService = (UserService) Naming.lookup(url + "userService");
            ticketService = (TicketService) Naming.lookup(url + "ticketService");
            bookedTicketService = (BookedTicketService) Naming.lookup(url + "bookedTicketService");
            adminService = (AdminService) Naming.lookup(url + "adminService");
            System.out.println("Connected to RMI server successfully.");
        } catch (Exception e) {
            System.err.println("RMI connection failed: " + e.getMessage());
        }
    }

    public static boolean isConnected() {
        return userService != null && adminService != null;
    }

    public static UserService getUserService() {
        return userService;
    }

    public static TicketService getTicketService() {
        return ticketService;
    }

    public static BookedTicketService getBookedTicketService() {
        return bookedTicketService;
    }

    public static AdminService getAdminService() {
        return adminService;
    }
}
