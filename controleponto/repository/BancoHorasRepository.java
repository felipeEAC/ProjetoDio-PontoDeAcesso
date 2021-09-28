package com.projetoDio.controlepontoacesso.repository;

import com.projetoDio.controlepontoacesso.model.BancoHoras;
import com.projetoDio.controlepontoacesso.model.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoHorasRepository extends JpaRepository<BancoHoras, Long> {
}