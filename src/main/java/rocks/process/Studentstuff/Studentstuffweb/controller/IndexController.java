package rocks.process.Studentstuff.Studentstuffweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping (path = "/")
public class IndexController {

    @GetMapping
    public String getIndexView() {return "Home.html";}

}
