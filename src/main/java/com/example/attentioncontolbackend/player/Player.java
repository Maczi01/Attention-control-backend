package com.example.attentioncontolbackend.player;

public class Player {

    private Long Id;
    private String name;
    private int result;

    public Player() {
    }

    public Player(Long id, String name, int result) {
        Id = id;
        this.name = name;
        this.result = result;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
