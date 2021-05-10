package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.logic.Game;
import com.example.attentioncontolbackend.logic.GameMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class NumberServiceTest {

    @Mock
    NumbersService numbersService;

    @Mock
    Game game;

    @Mock
    GameMapper gameMapper;

    @BeforeEach
    void setUp() {
        numbersService = new NumbersService(game, gameMapper);
    }

    @Test
    @DisplayName("Result should be two")
    void resultShouldBeTwo() {
//        given
        when(game.getCounter()).thenReturn(2);
//        when
        int counter = numbersService.getResult();
//        then
        assertThat(counter).isEqualTo(2);
    }

    @Test
    void name() {
        when(numbersService.checkNumber("0")).thenReturn(true);
        when(numbersService.checkNumber("1")).thenReturn(true);
//        NumbersService ns;
        boolean b = numbersService.checkNumber("1");

        assertThat(b).isTrue();

    }

    //
//
//    private void performMakeMovePost(MakeMoveTo makeMoveTo) throws Exception {
//        ObjectMapper mapper = new ObjectMapper();
//        this.mockMvc.perform(post(MAKE_MOVE_REST)
//                .content(mapper.writeValueAsString(makeMoveTo))
//                .contentType(MediaType.APPLICATION_JSON)
//                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
//    }
}
