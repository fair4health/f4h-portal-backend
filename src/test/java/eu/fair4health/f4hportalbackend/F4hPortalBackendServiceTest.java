/*
 * Copyright (C) 2019  Atos Spain SA. All rights reserved.
 * 
 * This file is part of the auth.
 * 
 * AuthTest.java is free software: you can redistribute it and/or modify it under the 
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
 * @author	Carlos Cavero Barca
 *			Atos Research and Innovation, Atos SPAIN SA
 * 
 * Spring boot application test services for Keycloak auth
 */

package eu.fair4health.f4hportalbackend;

import static org.assertj.core.api.Assertions.assertThat;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import eu.fair4health.portal.backend.BackendApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BackendApplication.class)
public class F4hPortalBackendServiceTest {

    /**
     * Create the Bean Calculator Service.
     * 
     * @return the Calculator Service
     */
/*    @TestConfiguration
    static class CalcServiceImplTestContextConfiguration {

        @Bean
        public UIService authService() {
            return new UIService();
        }
    } */

    // TODO
    /* @Autowired
    private UIService uiService; */

    /**
     * SetUp the system to mock the services.
     * 
     * @return void
     */
    @Before
    public void setUp() {
    }

    /**
     * Test all the Service functionalities provided.
     * 
     * @return void
     * @throws NotAuthorizedException, when some not authorization raises 
     */
    @Test
    public void callService_returnExpectedBehaviourTest() {

        /* int found = uiService.plus(1, 2);

        assertThat(found, Matchers.<Integer> is(3)); */
    }

}
