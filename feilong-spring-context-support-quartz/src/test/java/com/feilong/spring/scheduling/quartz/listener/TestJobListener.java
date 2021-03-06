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
package com.feilong.spring.scheduling.quartz.listener;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 * @since 4.0.6
 */
public class TestJobListener implements JobListener{

    private static final Logger LOGGER = LoggerFactory.getLogger(TestJobListener.class);

    @Override
    public String getName(){
        return this.getClass().getName();
    }

    //---------------------------------------------------------------

    @Override
    public void jobToBeExecuted(JobExecutionContext context){
        LOGGER.debug("jobToBeExecuted:[{}],context:[{}]", this.getClass().getName(), context.getFireTime());
    }

    @Override
    public void jobExecutionVetoed(JobExecutionContext context){
        LOGGER.debug("jobExecutionVetoed:{}", this.getClass().getName());
    }

    //---------------------------------------------------------------

    @Override
    public void jobWasExecuted(JobExecutionContext context,JobExecutionException jobException){
        LOGGER.debug("jobWasExecuted:[{}],context:[{}]", this.getClass().getName(), context.getFireTime());
    }
}
