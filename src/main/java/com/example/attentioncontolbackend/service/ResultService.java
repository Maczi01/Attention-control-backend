package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.result.ResultMapper;
import com.example.attentioncontolbackend.result.ResultTo;
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

    Integer[] table = {1,2,3,4,5,5,6,7,7,8,8,9,9};
    @Autowired
    public ResultService(ResultMapper resultMapper) {
        results = new ArrayList<>();
        results.add(new ResultTo(1L, "Jack", 11, LocalDate.now(), table));
        results.add(new ResultTo(2L, "Mick", 12, LocalDate.now(), table));
        results.add(new ResultTo(3L, "Dave", 90, LocalDate.now().plusDays(1), table));
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

    public boolean deleteResult(long id) {
        Optional<ResultTo> optionalResultTo = results.stream().filter(e -> e.getId() == id).findFirst();
        return results.remove(optionalResultTo.get());
    }

    public ResultTo getPlayerById(Long id) {
        Optional<ResultTo> resultTo = results.stream().filter(r -> r.getId() == id).findFirst();
        System.out.println(resultTo);
//        return resultTo.get();
        return results.get(0);
    }
}
