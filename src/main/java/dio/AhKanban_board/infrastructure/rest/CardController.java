package dio.AhKanban_board.infrastructure.rest;

import dio.AhKanban_board.core.model.Card;
import dio.AhKanban_board.core.ports.CardRepositoryPort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {
    private final CardRepositoryPort cardRepository;

    public CardController(CardRepositoryPort cardRepository) {
        this.cardRepository = cardRepository;
    }

    @PostMapping
    public Card createCard(@RequestBody Card card) {
        return cardRepository.save(card);
    }

    @GetMapping("/task/{taskId}") // Renomeado de column para task
    public List<Card> getCardsByTask(@PathVariable Long taskId) { // Renomeado de columnId para taskId
        return cardRepository.findByTaskId(taskId); // Renomeado de findByColumnId para findByTaskId
    }
}