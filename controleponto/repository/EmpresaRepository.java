package com.projetoDio.controlepontoacesso.repository;

import com.projetoDio.controlepontoacesso.model.Empresa;
import com.projetoDio.controlepontoacesso.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}