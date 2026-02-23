package cz.osu.swidemo.kontroler;

import cz.osu.swidemo.entity.User;
import cz.osu.swidemo.repozitar.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/test")
class TestController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/hello")
    public String sayHello() {
        return "Ahoj z backendu! Spojeni funguje.";
    }

    @GetMapping("/create-user")
    public String createUser() {
        User user = new User("Emil", "Zatopek");
        userRepository.save(user);
        return "Uživatel John Doe byl úspěšně vytvořen a uložen do databáze.";
    }
}
