package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.model.Car;

import java.util.*;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(method = RequestMethod.GET)
    public String carsList(ModelMap modelMap) {
        List<Car> cars = new ArrayList<>();
        String[] name = {"nissan", "tayota", "mazda", "VAZ", "BMW"};
        String[] model = {"zx350", "celica", "mx5", "21010", "m3"};
        long[] price = {1_050_662, 2_000_100, 1_800_300, 5_002_800, 3_500_123};
        int[] year = {2001, 2005, 1998, 2000, 2018};
        for (int count = 0; count < 5; count++) {
            cars.add(new Car(name[count], model[count], price[count], year[count]));
        }
        modelMap.addAttribute("cars", cars);

        return "cars";
    }
}
