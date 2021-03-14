package com.example.attentioncontolbackend.logic;

import java.util.Objects;

public class NumberTo {

    private int index;

    public NumberTo(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberTo numberTo = (NumberTo) o;
        return index == numberTo.index;
    }

    @Override
    public int hashCode() {
        return Objects.hash(index);
    }
}

