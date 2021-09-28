package com.projetoDio.controlepontoacesso.repository;

import com.projetoDio.controlepontoacesso.model.Localidade;
import com.projetoDio.controlepontoacesso.model.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, Long> {
}