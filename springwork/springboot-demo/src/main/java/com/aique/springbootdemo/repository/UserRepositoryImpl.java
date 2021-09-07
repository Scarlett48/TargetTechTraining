package com.aique.springbootdemo.repository;

import com.aique.springbootdemo.exception.ApplicationException;
import com.aique.springbootdemo.config.NativeJDBC;
import com.aique.springbootdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{
    @Autowired
    private NativeJDBC nativeJDBC;

    //database related methods and logic should go here

    List<User> users = new ArrayList<>();

    @Override
    public List<User> getUsers() {
        populateUsers();
        return users;
    }

    @Override
    public User getUser(Long id){
        populateUsers();
        User user=null;
        for (User u: users){
            if (u.getId()==id){
                user=u;
            }
        }
        return user;
    }

    public boolean saveUser(User user)  {
        //use your jdbc specific classes for communicating with database
        try {
            nativeJDBC.insertUser(user);
        }catch (ApplicationException ex){
            ex.printStackTrace();
        }
        //users.add(user);
        return true;
    }

    @Override
    public boolean updateUser(User user) {
        populateUsers();
        User u1=null;
        for (User u: users){
            if (u.getId()==user.getId()){
                u1=u;
            }
        }
        users.remove(u1);
        users.add(user);

        return true;
    }


    @Override
    public boolean deleteUser(Long id) {
        populateUsers();

        User u1=null;
        for (User u: users){
            if (u.getId()==id){
                u1=u;
            }
        }
        users.remove(u1);

        return true;
    }

    private void populateUsers(){
        users.add(new User(1L,"Tom",25,5000));
        users.add(new User(2L,"Maria",23,25000));
        users.add(new User(3L,"John",35,50000));
    }
}
