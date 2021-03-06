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
package com.feilong.spring.messagesource;

import java.io.IOException;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;

import com.feilong.spring.io.ResourceUtil;

/**
 * 
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 * @since 1.11.0
 */
public class BasenameBuilderTest{

    private static final Logger LOGGER = LoggerFactory.getLogger(BasenameBuilderTest.class);

    @Test
    public void test() throws IOException{
        String urlOrPath = "classpath:i18n/help_message_zh_HK.properties";
        Resource resource = ResourceUtil.getResource(urlOrPath);
        String build = BasenameBuilder.build(resource);

        LOGGER.debug(build);
    }
}
