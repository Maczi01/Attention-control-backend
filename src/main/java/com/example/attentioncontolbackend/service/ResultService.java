package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.player.ResultMapper;
import com.example.attentioncontolbackend.player.ResultTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ResultService implements ResultRepository {

    private List<ResultTo> results;
    private ResultMapper resultMapper;

    @Autowired
    public ResultService(ResultMapper resultMapper) {
        results = new ArrayList<>();
        results.add(new ResultTo(1L, "Jack", 11, LocalDate.of(2020, 12, 12)));
        results.add(new ResultTo(2L, "Mick", 12, LocalDate.now()));
        results.add(new ResultTo(3L, "Dave", 90, LocalDate.now().plusDays(1)));
        this.resultMapper = resultMapper;
    }

    public List<ResultTo> getAllResults() {
        return results;
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
        results.add(resultTo);
    }

    public boolean deleteResult(long id){
        Optional<ResultTo> optionalCar = results.stream().filter(e -> e.getId() == id).findFirst();
        return results.remove(optionalCar.get());
    }
}
