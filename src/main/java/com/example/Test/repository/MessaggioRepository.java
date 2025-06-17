package com.example.Test.repository;

import com.example.Test.model.Messaggio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessaggioRepository extends JpaRepository<Messaggio,Integer> {
}
