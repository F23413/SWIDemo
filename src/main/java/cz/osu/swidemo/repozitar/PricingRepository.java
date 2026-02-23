package cz.osu.swidemo.repozitar;

import cz.osu.swidemo.entity.Pricing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PricingRepository extends JpaRepository<Pricing, UUID> {
    Pricing getById(UUID id);
    Pricing getByItemName(String name);
    Pricing getByPrice(int price);
    Pricing getByItemNameAndPrice(String name, int price);
}
