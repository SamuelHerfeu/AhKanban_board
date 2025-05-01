package dio.AhKanban_board.infrastructure.persistence;

import dio.AhKanban_board.core.model.Card;
import dio.AhKanban_board.core.ports.CardRepositoryPort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JpaCardRepository extends JpaRepository<Card, Long>, CardRepositoryPort {

    @Query("SELECT c FROM Card c WHERE c.task.id = :taskId") // Renomeado de column para task
    List<Card> findByTaskId(@Param("taskId") Long taskId); // Renomeado de columnId para taskId

    // Os outros métodos (save, findById, deleteById) já são herdados automaticamente
}