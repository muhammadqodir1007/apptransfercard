package com.example.apptransfercard.repository;

import com.example.apptransfercard.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
//import uz.uzpdp.apptransfercard.entity.Card;

import java.util.Optional;

public interface CardRepository extends JpaRepository<Card, Integer> {

    Optional<Card> findByUserName(String name);

    Optional<Card> findByNumber(String card);
}
