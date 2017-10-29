package com.bbd.test;

import com.bbd.controller.HomeController;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;



public class HomeControllerTest {

    @Test
    public void testHomePage() {
        HomeController controller = new HomeController();
        Assert.assertEquals("home", controller.home());
    }

    @Test
    public void testHomePage2() throws Exception {
        HomeController c = new HomeController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(c).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/")).andExpect(MockMvcResultMatchers.view().name("home"));
    }

}
