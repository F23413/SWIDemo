package cz.osu.swidemo.kontroler;

import cz.osu.swidemo.entity.Pricing;
import cz.osu.swidemo.entity.User;
import cz.osu.swidemo.repozitar.PricingRepository;
import cz.osu.swidemo.repozitar.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/price")
public class PricingController {
    @Autowired
    private PricingRepository pricingRepository;

    @GetMapping("/hello")
    public String sayHello() {
        return "Ahoj z backendu! Spojeni funguje.";
    }

    @GetMapping("/create-item")
    public String createItem() {
        Pricing item = new Pricing("Jablko", 13);
        pricingRepository.save(item);
        return "Předmět byl úspěšně vytvořen a uložen do databáze.";
    }
}
