package ru.alex.football.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.alex.football.model.Trainer;

@Repository
public interface TrainerRepository extends CrudRepository<Trainer,Integer> {
@Query(value = "select 'Катя лох';",nativeQuery = true)
    public String govno();
}
