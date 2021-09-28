package com.projetoDio.controlepontoacesso.service;

import com.projetoDio.controlepontoacesso.model.JornadaTrabalho;
import com.projetoDio.controlepontoacesso.model.NivelAcesso;
import com.projetoDio.controlepontoacesso.repository.JornadaRepository;
import com.projetoDio.controlepontoacesso.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {

    NivelAcessoRepository nivelAcessoRepository;

    @Autowired
    public NivelAcessoService(NivelAcessoRepository nivelAcessoRepository) {
        this.nivelAcessoRepository = nivelAcessoRepository;
    }

    public NivelAcesso saveNivelAcesso(NivelAcesso nivelAcesso) {
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public List<NivelAcesso> findAll() {
        return nivelAcessoRepository.findAll();
    }

    public Optional<NivelAcesso> getById(Long idNivelAcesso) {
        return nivelAcessoRepository.findById(idNivelAcesso);
    }

    public NivelAcesso updateNivelAcesso(NivelAcesso nivelAcesso) {
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public void deleteNivelAcesso(Long idNivelAcesso) {
        nivelAcessoRepository.deleteById(idNivelAcesso);
    }
}
