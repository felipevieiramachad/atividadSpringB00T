package br.univille.poo2.funcionarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.univille.poo2.funcionarios.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {}
