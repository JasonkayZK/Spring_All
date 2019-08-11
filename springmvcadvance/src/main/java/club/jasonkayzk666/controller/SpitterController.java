package club.jasonkayzk666.controller;

import club.jasonkayzk666.entity.Spitter;
import club.jasonkayzk666.utils.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;

/**
 * @author zk
 * @DATE 19-8-11
 */
@Controller
@RequestMapping("/spitter")
public class SpitterController {

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm() {
        return "registrationForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(@Valid Spitter spitter, @RequestPart("file") byte[] file, Errors errors) throws IOException {
        if (errors.hasErrors()) {
            return "registrationForm";
        }
        FileUtils.byteToFile(file, "/home/zk/workspace/" + "temp.md");
        return "registrationForm";
    }

}
