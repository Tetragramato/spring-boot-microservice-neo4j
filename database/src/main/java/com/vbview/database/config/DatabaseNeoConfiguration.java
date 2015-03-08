package com.vbview.database.config;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;

/**
 * Created by tetragramato on 08/03/2015.
 */
@Configuration
@EnableNeo4jRepositories(basePackages = "com.vbview.database.model")
public class DatabaseNeoConfiguration extends Neo4jConfiguration {
    @Bean
    GraphDatabaseService graphDatabaseService() {
        return new GraphDatabaseFactory().newEmbeddedDatabase("database/vbMicroservices.db");
    }
}
