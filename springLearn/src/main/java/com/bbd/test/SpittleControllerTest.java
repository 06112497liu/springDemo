package com.bbd.test;

import com.bbd.controller.SpittleController;
import com.bbd.data.Spittle;
import com.bbd.data.SpittleRespository;
import com.google.common.collect.Lists;
import org.hamcrest.core.IsCollectionContaining;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;

import java.util.Date;
import java.util.List;



public class SpittleControllerTest {

    @Test
    public void testSpittles() throws Exception {
        List<Spittle> expectedList = createSpittleList(20);
        SpittleRespository mockRespository = Mockito.mock(SpittleRespository.class);
        Mockito.when(mockRespository.findSpittles(Long.MAX_VALUE, 20)).thenReturn(expectedList);
        SpittleController spittleController = new SpittleController(mockRespository);
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(spittleController).setSingleView(
                new InternalResourceView("/WEB-INF/views/spittles.jsp")).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/spittles"))
                .andExpect(MockMvcResultMatchers.view().name("spittles"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("spittleList"))
                .andExpect(MockMvcResultMatchers.model().attribute("spittleList",
                        IsCollectionContaining.hasItems(expectedList.toArray())));
    }

    private List<Spittle> createSpittleList(int count) {
        List<Spittle> list = Lists.newArrayList();
        for(int i=0; i<count; i++) {
            list.add(new Spittle(Long.parseLong(i + ""), "Spittle " + i, new Date(), 28.49, 69.78));
        }
        return list;
    }
}
