package unknownnote.unknownnoteserver.api.repository_user;

import unknownnote.unknownnoteserver.api.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserId(String userId);
}