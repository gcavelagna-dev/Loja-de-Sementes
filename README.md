# 🌱 Sistema de Gerenciamento de Sementes

Projeto desenvolvido em **Java** com inspiração em *Stardew Valley*, criado para praticar conceitos de Programação Orientada a Objetos (POO).

##  Sobre o projeto

A ideia surgiu como um exercício pessoal para aplicar os conceitos de Java em algo que gosto. Inicialmente, seria um sistema simples, mas, conforme o desenvolvimento avançava, novos problemas trouxeram oportunidades de aprendizado.

O objetivo era evitar repetições de código e criar uma estrutura reutilizável, utilizando herança, encapsulamento e polimorfismo.

## ️ Funcionalidades

- Gerenciamento de estoque de sementes.
- Adição e remoção de quantidades.
- Consulta de disponibilidade.
- Configuração de preços e limites.
- Organização das sementes por estações do ano.
- Validações e exceções personalizadas.

##  Aprendizados

Durante o desenvolvimento, tive contato prático com:

- **POO:** classes, objetos, encapsulamento, herança e polimorfismo.
- **Collections:** utilização de `HashMap` e `Map` para organizar o estoque.
- **Enums:** representação das estações do ano.
- **Validações:** regras de negócio e exceções personalizadas.
- **Organização:** pacotes, responsabilidades e separação de configurações e regras.

Um dos principais desafios foi encontrar uma maneira de armazenar diferentes tipos de sementes sem precisar criar estruturas individuais para cada uma. Isso me levou ao uso de `Map<Semente, Integer>` e à aplicação do polimorfismo.

##  Encerramento

O escopo inicial previa um sistema mais amplo, incluindo jogador, inventário e operações de compra. Entretanto, decidi limitar o desenvolvimento às funcionalidades já implementadas, priorizando a conclusão do projeto e os próximos passos dos meus estudos em Java.

**Este projeto representa uma etapa importante da minha evolução na linguagem Java e na compreensão de POO.**