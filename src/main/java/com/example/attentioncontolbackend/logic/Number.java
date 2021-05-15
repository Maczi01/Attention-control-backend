package com.example.attentioncontolbackend.logic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Number {

    @Id
    private Long id;
    private final int index;

    public Number(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
