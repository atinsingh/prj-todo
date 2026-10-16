package com.awesomecorp.todo.todomanager.entity;
// Entity -- When you want to save data in database
// Persistence means saving to database
// Tables ->  Column and Row

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

// How Java stores data --> Object  (Class ---> Blueprint, Object -> instance)
// You do it yourself
// You ask JPA create
// When you want JPA to manage your entity (tables) it has rule that you should have
// primary key

@Entity
@Table(name = "MY_TODO_LIST" )
@Data
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String description;
    private TodoStatus status;
    private Date createdAt;
    private Date dueDate;
}
