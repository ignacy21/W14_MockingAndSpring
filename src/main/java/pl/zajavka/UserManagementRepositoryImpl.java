package pl.zajavka;

import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class UserManagementRepositoryImpl implements UserManagementRepository {

    private final Map<String, User> userMap = new HashMap<>();

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.ofNullable(userMap.get(email));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public void create(User user) {
        userMap.put(user.getEmail(), user);
    }

    @Override
    public List<User> findByName(String name) {
        return userMap.values().stream()
                .filter(user -> name.equals(user.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public void delete(String email) {
        userMap.remove(email);
    }

}
