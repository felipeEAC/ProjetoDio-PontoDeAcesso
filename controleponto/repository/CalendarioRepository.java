package com.projetoDio.controlepontoacesso.repository;

import com.projetoDio.controlepontoacesso.model.Calendario;
import com.projetoDio.controlepontoacesso.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {
}