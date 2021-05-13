package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.result.ResultMapper;
import com.example.attentioncontolbackend.result.ResultTo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(MockitoExtension.class)
class ResultServiceTest {

    @InjectMocks
    ResultService resultService;

    @Mock
    ResultMapper resultMapper;

    List<ResultTo> results;

    @BeforeEach
    void setUp() {
        results = new ArrayList<>();
        Integer[] table = {1, 2, 3, 4, 5, 5, 6, 7, 7, 8, 8, 9, 10, 10};
        results.add(new ResultTo(1, "Jack", 11, LocalDate.now(), table, 0.89));
        results.add(new ResultTo(2, "Mick", 12, LocalDate.now(), table, 0.89));
        results.add(new ResultTo(3, "Dave", 90, LocalDate.now().plusDays(1), table, 0.89));
        results.add(new ResultTo(4, "Dave", 90, LocalDate.now().plusDays(1), table, 0.89));
        results.add(new ResultTo(5, "Dave", 90, LocalDate.now().plusDays(1), table, 0.89));
    }

    @Test
    void shouldReturnOneUser() {
//        given
        Integer idResult =1;
//        when
        ResultTo resultById = resultService.getResultById(idResult);
//        then
        assertThat(resultById).isNotNull();
    }
}
