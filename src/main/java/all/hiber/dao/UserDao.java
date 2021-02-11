package all.hiber.dao;

import all.hiber.model.User;

import java.util.List;

public interface UserDao {
    List<User> allUsers();

    void add(User user);

    void delete(long id);

    void edit(long id, User user);

    User getById(long id);

    User getByUsername(String username);
}
