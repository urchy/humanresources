package com.asilva.humamresources.repositories;

import com.asilva.humamresources.entities.Absence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbsenceRepository extends JpaRepository<Absence, Long> {
}
