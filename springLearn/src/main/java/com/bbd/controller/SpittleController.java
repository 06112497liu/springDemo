package com.bbd.controller;

import com.bbd.data.Spittle;
import com.bbd.data.SpittleRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SpittleController {

    @Autowired
    private SpittleRespository spittleRespository;

    public SpittleController(SpittleRespository spittleRespository) {
        this.spittleRespository = spittleRespository;
    }

    @RequestMapping(value = "/spittles", method = RequestMethod.GET)
    public List<Spittle> spittles() {
        return spittleRespository.findSpittles(Long.MAX_VALUE, 20);
    }

}
