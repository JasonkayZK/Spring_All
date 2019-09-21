package club.jasonkayzk666.handler;

import club.jasonkayzk666.exception.SpittleNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author zk
 * @DATE 19-8-11
 */
@ControllerAdvice
public class AppWideExceptionHandler {

    @ExceptionHandler(SpittleNotFoundException.class)
    public String spittleNotFoundHandler() {
        return "error/notfound";
    }

}
