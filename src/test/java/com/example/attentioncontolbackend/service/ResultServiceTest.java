package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.result.ResultMapper;
import com.example.attentioncontolbackend.result.ResultTo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ResultServiceTest {

    @Mock
    ResultService resultService;

    @Mock
    ResultRepository resultRepository;

    @Mock
    ResultMapper resultMapper;

    ResultTo resultTo;

    @BeforeEach
    void setUp() {
        resultService = new ResultService(resultMapper);
    }

//    @Test
//    void name() {
//        Integer[] table = {1,2,3};
//        resultTo = new ResultTo(1, "Jack", 11, LocalDate.now(), table, 0.89);
//        when(resultRepository.getPlayerById(1)).thenReturn(resultTo)
//        results.add(new ResultTo();
//    }

}
