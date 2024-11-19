# Marketplace de Serviços Locais

## Descrição do Projeto

<p> O Marketplace de Serviços Locais é uma plataforma desenvolvida para conectar prestadores de serviços com clientes que buscam serviços em sua região. O projeto visa facilitar a comunicação entre prestadores e clientes, simplificando o processo de busca, agendamento e pagamento de serviços diversos, como encanamento, manutenção elétrica, reformas, entre outros. </p>

 ## Funcionalidades Principais

- <b>Cadastro de Usuários:</b> Permite o registro de clientes e prestadores de serviços com informações básicas, como nome, e-mail, endereço e tipo de serviço oferecido.
- <b>Busca e Filtro de Serviços:</b> Os clientes podem buscar serviços por categoria, localização ou avaliação dos prestadores.
- <b>Agendamento de Serviços:</b> Interface para marcar serviços com base na disponibilidade do prestador.
- <b>Sistema de Avaliação:</b> Clientes podem avaliar prestadores de serviços, ajudando outros usuários na escolha.
- <b>Pagamento Online (possivel implementação):</b> Integração com APIs de pagamento para facilitar transações seguras.

## Arquitetura do Projeto
O projeto utiliza o padrão de arquitetura <b>MVC (Model-View-Controller)</b> para organizar e estruturar o código de forma clara e eficiente.

- <b>Model:</b> Responsável pela definição das entidades e pela lógica de negócio.
- <b>View:</b> Implementada com Bootstrap, proporcionando interfaces responsivas e amigáveis para o usuário.
- <b>Controller:</b> Gerencia as requisições do usuário, invoca os serviços necessários e entrega as respostas adequadas.

## Tecnologias Utilizadas

### Back-end
- <b>Java com Spring Boot:</b> Para o desenvolvimento da API REST, gestão de segurança e conexão com o banco de dados.
- <b>Spring Data JPA:</b> Para facilitar o gerenciamento de dados.
- <b>Banco de Dados PostgreSQL:</b> Armazenamento das informações dos usuários, serviços, avaliações, etc.

### Front-end

- <b>HTML5, CSS3, JavaScript</b>
- <b>Bootstrap:</b> Framework CSS para o design responsivo.
- <b>Thymeleaf:</b> Motor de template para renderizar as páginas no servidor.

### Padrões de Projeto
- <b>MVC (Model-View-Controller):</b> Facilita a separação de preocupações e organização do projeto.
- <b>Singleton:</b> Utilizado para gerenciar instâncias únicas de componentes críticos (Ex: Configurações de banco de dados).
- <b>DAO (Data Access Object):</b> Abstrai e encapsula o acesso ao banco de dados.
