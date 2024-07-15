import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

@Route("login")
public class LoginView extends VerticalLayout {
    public LoginView() {
        H1 title = new H1("Login");
        TextField email = new TextField("Email");
        PasswordField password = new PasswordField("Password");
        Button loginButton = new Button("Login", event -> {
            // Handle login
        });

        add(title, email, password, loginButton);
    }
}
