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

import org.jetbrains.annotations.NotNull;

public class WithStatement extends Statement implements Node {

    @NotNull
    public final Expression _object;

    @NotNull
    public final Statement body;

    public WithStatement(@NotNull Expression _object, @NotNull Statement body) {
        super();
        this._object = _object;
        this.body = body;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof WithStatement && this._object.equals(((WithStatement) object)._object) &&
               this.body.equals(((WithStatement) object).body);
    }

    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "WithStatement");
        code = HashCodeBuilder.put(code, this._object);
        code = HashCodeBuilder.put(code, this.body);
        return code;
    }

    @NotNull
    public Expression get_object() {
        return this._object;
    }

    @NotNull
    public WithStatement set_object(@NotNull Expression _object) {
        return new WithStatement(_object, this.body);
    }

    @NotNull
    public Statement getBody() {
        return this.body;
    }

    @NotNull
    public WithStatement setBody(@NotNull Statement body) {
        return new WithStatement(this._object, body);
    }

}