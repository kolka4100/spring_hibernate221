package hiber.service;

import hiber.model.*;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    User gettoCar (String model, int series);
}
