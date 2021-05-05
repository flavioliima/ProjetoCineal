package br.edu.cesmac.nolapi.cineal.resources;

import br.edu.cesmac.nolapi.cineal.domain.Sessao;
import br.edu.cesmac.nolapi.cineal.service.SessaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/sessao")
public class SessaoResources {
    @Autowired
    private SessaoService sessaoService;

    @GetMapping
    public List<Sessao> listar(){
        return sessaoService.listar();
    }

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody Sessao sessao){
        sessaoService.salvar(sessao);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(sessao.getIdSessao()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping
    public void atualizar(@RequestBody Sessao sessao) {
        sessaoService.atualizar(sessao);
    }

    @DeleteMapping(value = "/{id}")
    public void deletar(@PathVariable("id") Long IdSessao) throws Exception {
        sessaoService.deletarPorId(IdSessao);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Sessao> buscarPorId(@PathVariable("id") Long IdSessao) throws Exception {
        Sessao sessao = sessaoService.buscarPorId(IdSessao);
        return ResponseEntity.ok(sessao);
    }
}
