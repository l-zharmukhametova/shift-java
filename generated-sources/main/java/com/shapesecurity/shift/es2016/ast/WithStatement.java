// Generated by shift-java-gen/ast.js

/*
 * Copyright 2016 Shape Security, Inc.
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

package com.shapesecurity.shift.es2016.ast;

import org.jetbrains.annotations.NotNull;
import com.shapesecurity.functional.data.HashCodeBuilder;

public class WithStatement implements Statement {
    @NotNull
    public final Expression object;

    @NotNull
    public final Statement body;


    public WithStatement (@NotNull Expression object, @NotNull Statement body) {
        this.object = object;
        this.body = body;
    }


    @Override
    public boolean equals(Object object) {
        return object instanceof WithStatement && this.object.equals(((WithStatement) object).object) && this.body.equals(((WithStatement) object).body);
    }


    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "WithStatement");
        code = HashCodeBuilder.put(code, this.object);
        code = HashCodeBuilder.put(code, this.body);
        return code;
    }

}