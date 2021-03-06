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

//@Log
public interface UserManager{

    /**
     * Adds the user.
     * 
     * @param string
     *            the string
     * @param name
     *            the name
     */
    void addUser(String string,String name);

    /**
     * Del user.
     * 
     * @param id
     *            the id
     */
    void delUser(int id);

    /**
     * Modify user.
     * 
     * @param id
     *            the id
     * @param name
     *            the name
     * @param age
     *            the age
     */
    void modifyUser(int id,String name,int age);
}
