package unknownnote.unknownnoteserver.api.service;

import unknownnote.unknownnoteserver.api.entity.user.User;
import unknownnote.unknownnoteserver.api.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getUser(String userId) {
        return userRepository.findByUserId(userId);
    }
}
