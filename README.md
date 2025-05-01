# AhKanban Board  

![AhKanban Preview](https://via.placeholder.com/800x400?text=AhKanban+Preview)  

Um **quadro Kanban** simples e funcional, desenvolvido com **Arquitetura Hexagonal** para garantir desacoplamento, flexibilidade e facilidade de manutenção.  

## 🏗️ Arquitetura Hexagonal (Ports & Adapters)  
O projeto segue a **Arquitetura Hexagonal**, separando claramente:  
- **Core (Domínio):** Lógica de negócio pura (tarefas, colunas, regras).  
- **Ports:** Interfaces que definem contratos (ex.: `ITaskRepository`).  
- **Adapters:** Implementações concretas (ex.: `LocalStorageTaskRepository`).  

**Benefícios:**  
✔ **Testabilidade:** Domínio isolado de frameworks/externos.  
✔ **Troca de Implementações:** Ex.: Substituir LocalStorage por API REST sem modificar o core.  
✔ **Clareza Estrutural:** Divisão explícita de responsabilidades.  

### 📦 Estrutura do Projeto (Adaptada para Hexagonal)  

AhKanban_board/
├── core/ # Lógica de negócio (domínio)
│ ├── entities/ # Entidades (Task, Column)
│ ├── ports/ # Interfaces (ex.: ITaskRepository)
│ └── services/ # Casos de uso (ex.: TaskService)
├── adapters/ # Implementações concretas
│ ├── persistence/ # LocalStorage, API, etc.
│ └── ui/ # Controle do DOM (Drag & Drop)
├── index.html # Página principal
├── style.css
└── README.md
