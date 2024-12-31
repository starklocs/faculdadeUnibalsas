# Jogo Multiplayer de Adivinhação de Senhas no Kubernetes



Este projeto implementa um jogo multiplayer de adivinhação de senhas em um cluster Kubernetes, utilizando o **MicroK8s** como plataforma. O jogo consiste em dois componentes principais: um **frontend** (React) e um **backend** (Flask). O frontend permite que os jogadores criem jogos e enviem palpites para adivinhar a senha. O backend gerencia a lógica do jogo, armazena os dados dos jogos e valida os palpites.



## Arquitetura



- **Frontend:** React, servido pelo Nginx.

- **Backend:** Flask, com persistência em um banco de dados PostgreSQL.

- **Kubernetes:** MicroK8s para orquestrar os containers.

- **Docker Hub:** Armazena as imagens Docker do frontend e backend.



## Funcionalidades



- Criar novos jogos com senhas personalizadas.

- Enviar palpites para adivinhar a senha.

- Receber feedback sobre o número de letras corretas e suas posições.

- Múltiplos jogadores podem participar de um mesmo jogo.



## Pré-requisitos



Antes de começar, você precisa ter os seguintes itens instalados:



- **Docker**: Para construir e enviar as imagens Docker.

- **MicroK8s**: Para orquestrar os containers no cluster Kubernetes.

- **Kubectl**: Para interagir com o Kubernetes.

- **Conta no Docker Hub**: Para armazenar e distribuir as imagens Docker.



## Instalação



### 1. Clonar o repositório




git clone <URL_DO_REPOSITORIO>



### 2. Construir e enviar as imagens Docker



#### Frontend



1. Navegue até o diretório do frontend:




<cd frontend>



2. Construa a imagem Docker e envie para o Docker Hub:



```bash

docker build -t starklocs14/frontend:latest .

docker push starklocs14/frontend:latest



Backend

Navegue até o diretório do backend:

bash

Copiar código

cd ../backend





Construa a imagem Docker e envie para o Docker Hub:

```bash

docker build -t starklocs14/backend:latest .

docker push starklocs14/backend:latest



3. Implantar a aplicação no Kubernetes

Utilize o MicroK8s para implantar os recursos no Kubernetes. Execute os seguintes comandos:



```bash

microk8s kubectl apply -f backend-deployment.yaml

microk8s kubectl apply -f backend-service.yaml

microk8s kubectl apply -f frontend-deployment.yaml

microk8s kubectl apply -f frontend-service.yaml

microk8s kubectl apply -f backend-hpa.yaml



4. Acessar o jogo

Depois que a aplicação for implantada, você pode acessar o jogo no seguinte endereço:



``` bash

http://localhost:31706



Observações



Certifique-se de ter o MicroK8s instalado e configurado corretamente.

Ajuste as configurações do banco de dados no arquivo backend-deployment.yaml de acordo com o seu ambiente.

Verifique se as portas estão configuradas corretamente nos arquivos YAML e no default.conf do Nginx.

Monitore os logs dos pods para identificar e solucionar problemas.




Este é um ótimo começo para o seu README! 👏 Você incluiu informações importantes sobre o projeto, a arquitetura e como começar. Aqui estão algumas sugestões para deixá-lo ainda melhor:

1. Adicionar mais detalhes na seção "Descrição"

Explique melhor a dinâmica do jogo. Como os jogadores interagem? Qual o objetivo?
Mencione os recursos extras que tornam seu jogo único (se houver).
Destaque os benefícios de usar Kubernetes e MicroK8s.
Exemplo:

Este projeto implementa um jogo multiplayer de adivinhação de senhas, onde os jogadores competem para descobrir a senha secreta criada por outro jogador.  A cada tentativa, o jogador recebe dicas sobre quantas letras estão corretas e em quais posições. O primeiro a adivinhar a senha vence! 🏆

Utilizamos Kubernetes e MicroK8s para garantir escalabilidade, alta disponibilidade e gerenciamento eficiente dos recursos do jogo.

2.  Melhorar a seção "Instalação"

Scripts: Criar scripts para automatizar o processo de build e deploy (ex: build.sh, deploy.sh). Isso facilita a vida de quem for executar o projeto.
Configuração do banco de dados: Detalhar como configurar o banco de dados PostgreSQL (criar o banco, usuário, senha). Se possível, usar um script SQL para automatizar.
Variáveis de ambiente: Usar variáveis de ambiente para configurar o projeto (ex: senha do banco de dados, nome do host). Isso aumenta a segurança e facilita a configuração em diferentes ambientes.
Helm Charts: Considerar usar Helm para empacotar e implantar a aplicação no Kubernetes de forma mais organizada e reutilizável.
3. Adicionar seções importantes

Contribuição: Explique como outras pessoas podem contribuir com o projeto. Inclua diretrizes de estilo de código, processo de revisão, etc.
Licença: Especifique a licença do seu projeto (ex: MIT, Apache 2.0).
Contato: Forneça informações de contato (email, GitHub, etc.).
Troubleshooting: Inclua uma seção com problemas comuns e soluções.
4.  Usar recursos visuais

Diagrama da arquitetura: Um diagrama visual da arquitetura do sistema ajuda a entender melhor como os componentes se conectam.
Screenshots: Adicione screenshots do jogo para mostrar a interface e a jogabilidade.
5.  Revisar e organizar o texto

Use títulos e subtítulos para organizar o conteúdo.
Use listas, tabelas e formatação de código para facilitar a leitura.
Revise o texto para garantir clareza e correção gramatical.
Exemplo de diagrama de arquitetura:

                                  +---------------------+
                                  |       Frontend      |
                                  |      (React)       |
                                  +---------+----------+
                                            |
                                            | HTTP
                                            v
+---------------------+    +---------------------+    +---------------------+
|      Ingress       |--->|    Service (Backend) |--->|       Backend       |
+---------+----------+    +---------+----------+    |      (Flask)       |
            ^                |                ^    +---------+----------+
            |                |                |            |
            |                v                |            |
+---------+----------+    +---------------------+            |
|  LoadBalancer       |    | Deployment (Backend) |            |
+---------------------+    +---------+----------+            |
                                            |            |
                                            v            v
                                  +---------------------+    +---------------------+
                                  |       Database      |    | Persistent Volume  |
                                  |    (PostgreSQL)     |    +---------------------+
                                  +---------------------+
