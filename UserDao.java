package dao;

import model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.List;

public class UserDao {

    // Register a new user
    public boolean registerUser(User user) {
        Transaction tx = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(user);
            tx.commit();
            session.close();
            System.out.println("User registered successfully.");
            return true;
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
            return false;
        }
    }

    // Get all users
    public List<User> getAllUsers() {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "FROM User";
            Query query = session.createQuery(hql);
            List<User> users = query.list();
            session.close();
            return users;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Get a user by username
    public User getUserByUsername(String username) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "FROM User WHERE userName = :username";
            Query query = session.createQuery(hql);
            query.setParameter("username", username);
            User user = (User) query.uniqueResult();
            session.close();
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Update user
    public boolean updateUser(User user) {
        Transaction tx = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.update(user);
            tx.commit();
            session.close();
            System.out.println("User updated successfully.");
            return true;
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
            return false;
        }
    }

    // Delete user by username
    public boolean deleteUser(String username) {
        Transaction tx = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "DELETE FROM User WHERE userName = :username";
            tx = session.beginTransaction();
            Query query = session.createQuery(hql);
            query.setParameter("username", username);
            int result = query.executeUpdate();
            tx.commit();
            session.close();
            return result > 0;
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
            return false;
        }
    }

    // Check if username exists
    public boolean usernameExists(String username) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "SELECT count(*) FROM User WHERE userName = :username";
            Query query = session.createQuery(hql);
            query.setParameter("username", username);
            Long count = (Long) query.uniqueResult();
            session.close();
            return count > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Verify login
    public boolean verifyLogin(String username, String password) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "FROM User WHERE userName = :username AND password = :password";
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

    // Update role to admin
    public boolean updateRoleToAdmin(String username) {
        Transaction tx = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "UPDATE User SET role = 'admin' WHERE userName = :username";
            tx = session.beginTransaction();
            Query query = session.createQuery(hql);
            query.setParameter("username", username);
            int updated = query.executeUpdate();
            tx.commit();
            session.close();
            return updated > 0;
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
            return false;
        }
    }

    // Update role to user
    public boolean updateRoleToUser(String username) {
        Transaction tx = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "UPDATE User SET role = 'user' WHERE userName = :username";
            tx = session.beginTransaction();
            Query query = session.createQuery(hql);
            query.setParameter("username", username);
            int updated = query.executeUpdate();
            tx.commit();
            session.close();
            return updated > 0;
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
            return false;
        }
    }
}
