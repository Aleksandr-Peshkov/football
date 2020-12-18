package ru.alex.football.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.alex.football.model.Playing;

@Repository
public interface PlayingRepository extends CrudRepository<Playing,Integer> {
    @Query(value = "select 'Playing';",nativeQuery = true)
    public String func();
}
