package com.mayabansi.demo

import org.codehaus.groovy.runtime.InvokerHelper

class GenericService implements GroovyInterceptable {

    boolean transactional = true

    def invokeMethod(String name, Object args){
        log.info("Starting $metaClass.theClass $name $args")
        def metaClass = InvokerHelper.getMetaClass(this)
        def result = metaClass.invokeMethod(this, name, args)
        log.info("Ending $metaClass.theClass $name")
        return result
    }
}
