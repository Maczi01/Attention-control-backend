package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.logic.Game;
import com.example.attentioncontolbackend.logic.GameMapper;
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

    @Test
    void name() {
//        given
        when(game.getCounter()).thenReturn(2);
        NumbersService ns = new NumbersService(game, gameMapper);
//        when
        int counter = ns.getResult();
//        then
        assertThat(counter).isEqualTo(2);
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
