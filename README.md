# 📘 Projeto: Sistema de Cadastro e Login de Usuários (Java + MySQL)

Atividade desenvolvida em linguagem **Java**, utilizando **orientação a objetos**, com foco nos conceitos de **herança**, **encapsulamento** e **persistência de dados**.

Atividade feita com o objetivo de **praticar desenvolvimento de interfaces gráficas (Swing)** e **integração com banco de dados** através de **DAO (Data Access Object)** e **JDBC**.

---

## 🧩 Resumo da atividade

O programa cria uma interface interativa com o usuário, permitindo o **cadastro e autenticação de usuários**.  
A aplicação valida as entradas, realiza o **armazenamento dos dados em um banco de dados MySQL**, e possibilita o **login com verificação de credenciais**.

---

## 💻 Estrutura do projeto

**Pacotes principais:**
- `Principal.views` → Contém as telas gráficas (`MenuInicial` e `TelaCadastro`);
- `Principal.core.entity` → Define as classes de modelo (ex: `Usuario`);
- `Principal.core.dao` → Gerencia as operações de persistência (ex: `UsuarioDAO`);
- `Principal.core.connection` → Configura a conexão com o banco de dados MySQL.

**Telas do sistema:**
- `MenuInicial` → Tela principal de login e acesso ao cadastro;
- `TelaCadastro` → Tela para criação de novos usuários.

---

## ⚙️ Funcionalidades

- Cadastro de novos usuários com:
  - Nome
  - Login
  - Senha
  - E-mail  
- Validação de campos obrigatórios;
- Login de usuários com autenticação no banco de dados;
- Mensagens de erro e sucesso via `JOptionPane`;
- Interface desenvolvida com **Java Swing (NetBeans Form Designer)**;
- Estrutura modular, aplicando **boas práticas de encapsulamento e separação de responsabilidades**.

---

## 🗄️ Tecnologias utilizadas

- **Java SE**  
- **JDBC (Java Database Connectivity)**  
- **MySQL**  
- **Swing / NetBeans GUI Builder**  

---

## 🧠 Conceitos aplicados

- Encapsulamento das propriedades das classes de entidade (`Usuario`);
- Herança e reutilização de código em componentes visuais;
- Padrão **DAO** para manipulação de dados;
- Estrutura MVC simplificada (camadas de *View*, *Entity* e *DAO*);
- Conexão e manipulação de banco relacional via **SQL**.

---

## 🚀 Execução

1. Configure o banco de dados MySQL com a tabela `usuarios` (colunas: nome, login, senha, email).  
2. Atualize as credenciais de conexão no arquivo de configuração (caso exista `ConnectionFactory` ou similar).  
3. Execute o projeto em um ambiente Java compatível (ex: NetBeans, IntelliJ, Eclipse).  
4. Inicie pela classe **`MenuInicial.java`**.  

---

## ✍️ Autor

Desenvolvido por **João Pitta**, como atividade prática de aprendizado em **Java Orientado a Objetos** e **Integração com Banco de Dados**.
