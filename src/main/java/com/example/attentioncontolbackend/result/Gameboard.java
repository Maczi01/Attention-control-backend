package com.example.attentioncontolbackend.result;

import javax.persistence.Id;
import java.util.List;

//@Entity
public class Gameboard {

    @Id
    private Long id;
    List<Integer> board;

    public Gameboard() {
    }

    public Gameboard(Long id, List<Integer> board) {
        this.id = id;
        this.board = board;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Integer> getBoard() {
        return board;
    }

    public void setBoard(List<Integer> board) {
        this.board = board;
    }
}
