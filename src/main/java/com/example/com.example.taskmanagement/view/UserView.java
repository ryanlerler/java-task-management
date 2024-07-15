import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import java.util.Optional;
import java.util.List;
import java.util.ArrayList;
import com.vaadin.flow.component.grid.Grid;
import org.springframework.beans.factory.annotation.Autowired;

@Route("users")
public class UserView extends VerticalLayout {
    @Autowired
    private UserService userService;

    public UserView() {
        Grid<User> userGrid = new Grid<>(User.class);
        userGrid.setItems(userService.getAllUsers());

        add(userGrid);
    }
}
