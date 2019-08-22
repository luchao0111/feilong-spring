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
package com.feilong.spring.scheduling.quartz;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.feilong.context.Task;
import com.feilong.store.member.Member;

/**
 * 
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 * @since 4.0.7
 */
public class PixiboTask implements Task<Member>{

    private static final Logger LOGGER = LoggerFactory.getLogger(PixiboTask.class);

    /*
     * (non-Javadoc)
     * 
     * @see com.feilong.spring.scheduling.quartz.Job#excute()
     */
    @Override
    public Member run(){
        LOGGER.debug("current Time:[{}]", new Date());
        return null;
    }
}
