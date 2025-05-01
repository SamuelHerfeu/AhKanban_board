package dio.AhKanban_board.core.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
    private List<TaskItem> tasks = new ArrayList<>(); // Renomeado de Column para TaskItem

    public Board() {
        // Construtor padrão
    }

    public Board(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public List<TaskItem> getTasks() { return tasks; } // Renomeado de getColumns para getTasks
}