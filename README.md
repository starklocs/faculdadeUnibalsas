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

```
git clone <URL_DO_REPOSITORIO>
```

### 2. Construir e enviar as imagens Docker

#### Frontend

1. Navegue até o diretório do frontend:

   ```bash
    cd frontend
   ```

2. Construa a imagem Docker e envie para o Docker Hub:

   ```bash
    docker build -t starklocs14/frontend:latest .
    docker push starklocs14/frontend:latest
   ```

Backend
Navegue até o diretório do backend:

   ```bash
    cd ../backend
   ```

Construa a imagem Docker e envie para o Docker Hub:

   ```bash
    docker build -t starklocs14/backend:latest .
    docker push starklocs14/backend:latest

   ```
3. Implantar a aplicação no Kubernetes
Utilize o MicroK8s para implantar os recursos no Kubernetes. Execute os seguintes comandos:

  ```bash
microk8s kubectl apply -f backend-deployment.yaml
microk8s kubectl apply -f backend-service.yaml
microk8s kubectl apply -f frontend-deployment.yaml
microk8s kubectl apply -f frontend-service.yaml
microk8s kubectl apply -f backend-hpa.yaml>
   ```

4. Acessar o jogo
Depois que a aplicação for implantada, você pode acessar o jogo no seguinte endereço:
   
http://localhost:31706

## Observações

Certifique-se de ter o MicroK8s instalado e configurado corretamente.
Ajuste as configurações do banco de dados no arquivo backend-deployment.yaml de acordo com o seu ambiente.
Verifique se as portas estão configuradas corretamente nos arquivos YAML e no default.conf do Nginx.
Monitore os logs dos pods para identificar e solucionar problemas.
