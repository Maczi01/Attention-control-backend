package com.example.attentioncontolbackend;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class NumbersApi {

    private List<Integer> array;

    public NumbersApi() {
        this.array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
    }

    @GetMapping()
    public List<Integer> getNumbers(){
        return array;
    }
    @PostMapping()
    public void giveNumbers(@RequestBody String p){
        System.out.println(p);
    }
}
