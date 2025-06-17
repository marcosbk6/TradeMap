# TradeMap

TradeMap é um aplicativo Android para acompanhamento de ações da bolsa de valores.

## Funcionalidades

- Login de usuário
- Visualização de lista de ações
- Detalhes de ações com gráfico
- Adição de ações aos favoritos
- Interface com tema escuro

## Tecnologias Utilizadas

- Kotlin
- Android Jetpack
- Material Design
- Retrofit para requisições HTTP
- MPAndroidChart para gráficos
- Koin para injeção de dependência
- Room para banco de dados local
- Coroutines para operações assíncronas
- Navigation Component para navegação
- ViewBinding para manipulação de views

## Requisitos

- Android Studio Arctic Fox ou superior
- JDK 17
- Android SDK 21+
- Gradle 8.0+

## Configuração do Ambiente

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/trademap.git
```

2. Abra o projeto no Android Studio

3. Configure o endereço do servidor:
   - Abra o arquivo `app/src/main/res/xml/network_security_config.xml`
   - Altere o domínio para o endereço do seu servidor:
   ```xml
   <domain-config cleartextTrafficPermitted="true">
       <domain includeSubdomains="true">seu-servidor.com</domain>
   </domain-config>
   ```

4. Sincronize o projeto com o Gradle

## Estrutura do Projeto

```
app/
├── src/
│   ├── main/
│   │   ├── java/br/com/dio/trademapclone/
│   │   │   ├── di/           # Configuração de injeção de dependência
│   │   │   ├── domain/       # Modelos e interfaces
│   │   │   ├── repository/   # Repositórios
│   │   │   └── ui/          # Activities, Fragments e ViewModels
│   │   └── res/
│   │       ├── layout/      # Layouts XML
│   │       ├── values/      # Recursos (cores, strings, etc)
│   │       └── navigation/  # Navegação
└── build.gradle
```

## Como Executar

1. Conecte um dispositivo Android ou inicie um emulador

2. Clique no botão "Run" (▶️) no Android Studio

3. Selecione o dispositivo/emulador

4. Aguarde o aplicativo ser instalado e iniciado

## Funcionamento

### Login
- A tela inicial apresenta campos para usuário e senha
- Após o login bem-sucedido, o usuário é direcionado para a lista de ações

### Lista de Ações
- Exibe as ações em um grid de 2 colunas
- Cada item mostra o código da ação e seu valor atual
- Botão flutuante para adicionar novas ações

### Detalhes da Ação
- Mostra o código e valor atual da ação
- Exibe um gráfico com a evolução do valor
- Permite adicionar/remover dos favoritos

## Contribuição

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

## Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.



