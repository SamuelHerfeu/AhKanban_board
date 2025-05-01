package dio.AhKanban_board.core.model;

import jakarta.persistence.*;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "task_item_id") // Renomeado de column_id para task_item_id
    private TaskItem task; // Renomeado de Column para TaskItem

    public Card() {
        // Construtor padrão
    }

    public Card(String title, String description, TaskItem task) { // Renomeado de Column para TaskItem
        this.title = title;
        this.description = description;
        this.task = task;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public TaskItem getTask() { return task; } // Renomeado de getColumn para getTask
    public void setTask(TaskItem task) { this.task = task; } // Renomeado de setColumn para setTask
}