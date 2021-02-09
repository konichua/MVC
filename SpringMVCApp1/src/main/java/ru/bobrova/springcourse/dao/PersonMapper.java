package ru.bobrova.springcourse.dao;

import org.springframework.jdbc.core.RowMapper;
import ru.bobrova.springcourse.models.Person;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person();
        person.setId(resultSet.getInt("id"));
        person.setAge(resultSet.getInt("age"));
        person.setName(resultSet.getString("name"));
        person.setEmail(resultSet.getString("email"));

        return person;
    }
}
