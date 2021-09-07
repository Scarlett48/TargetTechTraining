package com.aique.db.jdbc.dao;

import com.aique.db.jdbc.cache.Cache;
import com.aique.db.jdbc.entity.User;
import com.aique.db.jdbc.pg.ConnectionFactory;

import java.sql.*;
import java.util.*;

public class UserDaoImpl implements UserDao{

    private Cache cache;

    public UserDaoImpl(Cache cache){
        this.cache=cache;
    }

    @Override
    public Optional<User> getUser(Long id) {


        User user=null;
        try {
            if(!cache.isPresent(id)) {
                System.out.println("Fetching data from database....");
                Connection conn = ConnectionFactory.getPGConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE id=" + id);

                if (rs.next()) {
                    user = populateUserFromResults(rs);
                    cache.addToCache(user);
                    return Optional.ofNullable(user);
                }
            }
            else {
                user=cache.getFromCache(id);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Optional.ofNullable(user);
    }

    @Override
    public Optional<User> getUserByName(String name) {
        Connection conn = ConnectionFactory.getPGConnection();
        User user =null;
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE name=?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                user =populateUserFromResults(rs);
                return Optional.ofNullable(user);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public List<User> getUsers(Long id) {
        Connection connection = ConnectionFactory.getPGConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            List<User> users = new ArrayList<>();

            while(rs.next()) {
                User user =populateUserFromResults(rs);

                users.add(user);
            }

            return users;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    @Override
    public int addUser(User user) {
        Connection connection = ConnectionFactory.getPGConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO users VALUES (?, ?, ?, ?,?)");
            ps.setLong(1, user.getId());
            ps.setString(2, user.getName());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getCountry());
            ps.setString(5, user.getPassword());
            int i = ps.executeUpdate();

            if(i == 1) {
                return i;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return 0;
    }

    @Override
    public void updateUser(User user) {
        Connection connection = ConnectionFactory.getPGConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("UPDATE users SET name=?, email=?, password=? WHERE id=?");
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setLong(4, user.getId());
            int i = ps.executeUpdate();


        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void deleteUser(Long id) {
        Connection connection = ConnectionFactory.getPGConnection();
        try {
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("DELETE FROM users WHERE id=" + id);


        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    private User populateUserFromResults(ResultSet rs) throws SQLException{
        User user = new User();
        user.setId( rs.getLong("id") );
        user.setName( rs.getString("name") );
        user.setEmail( rs.getString("email") );
        user.setCountry( rs.getString("country") );
        user.setPassword("pass123");
        return user;
    }

}
