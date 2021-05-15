package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.result.Result;
import com.example.attentioncontolbackend.result.ResultMapper;
import com.example.attentioncontolbackend.result.ResultTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ResultService {

    private List<ResultTo> results;
    private ResultMapper resultMapper;
    private ResultRepository resultRepository;

    Integer[] table = {1, 2, 3, 4, 5, 5, 6, 7, 7, 8, 8, 9, 10, 10};

    @Autowired
    public ResultService(ResultMapper resultMapper, ResultRepository resultRepository) {
//        results = new ArrayList<>();
//        results.add(new ResultTo(1, "Jack", 11, LocalDate.now(), table, 0.89));
//        results.add(new ResultTo(2, "Mick", 12, LocalDate.now(), table, 0.89));
//        results.add(new ResultTo(3, "Dave", 90, LocalDate.now().plusDays(1), table, 0.89));
//        results.add(new ResultTo(4, "Dave", 90, LocalDate.now().plusDays(1), table, 0.89));
//        results.add(new ResultTo(5, "Dave", 90, LocalDate.now().plusDays(1), table, 0.89));
        this.resultMapper = resultMapper;
        this.resultRepository = resultRepository;
    }

    public List<ResultTo> getAllResults() {
        return resultRepository.findAll()
                .stream()
                .map(resultMapper::map2To)
                .collect(Collectors.toList());
    }

    public ResultTo addNewPlayer(ResultTo resultTo) {
        Result resultEntity = resultMapper.map2Entity(resultTo);
        Result savedResult = resultRepository.save(resultEntity);
        return resultMapper.map2To(savedResult);
    }

    public boolean deleteResult(long id) {
        Optional<ResultTo> optionalResultTo = results.stream().filter(e -> e.getId() == id).findFirst();
        return results.remove(optionalResultTo.get());
    }

    public ResultTo getResultById(Integer id) {
        return results.get(id);
    }
}
