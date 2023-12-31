package com.example.Consultorio.repository;

import com.example.Consultorio.entities.MedicoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MedicoRepository extends JpaRepository<MedicoEntity, Long> {
    Page<MedicoEntity> findAllByStatusTrueOrderByNomeAsc(Pageable pageable);
    Optional<MedicoEntity> findByIdAndStatusTrue(Long id);

    List<MedicoEntity> findAllByStatusTrue();
}