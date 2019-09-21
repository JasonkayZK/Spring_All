package club.jasonkayzk666.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author zk
 * @DATE 19-8-11
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "spittle Not Found")
public class SpittleNotFoundException extends RuntimeException {

}
