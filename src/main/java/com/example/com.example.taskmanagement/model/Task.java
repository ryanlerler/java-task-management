import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime; 

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime createdDateTime;
    private String createdBy;
    private String shortDescription;
    private String description;
    private String assignedTo;
    private String state; // Enum with values: New, In Progress, Closed, Canceled

    // Getters and setters
}
