package com.spring.prestamosApp.repo;

import com.spring.prestamosApp.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client, Long> {
}
