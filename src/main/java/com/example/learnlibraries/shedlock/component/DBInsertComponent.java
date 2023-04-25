package com.example.learnlibraries.shedlock.component;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DBInsertComponent {

    private final JdbcTemplate jdbcTemplate;

    public DBInsertComponent(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert() {
        jdbcTemplate.execute("insert into test(value) values ('10')");
    }
}
