package ru.netology.authorizationservice.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorizationservice.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {

    private ConcurrentHashMap<String, User> listOfUsers = new ConcurrentHashMap<>() {{
        put("Ivan", new User("Ivan", "111",
                new ArrayList<>() {{
                    add(Authorities.READ);
                }}));
        put("Vovan", new User("Vovan", "222",
                new ArrayList<>() {{
                    add(Authorities.READ);
                    add(Authorities.DELETE);
                    add(Authorities.WRITE);
                }}));
    }};

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (!listOfUsers.containsKey(user)) {
            return Collections.emptyList();
        } else if (!listOfUsers.get(user).getPassword().equals(password)) {
            return Collections.emptyList();
        }
        return listOfUsers.get(user).getListOfAuthorities();
    }
}