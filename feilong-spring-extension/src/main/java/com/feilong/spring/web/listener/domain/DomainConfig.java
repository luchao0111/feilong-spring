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
package com.feilong.spring.web.listener.domain;

import java.io.Serializable;

/**
 * 域名的相关配置.
 *
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 * @since 1.0.9
 * @since 1.12.3 move from feilong-web-extension
 */
public class DomainConfig implements Serializable{

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 288232184048495608L;

    //---------------------------------------------------------------

    /** peoperties的key. */
    private String            key;

    /** 存入application 作用域中的变量名称. */
    private String            variableName;

    /** 配置的真实的值. */
    private String            value;

    //---------------------------------------------------------------

    /**
     * 获得 peoperties的key.
     *
     * @return the key
     */
    public String getKey(){
        return key;
    }

    /**
     * 设置 peoperties的key.
     *
     * @param key
     *            the key to set
     */
    public void setKey(String key){
        this.key = key;
    }

    /**
     * 获得 存入application 作用域中的变量名称.
     *
     * @return the variableName
     */
    public String getVariableName(){
        return variableName;
    }

    /**
     * 设置 存入application 作用域中的变量名称.
     *
     * @param variableName
     *            the variableName to set
     */
    public void setVariableName(String variableName){
        this.variableName = variableName;
    }

    /**
     * 获得 配置的真实的值.
     *
     * @return the value
     */
    public String getValue(){
        return value;
    }

    /**
     * 设置 配置的真实的值.
     *
     * @param value
     *            the value to set
     */
    public void setValue(String value){
        this.value = value;
    }

    /**
     * 获得 serialversionuid.
     *
     * @return the serialversionuid
     */
    public static long getSerialversionuid(){
        return serialVersionUID;
    }

}
