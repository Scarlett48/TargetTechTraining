package com.aique.springbootdemo.config;

import com.aique.springbootdemo.exception.ApplicationException;
import com.aique.springbootdemo.constants.SQLQuery;
import com.aique.springbootdemo.model.User;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class NativeJDBC {

    public void create(String sql) throws ApplicationException {
        System.out.println(sql);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement statement = conn.createStatement();) {

            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            throw  new ApplicationException(e);
        }
    }

    public void insertUser(User user) throws ApplicationException{

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(SQLQuery.INSERT_USER);) {
            ps.setLong(1, user.getId());
            ps.setString(2, user.getName());
            ps.setInt(3, user.getAge());
            ps.setDouble(4, user.getSalary());
            System.out.println(SQLQuery.INSERT_USER);
            ps.executeUpdate();
            System.out.println("inserted records into database");
        } catch (SQLException e) {
            e.printStackTrace();
            throw  new ApplicationException(e);
        }
    }
}
