import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


@RestController
@RequestMapping("/api/boards")
public class BoardController {
    @Autowired private BoardService boardService;

    @GetMapping
    public List<Board> getBoards() {
        return boardService.getAllBoards();
    }

    @PostMapping
    public Board createBoard(@RequestBody Board board) {
        return boardService.createBoard(board);
    }
}

