package com.andriosi.fabio.udemy.arudio.udemyarudio.model;

public class Greeting {
    private final Long id;
    private final String statement;

    public Greeting(Long id, String statement) {
        this.id = id;
        this.statement = statement;
    }

    public Long getId() {
        return id;
    }

    public String getStatement() {
        return statement;
    }
}
