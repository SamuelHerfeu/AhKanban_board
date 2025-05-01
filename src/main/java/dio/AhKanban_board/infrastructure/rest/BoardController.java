package dio.AhKanban_board.infrastructure.rest;

import dio.AhKanban_board.core.model.Board;
import dio.AhKanban_board.core.ports.BoardRepositoryPort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {
    private final BoardRepositoryPort repository;

    public BoardController(BoardRepositoryPort repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Board> getAllBoards() {
        return repository.findAll();
    }

    @PostMapping
    public Board createBoard(@RequestBody Board board) {
        return repository.save(board);
    }

    @DeleteMapping("/{id}") // Endpoint para deletar um board
    public void deleteBoard(@PathVariable Long id) {
        repository.findById(id).ifPresent(board -> repository.deleteById(id));
    }
}