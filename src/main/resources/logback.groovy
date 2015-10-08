import static ch.qos.logback.classic.Level.INFO
import static ch.qos.logback.classic.Level.DEBUG

import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.FileAppender
import ch.qos.logback.core.status.OnConsoleStatusListener
// always a good idea to add an on console status listener
statusListener(OnConsoleStatusListener)

// setting up appenders
appender('CONSOLE', ConsoleAppender) {
    withJansi = true
    encoder(PatternLayoutEncoder) {
        pattern = "%d [%thread] %-5level %logger - %msg%n"
    }
}

appender('FILE', FileAppender) {
    file = "log/mylogger.txt"
    encoder(PatternLayoutEncoder) {
        pattern = "%d [%thread] %-5level %logger - %msg%n"
    }
}
// setting up loggers
logger("org.apache", INFO)
root(DEBUG, ['FILE'])
