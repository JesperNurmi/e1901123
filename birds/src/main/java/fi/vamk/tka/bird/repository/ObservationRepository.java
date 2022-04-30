package fi.vamk.tka.bird.repository;

import org.springframework.data.repository.CrudRepository;

import fi.vamk.tka.bird.entity.Observation;

public interface ObservationRepository extends CrudRepository<Observation, Integer>{

}
