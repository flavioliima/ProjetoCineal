package br.edu.cesmac.nolapi.cineal.service;

import br.edu.cesmac.nolapi.cineal.domain.Sessao;
import br.edu.cesmac.nolapi.cineal.repository.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessaoService {
    @Autowired
    private SessaoRepository sessaoRepository;

    public Sessao salvar(Sessao sessao) {
        Sessao sessaoCriada = sessaoRepository.save(sessao);
        return sessaoCriada;
    }

    public Sessao atualizar(Sessao sessao) {
        Sessao sessaoAtualizar = sessaoRepository.save(sessao);
        return sessaoAtualizar;
    }

    public void deletarPorId(Long id) throws Exception {
        Sessao sessaoExclusao = sessaoRepository.findById(id)
                .orElseThrow(() -> new Exception("Nenhum registro encontrado com o ID"));

        sessaoRepository.deleteById(id);
    }

    public Sessao buscarPorId(Long id) throws Exception {
        return sessaoRepository.findById(id)
                .orElseThrow(() -> new Exception("Nenhum registro encontrado com o ID"));
    }

    public List<Sessao> listar() {
        return sessaoRepository.findAll();
    }
}
