# atividadSpringB00T
# Sistema de Cadastro de Funcionários

Este é um sistema simples de cadastro de funcionários desenvolvido em **Java Spring Boot**, que permite gerenciar informações de funcionários com operações básicas de CRUD (Create, Read, Update, Delete).  

O sistema possui as funcionalidades de:

- **Novo cadastro**: Adicionar um novo funcionário.
- **Editar cadastro**: Atualizar informações de um funcionário existente.
- **Visualizar cadastro**: Consultar detalhes de um funcionário.
- **Excluir cadastro**: Remover um funcionário do sistema.
- **Lista de cadastros**: Visualizar todos os funcionários cadastrados.

---

## Tecnologias Utilizadas

- **Backend**: Java com Spring Boot
- **Frontend**: HTML, CSS, Bootstrap
- **Banco de Dados**: H2 (em memória)

---

## Funcionalidades

1. **Novo Cadastro**  
   Permite inserir dados de um novo funcionário, como nome, cargo, departamento e email.

2. **Editar Cadastro**  
   Possibilita atualizar informações já cadastradas de um funcionário.

3. **Visualizar Cadastro**  
   Mostra detalhes completos de um funcionário selecionado.

4. **Excluir Cadastro**  
   Remove um funcionário do sistema de forma definitiva.

5. **Lista de Funcionários**  
   Exibe todos os funcionários cadastrados em uma tabela, com opções para editar, visualizar ou excluir.

---
src/
 ├─ main/
 │  ├─ java/
 │  │  └─ com.exemplo.cadastro/
 │  │       ├─ controller/    # Controladores Spring MVC
 │  │       ├─ model/         # Modelos de dados (Funcionário)
 │  │       └─ repository/    # Interfaces de acesso a dados (H2)
 │  └─ resources/
 │      ├─ static/            # Arquivos CSS e JS
 │      └─ templates/         # Páginas HTML (Thymeleaf)
 └─ test/                     # Testes automatizados
---

http://localhost:8080/funcionarios
