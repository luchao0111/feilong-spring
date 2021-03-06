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
package com.feilong.spring.aspects.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.feilong.spring.aop.log.Log;

public class LogUserManagerImpl implements LogUserManager{

    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(LogUserManagerImpl.class);

    @Override
    @Log(level = "debug")
    public void addUser(String id,String name){
        LOGGER.info("---UsreManagerImpl中的addUser方法的实现-----");
    }
}
