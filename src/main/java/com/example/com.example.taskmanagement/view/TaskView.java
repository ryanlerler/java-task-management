import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

@Route("tasks")
public class TaskView extends VerticalLayout {
    @Autowired
    private TaskService taskService;

    public TaskView() {
        Grid<Task> taskGrid = new Grid<>(Task.class);
        taskGrid.setItems(taskService.getAllTasks());

        add(taskGrid);
    }
}
