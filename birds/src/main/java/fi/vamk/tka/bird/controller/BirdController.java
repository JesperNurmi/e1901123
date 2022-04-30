package fi.vamk.tka.bird.controller;

import java.io.FileReader;
import java.util.Iterator;

import com.fasterxml.jackson.databind.ObjectMapper;

import fi.vamk.tka.bird.entity.Bird;
import fi.vamk.tka.bird.repository.BirdRepository;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Takes care of RESTful commands for the client */
@RestController
public class BirdController {
    @Autowired
    BirdRepository repository;

    /**
     * Reads JSON-file, loops birds inside the file and stores the data in database
     */
    @GetMapping("/importBirds")
    public String importBirds() {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("bird.json"));
            // muunnetaan tiedosto JSON arrayksi
            JSONArray birds = (JSONArray) obj;
            Iterator<JSONObject> iterator = birds.iterator();
            while (iterator.hasNext()) {
                JSONObject bird = (JSONObject) iterator.next();
                // System.out.println(bird.toString());
                ObjectMapper mapper = new ObjectMapper();
                Bird b = mapper.readValue(bird.toString(), Bird.class);
                repository.save(b);
            }
            return "Import successful";
        } catch (Exception e) {
            return "Import failed " + e.toString();
        }

    }
    @GetMapping("/getBirds")
    public Iterable<Bird> getBirds() {
    	return repository.findAll();
    	
    }
}
