/*
 * Copyright (C) 2019  All rights reserved.
 * 
 * This file is part of the Calculator.
 * 
 * TodoApplicationControllerTest.java is free software: you can redistribute it and/or modify it under the 
 * terms of the Apache License, Version 2.0 (the License);
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * The software is provided "AS IS", without any warranty of any kind, express or implied,
 * including but not limited to the warranties of merchantability, fitness for a particular
 * purpose and noninfringement, in no event shall the authors or copyright holders be 
 * liable for any claim, damages or other liability, whether in action of contract, tort or
 * otherwise, arising from, out of or in connection with the software or the use or other
 * dealings in the software.
 * 
 * See README file for the full disclaimer information and LICENSE file for full license 
 * information in the project root.
 * 
 * @author	Carlos Cavero
 *			Atos Research and Innovation, Atos SPAIN SA
 * 
 * Calculator Spring boot Controller tests
 */
package eu.fair4health.f4hportalbackend;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import eu.fair4health.portal.backend.BackendApplication;
import eu.fair4health.portal.backend.controller.UIController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BackendApplication.class)
public class F4hPortalBackendControllerTest {
    private MockMvc mockMvc;

    @InjectMocks
    private UIController uiController;

    // @Mock
    // private UIService uiService;

    /**
     * Init the Mockito annotations and MVC mock.
     * 
     * @return void
     */
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(uiController)
            .build();
    }

    /**
     * Mock the service calls for the different Calculator operations.
     * 
     * @return void
     */
    /* @Before
    public void setUp() {
        Mockito.when(uiService.plus(1, 2))
            .thenReturn(3);
    } */

    /**
     * Test the plus controller mocking the service.
     * 
     * @return void
     */
    @Test
    public void addTwoNumbers_returnOk() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/sample"))
            .andExpect(status().isOk());
        // .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        // .andExpect(content().contentType("3"));
    }
}
