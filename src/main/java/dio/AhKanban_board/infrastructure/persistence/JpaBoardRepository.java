package dio.AhKanban_board.infrastructure.persistence;

import dio.AhKanban_board.core.model.Board;
import dio.AhKanban_board.core.ports.BoardRepositoryPort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Certifique-se de que a anotação @Repository está presente
public interface JpaBoardRepository extends JpaRepository<Board, Long>, BoardRepositoryPort {
}