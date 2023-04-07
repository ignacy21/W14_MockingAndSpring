package pl.zajavka;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserManagementService {

    private final UserManagementRepository userManagementRepository;

    public Optional<User> findByEmail(String email) {
        return userManagementRepository.findByEmail(email);
    }

    public void create(User user) {
        if (userManagementRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException(String.format("User with email [%s] is already created.", user.getEmail()));
        }
        userManagementRepository.create(user);
    }

    public List<User> findAll() {
        return userManagementRepository.findAll();
    }

    public void update(String email, User withEmail) {
        if (userManagementRepository.findByEmail(email).isEmpty()) {
            throw new RuntimeException(String.format("User with email [%s] dosen't exist", email));
        }
        userManagementRepository.delete(email);
        userManagementRepository.create(withEmail);
    }

    public void delete(String email) {
        if (userManagementRepository.findByEmail(email).isEmpty()) {
            throw new RuntimeException(String.format("User with email [%s] doesn't exist", email));
        }
        userManagementRepository.delete(email);
    }

    public List<User> findByName(String name) {
        return userManagementRepository.findByName(name);
    }
}
