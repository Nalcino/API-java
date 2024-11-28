package com.equipe1.sistema_escolar.repositores;

import com.equipe1.sistema_escolar.model.Presenca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresencaRepository extends JpaRepository<Presenca, Long> {
}
