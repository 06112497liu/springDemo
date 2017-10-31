package com.bbd.controller;

import com.bbd.data.Spitter;
import com.bbd.data.Spittle;
import com.bbd.data.SpittleRespository;
import com.bbd.exception.ApplicationException;
import com.bbd.exception.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.mail.Multipart;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@Controller
@RequestMapping(value = "/spitter")
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

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute("spitter", new Spitter());
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(RedirectAttributes model,
                                      @RequestPart(value = "profilePicture", required = false) byte[] profilePicture,
                                      @RequestPart(value = "profilePicture", required = false) MultipartFile multipartFile,
                                      @RequestPart(value = "profilePicture", required = false) Part part, // sevlet3.0支持的文件上传，这个就不用配置MultipartResolver了
                                      @Valid Spitter spitter, Errors errors) {
        if(errors.hasErrors()) return "registerForm";
        spittleRespository.save(spitter);
        model.addFlashAttribute("spitter", spitter);
        return "redirect:/spitter/" + spitter.getUsername();
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable String username, Model model, HttpServletRequest request) {
        StringBuffer s1 = request.getRequestURL();
        Spitter s = spittleRespository.findUserByName(username);
        model.addAttribute("spitter", s);
        return "profile";
    }

}
















