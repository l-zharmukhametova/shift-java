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

import org.jetbrains.annotations.NotNull;
import com.shapesecurity.functional.data.HashCodeBuilder;

public class AssignmentTargetPropertyProperty extends AssignmentTargetProperty implements Node {

  @NotNull
  public final PropertyName name;

  @NotNull
  public final AssignmentTargetAssignmentTargetWithDefault binding;

  public AssignmentTargetPropertyProperty (@NotNull PropertyName name, @NotNull AssignmentTargetAssignmentTargetWithDefault binding)
  {
    super();
    this.name = name;
    this.binding = binding;
  }

  @Override
  public boolean equals(Object object)
  {
    return object instanceof AssignmentTargetPropertyProperty && this.name.equals(((AssignmentTargetPropertyProperty) object).name) && this.binding.equals(((AssignmentTargetPropertyProperty) object).binding);
  }

  @Override
  public int hashCode()
  {
    int code = HashCodeBuilder.put(0, "AssignmentTargetPropertyProperty");
    code = HashCodeBuilder.put(code, this.name);
    code = HashCodeBuilder.put(code, this.binding);
    return code;
  }

  @NotNull
  public PropertyName getName()
  {
    return this.name;
  }

  @NotNull
  public AssignmentTargetAssignmentTargetWithDefault getBinding()
  {
    return this.binding;
  }

  @NotNull
  public AssignmentTargetPropertyProperty setName(@NotNull PropertyName name)
  {
    return new AssignmentTargetPropertyProperty(name, this.binding);
  }

  @NotNull
  public AssignmentTargetPropertyProperty setBinding(@NotNull AssignmentTargetAssignmentTargetWithDefault binding)
  {
    return new AssignmentTargetPropertyProperty(this.name, binding);
  }

}