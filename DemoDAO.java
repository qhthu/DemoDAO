/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodao;

/**
 *
 * @author quach
 */
public class DemoDAO {

    private static DAO<User> userDAO;

    public static void main(String[] args) {

        userDAO = new UserDAO();

        userDAO.save(new User(5, "Ho Minh Quoc Bao"));
        User user1 = userDAO.get(1).get();

        userDAO.update(user1, new String[]{"6", "Bui Minh Thuan"});

        userDAO.delete(user1);
        userDAO.getAll().forEach(u -> System.out.println("Ma so: " + u.getId() + "\nTen: " + u.getName()));
    }

}
