package com.awesomecorp.todo.todomanager;

import com.awesomecorp.todo.todomanager.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends JpaRepository<Todo, Integer> {
}
