package net.htrap.dtoexamplestudent.Repository;

import net.htrap.dtoexamplestudent.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
