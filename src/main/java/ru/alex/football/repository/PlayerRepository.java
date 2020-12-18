package ru.alex.football.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.alex.football.model.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player,Integer> {
    @Query(value = "select 'Player';",nativeQuery = true)
    public String func();
}
