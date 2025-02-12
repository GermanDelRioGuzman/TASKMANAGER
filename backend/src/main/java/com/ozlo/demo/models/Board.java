import jakarta.persistence.*;
import java.util.List;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType; 
import java.util.ArrayList; // ✅ Agregar esta importación

@Entity 
public class Board {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
    private List<Task> tasks = new ArrayList<>();


}