package ru.alex.football.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.alex.football.model.Stadium;

@Repository
public interface StadiumRepository extends CrudRepository<Stadium,Integer> {
    @Query(value = "select 'Катя лох';",nativeQuery = true)
    public String govno();
}
