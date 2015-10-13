// Generated by src/generate-spec-java.js 

/*
 * Copyright 2015 Shape Security, Inc.
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

package com.shapesecurity.shift.ast;

import com.shapesecurity.functional.data.HashCodeBuilder;
import com.shapesecurity.shift.ast.operators.Precedence;

import org.jetbrains.annotations.NotNull;

public class ArrowExpression extends Expression implements Node {

    @NotNull
    public final FormalParameters params;

    @NotNull
    public final FunctionBodyExpression body;

    public ArrowExpression(@NotNull FormalParameters params, @NotNull FunctionBodyExpression body) {
        super();
        this.params = params;
        this.body = body;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof ArrowExpression && this.params.equals(((ArrowExpression) object).params) &&
               this.body.equals(((ArrowExpression) object).body);
    }

    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "ArrowExpression");
        code = HashCodeBuilder.put(code, this.params);
        code = HashCodeBuilder.put(code, this.body);
        return code;
    }

    @NotNull
    public FormalParameters getParams() {
        return this.params;
    }

    @NotNull
    public ArrowExpression setParams(@NotNull FormalParameters params) {
        return new ArrowExpression(params, this.body);
    }

    @NotNull
    public FunctionBodyExpression getBody() {
        return this.body;
    }

    @NotNull
    public ArrowExpression setBody(@NotNull FunctionBodyExpression body) {
        return new ArrowExpression(this.params, body);
    }

    @Override
    @NotNull
    public Precedence getPrecedence() {
        return Precedence.ASSIGNMENT;
    }

}