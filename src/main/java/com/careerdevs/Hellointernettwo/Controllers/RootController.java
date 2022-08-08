package com.careerdevs.Hellointernettwo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
public class RootController {

    @GetMapping("/hello")
    public String helloCareerDevs() {
        return "Hello CareerDevs!!!!";
    }

    @GetMapping("/random")
    public Integer randomNumber() {
        Random rand = new Random();
        int myNumber = rand.nextInt(100);
        return myNumber;
    }

    @GetMapping("/joke")
    public String randomJoke() {
        ArrayList<String> jokes = new ArrayList<>();
        Random rand = new Random();

        // NEW LINE CHARACTERS NOT APPLIED??
        jokes.add("What did the fish say when he swam into a wall?\nDamn.");
        jokes.add("What do you call a fish with no eyes?\nA fsh.");
        jokes.add("What do you get when you combine a rhetorical question and a joke?\n...");
        jokes.add("Did you hear about the Italian chef who died?\nHe pasta-way.");
        jokes.add("Two guys walk into a bar.\nThe third guy ducks.");
        jokes.add("What do you call a fake noodle?\nAn impasta.");
        jokes.add("Did you hear about the claustrophobic astronaut?\nHe just needed some space.");

        int index = rand.nextInt(jokes.size());
        return jokes.get(index);
    }

    @GetMapping("/requestparam")
    private String requestParam(@RequestParam String gender) {
        if (gender.equals("male")) {
            return "Hey boy can I get yo numberrr?";
        } else {
            return "Hey girl can I get yo numberrr?";
        }
    }

    @GetMapping("pathvar/{name}")
    private String pathVariablePath(@PathVariable String name) {
        return "Why are you here " + name + "?";
    }
}
