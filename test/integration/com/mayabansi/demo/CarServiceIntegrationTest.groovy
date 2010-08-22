package com.mayabansi.demo

import org.apache.commons.logging.LogFactory
/**
 * Created by IntelliJ IDEA.
 * User: rhasija
 * Date: Aug 21, 2010
 * Time: 8:48:16 PM
 * To change this template use File | Settings | File Templates.
 */
class CarServiceIntegrationTest extends GroovyTestCase {

    CarService carService
    AnotherService anotherService
    def log = LogFactory.getLog(getClass()) 

     protected void setUp() {
        super.setUp()
        new Car(make: "Toyota", model: "Camry").save()
        new Car(make: "Toyota", model: "Corola").save()
        new Car(make: "Toyota", model: "Tercel").save()
     }

    void testCarServiceAOP() {
        Car car = carService.getCar("Toyota", null)
        log.info("This is the car we have been looking for: $car")        
    }

    void testAnotherService() {
        log.info("---------Test: testAnotherService start.---------")
        anotherService.demo();
        log.info("---------Test: testAnotherService end.---------")
    }

    protected void tearDown() {
        super.tearDown();
    }
}