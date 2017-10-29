package com.bbd.controller;

import com.bbd.data.SpittleRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpittleController {

    @Autowired
    private SpittleRespository spittleRespository;

    public SpittleController(SpittleRespository spittleRespository) {
        this.spittleRespository = spittleRespository;
    }

    @RequestMapping(value = "/spittles", method = RequestMethod.GET)
    public String spittles(Model model) {
        model.addAttribute(spittleRespository.findSpittles(Long.MAX_VALUE, 20));
        return "spittles";
    }

}
