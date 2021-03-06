// Generated by ast.js
/**
 * Copyright 2018 Shape Security, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.shapesecurity.shift.es2018.ast;

import javax.annotation.Nonnull;
import com.shapesecurity.functional.data.HashCodeBuilder;

public class ExpressionStatement implements Statement {
    @Nonnull
    public final Expression expression;


    public ExpressionStatement (@Nonnull Expression expression) {
        this.expression = expression;
    }


    @Override
    public boolean equals(Object object) {
        return object instanceof ExpressionStatement && this.expression.equals(((ExpressionStatement) object).expression);
    }


    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "ExpressionStatement");
        code = HashCodeBuilder.put(code, this.expression);
        return code;
    }

}
