package com.abigail.examcs.repositories;

import com.abigail.examcs.models.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Authors, Long>{

    Optional<Authors> findByName(String name);
} 