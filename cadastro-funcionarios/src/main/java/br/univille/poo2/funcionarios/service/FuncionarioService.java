package br.univille.poo2.funcionarios.service;

import org.springframework.stereotype.Service;
import java.util.List;
import br.univille.poo2.funcionarios.entity.Funcionario;
import br.univille.poo2.funcionarios.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
    private final FuncionarioRepository repository;

    public FuncionarioService(FuncionarioRepository repository) {
        this.repository = repository;
    }

    public List<Funcionario> listarTodos() {
        return repository.findAll();
    }

    public Funcionario salvar(Funcionario funcionario) {
        return repository.save(funcionario);
    }

    public Funcionario buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
