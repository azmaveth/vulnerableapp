package com.example.vulnerableapp.model;

public class User {
    private final long id;
    private final String name;
    private final boolean isMinor;

    public User(long id, String name, boolean isMinor) {
        this.id = id;
        this.name = name;
        this.isMinor = isMinor;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isMinor() {
        return this.isMinor;
    }
}