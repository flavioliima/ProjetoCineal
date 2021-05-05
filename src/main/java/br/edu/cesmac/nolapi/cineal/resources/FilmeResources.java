package br.edu.cesmac.nolapi.cineal.resources;

import br.edu.cesmac.nolapi.cineal.domain.Filme;
import br.edu.cesmac.nolapi.cineal.service.FilmesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeResources {

    @Autowired
    private FilmesService filmeService;

    @GetMapping
    public List<Filme> listar(){
        return filmeService.listar();
    }

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody Filme filme){
        filmeService.salvar(filme);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(filme.getIdFilme()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping
    public void atualizar(@RequestBody Filme filme) {
        filmeService.atualizar(filme);
    }

    @DeleteMapping(value = "/{id}")
    public void deletar(@PathVariable("id") Long idFilme) throws Exception {
        filmeService.deletarPorId(idFilme);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Filme> buscarPorId(@PathVariable("id") Long idFilme) throws Exception {
        Filme filme = filmeService.buscarPorId(idFilme);
        return ResponseEntity.ok(filme);
    }
}
