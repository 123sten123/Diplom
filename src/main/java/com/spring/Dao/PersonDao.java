package com.spring.Dao;

import com.spring.User.Test;
import com.spring.User.User;
import com.spring.model.Person;
import java.util.List;

/**
 * Created by Степан1 on 04.04.2018.
 */
public interface PersonDao {
    public void save(Test user);

    public List<Test> listContact();

    public void removeContact(Integer id);
}
