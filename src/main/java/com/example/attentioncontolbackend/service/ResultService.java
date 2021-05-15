package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.result.Result;
import com.example.attentioncontolbackend.result.ResultMapper;
import com.example.attentioncontolbackend.result.ResultTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResultService {

    private ResultMapper resultMapper;
    private ResultRepository resultRepository;

    @Autowired
    public ResultService(ResultMapper resultMapper, ResultRepository resultRepository) {
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

    public void deleteResult(Integer id) {
        Result result = resultRepository.findById(id).get();
        resultRepository.delete(result);
    }

    public ResultTo getResultById(Integer id) {
        return resultMapper.map2To(resultRepository.findById(id).get());
    }
}
