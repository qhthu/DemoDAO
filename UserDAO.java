/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author quach
 */
public class UserDAO implements DAO<User> {

    private final List<User> users = new ArrayList<>();

    public UserDAO() {
        users.add(new User(1, "Quach Hong Thu"));
        users.add(new User(2, "Ha Thi Mai Anh"));
        users.add(new User(3, "Nguyen Thanh Truc"));
        users.add(new User(4, "Vo Thi Hong Nhun"));
    }

    @Override
    public Optional<User> get(Integer id) {

        return Optional.ofNullable(users.get(id));
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void update(User user, String[] params) {
        user.setId(Integer.parseInt(params[0]));
        user.setName(params[1]);

        users.add(user);
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }
}
