package com._rsapi.api.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class CustomerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Map<String, Object> getTopEfServico() {
        String sql = "SELECT TOP 1 * FROM bethadba.geempre";
        return jdbcTemplate.queryForMap(sql);
    }
}
