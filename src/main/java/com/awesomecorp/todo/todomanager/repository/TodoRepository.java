package com.awesomecorp.todo.todomanager.repository;

import com.awesomecorp.todo.todomanager.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
    Spring Data JPA
    it says define repo interface and extend from JPA ones, I will
    provide implementation, but you need to follow rules or
    use default methods
 */
@Repository
// It does provide translation of your Data Base Exception
public interface TodoRepository extends JpaRepository<Todo,Integer> {
}
