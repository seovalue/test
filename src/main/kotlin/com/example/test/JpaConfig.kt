package com.example.test

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaRepositories(
    enableDefaultTransactions = false,
)
@Configuration
class JpaConfig
