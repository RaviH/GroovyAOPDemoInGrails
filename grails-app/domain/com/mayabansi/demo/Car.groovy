package com.mayabansi.demo

class Car {

    String make
    String model    

    static constraints = {        
    }

    public String toString() {
        "$make, $model"
    }
}
