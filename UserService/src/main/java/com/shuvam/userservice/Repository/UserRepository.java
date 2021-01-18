package com.shuvam.userservice.Repository;

import com.shuvam.userservice.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}

