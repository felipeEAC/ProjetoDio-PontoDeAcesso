package com.projetoDio.controlepontoacesso.repository;

import com.projetoDio.controlepontoacesso.model.JornadaTrabalho;
import com.projetoDio.controlepontoacesso.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}