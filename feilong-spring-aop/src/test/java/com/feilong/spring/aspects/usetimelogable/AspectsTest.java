/*
 * Copyright (C) 2008 feilong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.spring.aspects.usetimelogable;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * The Class AspectsTest.
 * 
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 */
@ContextConfiguration(locations = "classpath:spring-aop.xml")
public class AspectsTest extends AbstractJUnit4SpringContextTests{

    /** The user manager. */
    @Autowired
    private UserManager userManager;

    @Test
    public void addUser(){
        userManager.addUser("1018", "Jummy");
    }

    @Test
    public void delUser(){
        userManager.delUser(5);
    }
}