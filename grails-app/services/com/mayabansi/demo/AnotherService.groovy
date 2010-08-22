package com.mayabansi.demo

class AnotherService extends GenericService {

    boolean transactional = true

    def carService

    def demo() {
        carService.getCar("Toyota", "Camry")
    }
}
