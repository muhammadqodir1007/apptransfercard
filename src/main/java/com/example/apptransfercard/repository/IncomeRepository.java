package com.example.apptransfercard.repository;

import com.example.apptransfercard.entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;
//import uz.pdp.apptransfercard.entity.Income;

public interface IncomeRepository extends JpaRepository<Income, Integer> {

}
