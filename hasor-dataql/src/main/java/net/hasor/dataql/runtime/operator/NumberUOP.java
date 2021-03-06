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
package net.hasor.dataql.runtime.operator;
import net.hasor.dataql.InvokerProcessException;
import net.hasor.dataql.Option;
/**
 * 一元运算。number类型的只处理：负号
 * @author 赵永春(zyc@hasor.net)
 * @version : 2017-03-23
 */
public class NumberUOP extends UnaryOperatorProcess {
    @Override
    public Object doUnaryProcess(int opcode, String operator, Object object, Option option) throws InvokerProcessException {
        if ("-".equals(operator) && object instanceof Number) {
            return OperatorUtils.negate((Number) object);
        }
        String dataType = object == null ? "null" : object.getClass().getName();
        throw new InvokerProcessException(opcode, dataType + " , Cannot be used as '" + operator + "'.");
    }
}