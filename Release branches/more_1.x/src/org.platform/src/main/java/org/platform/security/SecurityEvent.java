/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.platform.security;
/**
 * 
 * @version : 2013-5-8
 * @author ������ (zyc@byshell.org)
 */
public interface SecurityEvent {
    /**��������URLȨ��ʱ�����¼��п��Բٿ�AuthSession��ʱ����·������Ȩ�ޡ�*/
    public static final String Security_URLPermissionEvent             = "Security_URLPermissionEvent";
    /**�����¼�*/
    public static final String Security_Login_Event                    = "Security_Login_Event";
    /**�ǳ��¼�*/
    public static final String Security_Logout_Event                   = "Security_Logout_Event";
    /**AuthSession���ر�*/
    public static final String Security_AuthSession_Close_Event        = "Security_AuthSession_Close_Event";
    /**AuthSession������*/
    public static final String Security_AuthSession_New_Event          = "Security_AuthSession_New_Event";
    /**��ǰ�̼߳����AuthSession��*/
    public static final String Security_AuthSession_Activate_Event     = "Security_AuthSession_Activate_Event";
    /**��ǰ�̶߳ۻ���AuthSession��*/
    public static final String Security_AuthSession_Inactivation_Event = "Security_AuthSession_Inactivation_Event";
}