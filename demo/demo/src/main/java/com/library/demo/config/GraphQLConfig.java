package com.library.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

import graphql.scalars.ExtendedScalars;

@Configuration//This annotation marks the class as a configuration class. In Spring, this is a class that can define beans that will be managed by the Spring container.
public class GraphQLConfig {

    @Bean//The runtimeWiringConfigurer method is annotated with @Bean, meaning it defines a bean that Spring will manage in the application context.
    public RuntimeWiringConfigurer runtimeWiringConfigurer() {
        return wiringBuilder -> wiringBuilder
            .scalar(ExtendedScalars.GraphQLLong)  // Add Long scalar support
            .scalar(ExtendedScalars.DateTime);     // Add DateTime scalar support (optional)
    }
}

/*
 * 
 * This class provides a custom configuration for the GraphQL execution environment in a Spring application.
 *  It adds support for Long and DateTime scalars, which are not part of the default GraphQL specification,
 *   enabling the application to work with large numbers and date/time values in GraphQL queries and mutations.
 * */
