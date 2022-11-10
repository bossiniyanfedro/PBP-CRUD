package com.example.room.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.room.database.entitas.User;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM user")
    List<User> getAll();

    @Query("INSERT INTO user (name,kapasitas) VALUES(:name, :kapasitas)")
    void insertAll(String name, String kapasitas);

    @Query("UPDATE user SET name=:name, kapasitas=:kapasitas WHERE uid=:uid")
    void update(int uid, String name, String kapasitas);

    @Query("SELECT * FROM user WHERE uid=:uid")
    User get(int uid);

    @Delete
    void delete(User user);
}
