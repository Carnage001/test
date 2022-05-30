package com.rakuten.croptracking.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rakuten.croptracking.models.Pesticide;

@Repository
public interface PesticideRepository extends JpaRepository<Pesticide, Long> {

}
