package com.wego.candidate_experience.repositories;

import com.wego.candidate_experience.dto.ExperienceDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import com.wego.candidate_experience.models.Experience;

import java.util.List;

public interface ExperienceRepository extends JpaRepository<Experience,Integer> {
    List<Experience> findAllByCandidateId(int candidateId);
}
