package com.example.attentioncontolbackend.player;

import org.springframework.stereotype.Component;

@Component
public class ResultMapper {

    public ResultTo map2To(Result result) {
        if (result != null) {
            ResultTo resultTo = new ResultTo();
            resultTo.setId(result.getId());
            resultTo.setPlayerName(result.getPlayerName());
            resultTo.setScore(result.getScore());
            resultTo.setDate(result.getDate());
            return resultTo;
        }
        return null;
    }

    public Result map2Entity(ResultTo resultTo) {
        if (resultTo != null) {
            Result result = new Result();
            result.setId(resultTo.getId());
            result.setPlayerName(resultTo.getPlayerName());
            result.setScore(resultTo.getScore());
            result.setDate(resultTo.getDate());
            return result;
        }
        return null;
    }

}
