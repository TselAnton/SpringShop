package com.tsel.pet.project.spring.shop.repository;

import com.tsel.pet.project.spring.shop.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
