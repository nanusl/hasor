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
package org.more.hypha.xml.tags.aop;
import org.more.hypha.aop.AopService;
import org.more.hypha.aop.assembler.AopService_Impl;
import org.more.hypha.xml.XmlDefineResource;
import org.more.hypha.xml.tags.Tag_Abstract;
/**
 * ���ڽ���aop�����ռ��ǩ���������࣬��Ҫ�������ֲ�ͬ�����ռ䡣
 * @version 2010-10-9
 * @author ������ (zyc@byshell.org)
 */
public class TagAop_NS extends Tag_Abstract {
    public TagAop_NS(XmlDefineResource configuration) {
        super(configuration);
    };
    protected AopService getAopConfig() {
        AopService plugin = (AopService) this.getDefineResource().getFlash().getAttribute(AopService_Impl.ServiceName);
        return plugin;
    }
}