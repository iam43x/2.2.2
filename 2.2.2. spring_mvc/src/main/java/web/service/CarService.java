package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {


    public List<Car> getAllCar() {
        List<Car> cars = new ArrayList<>();
        String[] name = {"nissan", "tayota", "mazda", "VAZ", "BMW"};
        String[] model = {"zx350", "celica", "mx5", "21010", "m3"};
        long[] price = {1_050_662, 2_000_100, 1_800_300, 5_002_800, 3_500_123};
        int[] year = {2001, 2005, 1998, 2000, 2018};
        for (int count = 0; count < 5; count++) {
            cars.add(new Car(name[count], model[count], price[count], year[count]));
        }
        return cars;
    }
}
