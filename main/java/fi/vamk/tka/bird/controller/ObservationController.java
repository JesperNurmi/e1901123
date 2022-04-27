package fi.vamk.tka.bird.controller;

import fi.vamk.tka.bird.entity.Observation;
import fi.vamk.tka.bird.repository.ObservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Takes care of RESTful commands for the client */
@RestController
public class ObservationController {
    @Autowired
    ObservationRepository repository;

    /**
     * Fetches all observation from database using ObservationRepository and returns observations as json
     */
    @GetMapping("/exportObservations")
    public Iterable<Observation> exportOperations() {
    	return repository.findAll();
    }
}
