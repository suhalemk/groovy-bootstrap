package org.test;
import groovy.util.logging.Slf4j;

@Slf4j
class Sample {
    public static void main(String[] args){
        log.debug("debug - welcome to sample ..")
        log.error("error - sample error message ..")
        println("hello ..there ..!!")
    }
}
