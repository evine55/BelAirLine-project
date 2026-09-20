package dao;

import model.Admin;
import model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.*;

public class AdminDao {

    // Add admin to admins table
    public void addAdmin(Admin admin) {
        Transaction tx = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(admin);
            tx.commit();
            session.close();
            System.out.println("Admin added successfully.");
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    // Authenticate login as admin
    public boolean authenticateAdmin(String username, String password) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "SELECT u FROM User u, Admin a WHERE u.username = a.username AND u.username = :username AND u.password = :password";
            Query query = session.createQuery(hql);
            query.setParameter("username", username);
            query.setParameter("password", password);
            boolean result = query.uniqueResult() != null;
            session.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Check if username is already an admin
    public boolean isAlreadyAdmin(String username) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "FROM Admin WHERE username = :username";
            Query query = session.createQuery(hql);
            query.setParameter("username", username);
            boolean result = query.uniqueResult() != null;
            session.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Update user's role to 'user'
    public boolean updateRoleToUser(String username) {
        Transaction tx = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            String hql = "UPDATE User SET role = 'user' WHERE username = :username";
            Query query = session.createQuery(hql);
            query.setParameter("username", username);
            int updated = query.executeUpdate();
            tx.commit();
            session.close();
            return updated > 0;
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.out.println("Failed to revert role to user: " + e.getMessage());
            return false;
        }
    }

    // Remove admin by username
    public boolean removeAdmin(String username) {
        Transaction tx = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            String hql = "DELETE FROM Admin WHERE username = :username";
            Query query = session.createQuery(hql);
            query.setParameter("username", username);
            int deleted = query.executeUpdate();
            tx.commit();
            session.close();
            return deleted > 0;
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.out.println("Failed to remove admin: " + e.getMessage());
            return false;
        }
    }
}
