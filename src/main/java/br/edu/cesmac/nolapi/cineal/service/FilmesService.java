package br.edu.cesmac.nolapi.cineal.service;

import br.edu.cesmac.nolapi.cineal.domain.Filme;
import br.edu.cesmac.nolapi.cineal.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmesService {
    @Autowired
    private FilmeRepository filmeRepository;

    public Filme salvar(Filme filme) {
        Filme filmeCriado = filmeRepository.save(filme);
        return filmeCriado;
    }

    public Filme atualizar(Filme filme) {
        Filme filmeAtualizar = filmeRepository.save(filme);
        return filmeAtualizar;
    }

    public void deletarPorId(Long id) throws Exception {
        Filme filmeExclusao = filmeRepository.findById(id)
                .orElseThrow(() -> new Exception("Nenhum registro encontrado com o ID"));

        filmeRepository.deleteById(id);
    }

    public Filme buscarPorId(Long id) throws Exception {
        return filmeRepository.findById(id)
                .orElseThrow(() -> new Exception("Nenhum registro encontrado com o ID"));
    }

    public List<Filme> listar() {
        return filmeRepository.findAll();
    }
}
