🎬 ScreenMatch

Aplicação em Java para catalogar séries e episódios, consumindo dados da API pública OMDb e persistindo em banco de dados relacional. Evoluída de um console interativo para uma API REST completa com Spring Boot.

Projeto desenvolvido durante a trilha de Java e Spring Boot da Alura, como parte da minha formação em Análise e Desenvolvimento de Sistemas pela FIAP.

🚀 Funcionalidades
Busca de séries por título via consumo da API OMDb
Cadastro automático de temporadas e episódios de uma série
Cálculo de estatísticas: melhores episódios, média de avaliação por temporada
Busca de séries por gênero, avaliação e número de temporadas
Exposição de endpoints REST para consulta e cadastro de séries/episódios
🛠️ Tecnologias e conceitos aplicados
Java — Records, Streams (flatMap, groupingBy, summarizingDouble), Optional, tratamento de exceções, Generics
Spring Boot — arquitetura em camadas (Controller / Service / Repository)
Spring Data JPA + Hibernate — mapeamento objeto-relacional, relacionamentos @OneToMany / @ManyToOne, queries customizadas em JPQL
PostgreSQL — persistência de dados
Jackson — conversão de JSON para objetos Java
Maven — gerenciamento de dependências e build
Java HTTP Client — consumo de API externa
📂 Estrutura do projeto
src/main/java/br/com/alura/screenmatch/
├── controller/     # endpoints REST
├── dto/            # objetos de transferência de dados
├── model/          # entidades JPA e records de domínio
├── principal/      # menu interativo (versão console)
├── repository/     # interfaces Spring Data JPA
└── service/        # regras de negócio e integração com APIs externas
▶️ Como executar
Pré-requisitos
Java 17+
Maven
PostgreSQL rodando localmente (ou ajuste as credenciais no application.properties)
Passos
bash
git clone https://github.com/Campos2004-hub/screenmatch-sem-web.git
cd screenmatch-sem-web
./mvnw spring-boot:run

A aplicação estará disponível em http://localhost:8080.

📖 O que aprendi

Este projeto foi minha primeira imersão prática em:

Consumo de APIs externas em Java, incluindo tratamento de dados inconsistentes retornados pela API (avaliações ausentes, datas inválidas)
Modelagem de relacionamentos entre entidades com JPA/Hibernate
Uso de Streams para agregações de dados (médias, agrupamentos, rankings)
Transição de uma aplicação console para uma API REST estruturada em camadas

Desenvolvido por Matheus Campos 👨‍💻
