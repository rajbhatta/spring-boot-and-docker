package raj.ecs.springbootdocker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import raj.ecs.springbootdocker.modal.House;

@RestController
@RequestMapping("/api/v1/houses")
public class HouseController {

    @GetMapping("/{id}")
    public House provideHouseDetails() {
        return new House(1, "Raj Manison", 7800000.00F, "Vancouver");
    }

}
