package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.result.ResultTo;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository {

    void save(ResultTo resultTo);
}
