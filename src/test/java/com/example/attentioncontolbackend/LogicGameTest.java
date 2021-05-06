package com.example.attentioncontolbackend;


import com.example.attentioncontolbackend.logic.Game;
import com.example.attentioncontolbackend.service.NumbersService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class LogicGameTest {


    Game game = new Game();

    @Test
    @DisplayName("Array length should be equal 100")
    void arrayLengthShouldBe100() {
        // given
        int[] array = game.generateMixedArray();

        // when // then
        assertThat(array.length).isEqualTo(100);
    }

    @Test
    @DisplayName("Numbers in array should be unique")
    void numbersInArrayShouldBeUnique() throws Exception {
        // given
        int[] array = game.generateMixedArray();

        int[] noDuplicates = IntStream.of(array).distinct().toArray();

        // when // then
        assertThat(array.length).isEqualTo(noDuplicates.length);
    }

    @Test
    @DisplayName("Numbers in array are lower than 100")
    void numbersInArrayShouldBeLowerThan100(){
        // given
        int[] array = game.generateMixedArray();

        int[] filteredArray = IntStream.of(array).filter(e -> e>=100).toArray();

        // when // then
        assertThat(filteredArray.length).isEqualTo(0);
    }

    @Test
    @DisplayName("Numbers in array are bigger than 0")
    void numbersInArrayShouldBeBigerThan0() {
        // given
        int[] array = game.generateMixedArray();

        int[] filteredArray = IntStream.of(array).filter(e -> e<0).toArray();

        // when // then
        assertThat(filteredArray.length).isEqualTo(0);
    }

    @Test
    @DisplayName("Array should contain zero")
    void arrayShouldContainZer() {
        // given
        int[] array = game.generateMixedArray();

        long count = IntStream.of(array).filter(e -> e == 0).count();

        // when // then
        assertThat(count).isEqualTo(1);
    }

    @Test
    void name() {

        NumbersService numbersService = Mockito.mock(NumbersService.class);


    }
}
