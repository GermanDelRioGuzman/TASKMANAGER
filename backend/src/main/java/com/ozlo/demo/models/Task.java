import jakarta.persistence.*;

@Entity
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private boolean completed;
    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;
}