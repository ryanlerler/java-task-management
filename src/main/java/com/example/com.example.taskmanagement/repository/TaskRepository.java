import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
