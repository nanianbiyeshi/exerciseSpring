package com.start.web.repository;

import com.start.web.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
//继承JapRepository来完成对数据库的操作
public interface userRepository  extends JpaRepository<User, Integer> {
}
