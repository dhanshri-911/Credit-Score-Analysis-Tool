package com.example.user_management_service.repository;

import com.example.user_management_service.entity.Role;
import com.example.user_management_service.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserEntity,Long> {
    //UserEntity findByUserName(String userName);

    UserEntity findByUsername(String username);
//    @Query("SELECT r FROM User u JOIN u.roles r WHERE u.id = :userId")
//    List<Role> findRolesByUserId(@Param("userId") Long userId);

     //Optional<UserEntity> findByUsernameOrEmail(String usernameOrEmail, String usernameOrEmail1);
    Optional<UserEntity> findByUsernameOrEmail(String username, String email);
}
