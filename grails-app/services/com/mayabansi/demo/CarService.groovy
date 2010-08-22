package com.mayabansi.demo

class CarService extends GenericService {

    boolean transactional = true

    def getCar(String make, String model) {
        if (make && !model) {
            return Car.findByMake(make)
        } else if (!make && model) {
            return Car.findByModel(model)
        } else {
            return Car.findByMakeAndModel(make, model);    
        }

    }
}
