package com.database.userdtoexample.Repository;



import com.database.userdtoexample.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
