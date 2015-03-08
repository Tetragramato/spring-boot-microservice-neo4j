package com.vbview.database.model.repository;

import com.vbview.database.model.User;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * Created by tetragramato on 08/03/2015.
 */
public interface UserRepository extends GraphRepository<User> {

}
