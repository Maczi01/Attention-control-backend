package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.player.ResultMapper;
import com.example.attentioncontolbackend.player.ResultTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ResultService implements ResultRepository {

    private List<ResultTo> players;
    private ResultMapper resultMapper;

    @Autowired
    public ResultService(ResultMapper resultMapper) {
        players = new ArrayList<>();
        players.add(new ResultTo(1L, "Maciej", 11, LocalDate.of(2020, 12, 12)));
        players.add(new ResultTo(2L, "Mick", 12, LocalDate.now()));
        players.add(new ResultTo(3L, "Michal", 90, LocalDate.now().plusDays(1)));
        this.resultMapper = resultMapper;
    }

    public List<ResultTo> getAllPlayers() {
        return players;
    }

    public ResultTo addNewPlayer(ResultTo resultTo) {
//        Player playerEntity = playerMapper.map2Entity(resultTo);
        save(resultTo);
//        ResultTo playerTo1 = playerMapper.map2To(savedPlayer);
        System.out.println(resultTo);
        return resultTo;
    }

    @Override
    public void save(ResultTo resultTo) {
        players.add(resultTo);
    }

    public void deleteResult(long id){
        players.remove(id);
    }
}
