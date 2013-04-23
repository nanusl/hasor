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
package org.more.classcode;
import org.more.core.error.LostException;
/**
 * ��������������һ�㣬���ฺ����aop����������󻷽�ִ�з������á������ִ�����յ���ʱmethod�����޷���λ�䷽����ô���ᵼ��NoSuchMethodException�쳣
 * @version 2010-9-2
 * @author ������ (zyc@byshell.org)
 */
class AopFilterChain_End implements AopFilterChain {
    public Object doInvokeFilter(Object target, Method method, Object[] args) throws Throwable {
        if (method == null)
            throw new LostException("��Aop�����ջ��ڶ�ʧ������");
        return method.getTargetMeyhod().invoke(target, args);
    }
}