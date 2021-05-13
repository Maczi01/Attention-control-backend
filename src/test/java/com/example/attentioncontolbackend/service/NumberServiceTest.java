package com.example.attentioncontolbackend.service;

import com.example.attentioncontolbackend.logic.Game;
import com.example.attentioncontolbackend.logic.GameMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class NumberServiceTest {

    @InjectMocks
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
    @DisplayName("Method should return true for zero as given number")
    void shouldReturnTrueForZeroAsGivenNumber() {
//      given
        when(game.checkNumber("0")).thenReturn(true);
//      when
        boolean b = numbersService.checkNumber("0");
//      then
        assertThat(b).isTrue();
    }

    @Test
    @DisplayName("Method should return true for one as given number")
    void shouldReturnTrueForOneAsGivenNumber() {
//      given
        when(game.checkNumber("1")).thenReturn(true);
//      when
        boolean b = numbersService.checkNumber("1");
//      then
        assertThat(b).isTrue();
    }

    @Test
    @DisplayName("Method should return false for one as given number")
    void shouldReturnFalseForTwoAsGivenNumber() {
//      given
        when(game.checkNumber("1")).thenReturn(false);
//      when
        boolean b = numbersService.checkNumber("1");
//      then
        assertThat(b).isFalse();
    }

}
