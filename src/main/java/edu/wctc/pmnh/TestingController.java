package edu.wctc.pmnh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/testing")
public class TestingController {
    @RequestMapping("/newTest")
    public String showTesting() {
        return "pages/testing-new";
    }

}
