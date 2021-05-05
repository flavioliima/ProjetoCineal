package br.edu.cesmac.nolapi.cineal.repository;

import br.edu.cesmac.nolapi.cineal.domain.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

}
