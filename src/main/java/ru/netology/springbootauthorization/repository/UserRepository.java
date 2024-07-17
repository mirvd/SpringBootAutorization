package ru.netology.springbootauthorization.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springbootauthorization.model.Authorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("root") && password.equals("1234")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("user") && password.equals("5555")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        } else if (user.equals("guest") && password.equals("guest")) {
            Collections.addAll(authorities, Authorities.READ);
        }
        return authorities;
    }
}