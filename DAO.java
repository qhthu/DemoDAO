/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodao;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author quach
 */
public interface DAO<T> {

    Optional<T> get(Integer id);

    List<T> getAll();

    public void save(T t);

    public void update(T t, String[] params);

    public void delete(T t);
}
