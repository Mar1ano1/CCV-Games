# CCV - Copa de Campeões Virtuais 🏆

Um aplicativo Android desenvolvido em **Kotlin** que simula um campeonato virtual de games com sistema de ranking, perfis de jogadores e gerenciamento de torneios.

## 📱 Funcionalidades

✅ **Autenticação**
- Cadastro de novo jogador
- Login com email/senha
- Recuperação de conta

✅ **Perfil do Jogador**
- Nome, país, clube e ranking
- Histórico de partidas
- Estatísticas

✅ **Campeonatos**
- Fases: Grupos, Oitavas, Quartas, Semifinal e Final
- Resultados de jogos
- Tabela de classificação em tempo real

✅ **Sistema de Ranking**
- Letras: A, B, S, SSS+
- Pontuação por vitória/derrota
- Movimentação entre ranking

✅ **Tabela de Classificação**
- Ranking global de jogadores
- Ranking por championship

✅ **Notícias e Avisos**
- Feed de notícias
- Alertas de campeonatos
- Comunicados importantes

✅ **Banco de Dados Local**
- SQLite para persistência de dados
- Cache local de informações

## 🛠️ Tecnologias

- **Kotlin** - Linguagem principal
- **Android SDK** - Desenvolvimento
- **Jetpack Components** - Room, LiveData, ViewModel
- **SQLite** - Banco de dados
- **Material Design** - Interface
- **Gradle** - Build system

## 📋 Pré-requisitos

- Android Studio 2022.1+
- SDK Android 24+ 
- JDK 11+
- Kotlin 1.8+

## 🚀 Como Abrir

1. Clone: `git clone https://github.com/Mar1ano1/CCV-Games.git`
2. Abra no Android Studio: **File → Open**
3. Sincronize: **Sync Now**
4. Execute: **Run → Run 'app'**

## 📁 Estrutura

```
CCV-Games/
├── app/
│   ├── src/main/
│   │   ├── kotlin/com/ccvgames/
│   │   │   ├── ui/
│   │   │   ├── database/
│   │   │   ├── models/
│   │   │   └── utils/
│   │   ├── res/
│   │   └── AndroidManifest.xml
│   ├── build.gradle.kts
│   └── proguard-rules.pro
└── build.gradle.kts
```

## 🎮 Como Usar

1. Abra o app → Tela de Login
2. Cadastro → Preencha dados
3. Login → Acesse dashboard
4. Navegue pelas funcionalidades

## 📄 Licença

MIT License - Desenvolvido com ❤️ para gamers virtuais
