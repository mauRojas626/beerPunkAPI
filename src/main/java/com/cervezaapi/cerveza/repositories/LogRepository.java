package com.cervezaapi.cerveza.repositories;

import com.cervezaapi.cerveza.models.LogModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<LogModel, Long> {
}
