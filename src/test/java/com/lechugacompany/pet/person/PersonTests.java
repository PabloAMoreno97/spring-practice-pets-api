package com.lechugacompany.pet.person;

import com.lechugacompany.pet.model.Person;
import com.lechugacompany.pet.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class PersonTests {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private PersonService personService;

    @Test
    void testServiceGetPerson(){
        Person person = personService.getPersonById(1L);
        assertEquals(person.getDocument(), 1);
        assertEquals(person.getName(), "Pablo");
        assertEquals(person.getLastname(), "Kuhlman");
    }

    @Test
    void testEndpointGetPerson() throws Exception {
        String expectedResponse = "{\"document\":1,\"name\":\"Pablo\",\"lastname\":\"Kuhlman\",\"email\":\"pablo@correo.com\",\"birth\":\"1997-10-22\"}";
        mockMvc.perform(MockMvcRequestBuilders.get("/api/person/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedResponse)
        );
    }

    @Test
    void testEndpointGetListPerson() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/person")
        .contentType(MediaType.APPLICATION_JSON))
        .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
