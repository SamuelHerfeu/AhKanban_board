package dio.AhKanban_board.core.ports;

import dio.AhKanban_board.core.model.Card;
import java.util.List;
import java.util.Optional;

public interface CardRepositoryPort {
    Card save(Card card);
    Optional<Card> findById(Long id);
    List<Card> findByTaskId(Long taskId); // Renomeado de findByColumnId para findByTaskId
    void deleteById(Long id);
}