package com.example.databaseh2;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;


import com.example.databaseh2.model.Alien;
@Repository
public class AlienRepo {

    private final JdbcTemplate template;

    // Constructor injection
    public AlienRepo(JdbcTemplate template) {
        this.template = template;
    }
    

    public void save(Alien alien){
        String sql =  "insert into alien (id, name, tech) values (?,?,?)";
        template.update(sql, alien.getId(),alien.getName(),alien.getTech());
    }

    public List<Alien> findall() {
        String sql = "select * from alien";

    // Using lambda expression to implement RowMapper
        List<Alien> aliens = template.query(sql, (rs, rowNum) -> {
            Alien a = new Alien();
            a.setId(rs.getInt("id"));       // Use column names for clarity
            a.setName(rs.getString("name"));
            a.setTech(rs.getString("tech"));
            return a;
        });

        return aliens;
    }
}
