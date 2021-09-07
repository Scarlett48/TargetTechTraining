package com.aique.db.jdbc.cache;

import com.aique.db.jdbc.entity.User;

import java.util.HashMap;
import java.util.Map;

public class Cache {

    private Map<Long, User> map  =new HashMap<>();


    public void addToCache(User u){
        if(!map.containsKey(u.getId())){
            System.out.println("User with id ="+u.getId()+" adding to cache");
            map.put(u.getId(),u) ;
        }
    }

    public User getFromCache(Long id){
        User user=null;
        if (map.containsKey(id)){
            System.out.println("Fetching user with id "+id+" from cache");
            user=map.get(id);
            return user;
        }
        else{

        }
        return user;
    }

    public boolean isPresent(Long id){
        if(map.containsKey(id)){
            return true;
        }
        return false;
    }
}
