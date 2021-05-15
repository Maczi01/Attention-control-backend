package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.result.Result;
import com.example.attentioncontolbackend.result.ResultTo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends JpaRepository<Result, Integer> {

//    void save(ResultTo resultTo);
//    Result getPlayerById(Integer id);
}
