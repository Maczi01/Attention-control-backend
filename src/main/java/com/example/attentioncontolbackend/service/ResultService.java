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

    Integer[] table = {1, 2, 3, 4, 5, 5, 6, 7, 7, 8, 8, 9, 10, 10};

    @Autowired
    public ResultService(ResultMapper resultMapper) {
        results = new ArrayList<>();
        results.add(new ResultTo(1, "Jack", 11, LocalDate.now(), table, 0.89));
        results.add(new ResultTo(2, "Mick", 12, LocalDate.now(), table, 0.89));
        results.add(new ResultTo(3, "Dave", 90, LocalDate.now().plusDays(1), table, 0.89));
        results.add(new ResultTo(4, "Dave", 90, LocalDate.now().plusDays(1), table, 0.89));
        results.add(new ResultTo(5, "Dave", 90, LocalDate.now().plusDays(1), table, 0.89));
        this.resultMapper = resultMapper;
    }

    public List<ResultTo> getAllResults() {
        return results;
    }

    public ResultTo addNewPlayer(ResultTo resultTo) {
        save(resultTo);
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

    public ResultTo getResultById(Integer id) {
        return results.get(id);
    }
}
