package br.edu.ifpb.umbumaker.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.umbumaker.model.LocalArmazenamento;

@Repository
public interface LocalArmazenamentoRepository extends JpaRepository<LocalArmazenamento, Long> {

}