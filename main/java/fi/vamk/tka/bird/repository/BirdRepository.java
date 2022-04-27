package fi.vamk.tka.bird.repository;

import org.springframework.data.repository.CrudRepository;

import fi.vamk.tka.bird.entity.Bird;

public interface BirdRepository extends CrudRepository<Bird, Integer>{

}
