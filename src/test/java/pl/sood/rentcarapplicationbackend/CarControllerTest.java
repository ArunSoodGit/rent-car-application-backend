package pl.sood.rentcarapplicationbackend;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import pl.sood.rentcarapplicationbackend.model.Car;

import java.sql.Date;


@SpringBootTest
@AutoConfigureMockMvc
public class CarControllerTest {

    private int port = 444;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;


    @Test
    void getCars() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("https://localhost:" + port + "/cars/JHMGD175055242533"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().is(200))
                .andExpect(MockMvcResultMatchers.jsonPath("$.vin", Matchers.is("JHMGD175055242533")));
    }

    @Test
    public void addCar() throws Exception {

    }

    @Test
    public void getAllCars() throws Exception {

    }
    @Test
    public void getCarByVin() throws Exception {

    }
    @Test
    public void updateCar() throws Exception {

    }
    @Test
    public void deleteCar() throws Exception {

    }
}
