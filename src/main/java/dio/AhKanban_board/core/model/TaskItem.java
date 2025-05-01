package dio.AhKanban_board.core.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TaskItem { // Renomeado de Task para TaskItem
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL)
    private List<Card> cards = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;

    public TaskItem() {
        // Construtor padrão
    }

    public TaskItem(String name) {
        this.name = name;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public List<Card> getCards() { return cards; }
    public Board getBoard() { return board; }
    public void setBoard(Board board) { this.board = board; }
}