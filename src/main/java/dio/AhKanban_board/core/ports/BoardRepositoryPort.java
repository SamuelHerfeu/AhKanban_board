package dio.AhKanban_board.core.ports;

import dio.AhKanban_board.core.model.Board;
import java.util.List;
import java.util.Optional;

public interface BoardRepositoryPort {
    Board save(Board board);
    List<Board> findAll();
    Optional<Board> findById(Long id);
    void deleteById(Long id); // Método para deletar um board
}