package club.jasonkayzk666.controller;

import club.jasonkayzk666.entity.Spitter;
import club.jasonkayzk666.entity.Spittle;
import club.jasonkayzk666.service.SpittleRepository;
import com.sun.org.apache.bcel.internal.generic.GETFIELD;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author zk
 * @DATE 19-8-10
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {

    private static final String MAX_LONG_AS_STRING = "0x7fffffffffffffffL";

    private SpittleRepository repository;

    public SpittleController() {}

    @Autowired
    public SpittleController(SpittleRepository mockRepository) {
        this.repository = mockRepository;
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public String spittles(Model model) {
//        model.addAttribute("spittleList", repository.findSpittles(Long.MAX_VALUE, 20));
//        return "spittles";
//    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Spittle> spittles(
            @RequestParam(value = "max", defaultValue=MAX_LONG_AS_STRING) long max,
            @RequestParam(value = "count", defaultValue = "20") int count) {
        return repository.findSpittles(max, count);
    }

//    @RequestMapping(value = "/show", method = RequestMethod.GET)
//    public String showSpittle(@RequestParam("spittle_id") long spittleId, Model model) {
//        model.addAttribute(repository.findOne(spittleId));
//        return "spittle";
//    }

    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public String showSpittle(
            @PathVariable("spittleId") long spittleId,
            Model model) {
        model.addAttribute(repository.findOne(spittleId));
        return "spittle";
    }

}
