package com.shapesecurity.shift.serialization;

import com.shapesecurity.shift.ast.Node;
import com.shapesecurity.shift.fuzzer.Fuzzer;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class SerializerTest {
  @Test
  public void testSerializerRandom5() {
    Node randomAST0 = Fuzzer.generate(new Random(0), 5);
    String serialization0 = Serializer.serialize(randomAST0);
    assertEquals("{\"type\":\"Script\",\"directives\":[{\"type\":\"Directive\",\"rawValue\":\"\"},{\"type\":\"Directive\",\"rawValue\":\"[-\"},{\"type\":\"Directive\",\"rawValue\":\"S\"}],\"statements\":[{\"type\":\"TryCatchStatement\",\"body\":{\"type\":\"Block\",\"statements\":[]},\"catchClause\":{\"type\":\"CatchClause\",\"binding\":{\"type\":\"ComputedMemberExpression\",\"expression\":{\"type\":\"BinaryExpression\",\"operator\":\"<<\",\"left\":{\"type\":\"CallExpression\",\"callee\":{\"type\":\"Super\"},\"arguments\":[]},\"right\":{\"type\":\"LiteralStringExpression\",\"value\":\"P\"}},\"object\":{\"type\":\"FunctionExpression\",\"name\":null,\"isGenerator\":false,\"params\":{\"type\":\"FormalParameters\",\"items\":[],\"rest\":null},\"body\":{\"type\":\"FunctionBody\",\"directives\":[],\"statements\":[]}}},\"body\":{\"type\":\"Block\",\"statements\":[]}}},{\"type\":\"ReturnStatement\",\"expression\":null},{\"type\":\"VariableDeclarationStatement\",\"declaration\":{\"type\":\"VariableDeclaration\",\"kind\":\"var\",\"declarators\":[{\"type\":\"VariableDeclarator\",\"binding\":{\"type\":\"ComputedMemberExpression\",\"expression\":{\"type\":\"FunctionExpression\",\"name\":null,\"isGenerator\":true,\"params\":{\"type\":\"FormalParameters\",\"items\":[],\"rest\":null},\"body\":{\"type\":\"FunctionBody\",\"directives\":[],\"statements\":[]}},\"object\":{\"type\":\"BinaryExpression\",\"operator\":\"|\",\"left\":{\"type\":\"LiteralRegexExpression\",\"pattern\":\"/KsgvhR$_G_7Ieo/\",\"flags\":\"\"},\"right\":{\"type\":\"CallExpression\",\"callee\":{\"type\":\"UnaryExpression\",\"operator\":\"+\",\"operand\":{\"type\":\"NewTargetExpression\"}},\"arguments\":[]}}},\"init\":null}]}},{\"type\":\"DebuggerStatement\"}]}", serialization0);

    Node randomAST1 = Fuzzer.generate(new Random(1), 5);
    String serialization1 = Serializer.serialize(randomAST1);
    assertEquals("{\"type\":\"Module\",\"directives\":[{\"type\":\"Directive\",\"rawValue\":\"M\"},{\"type\":\"Directive\",\"rawValue\":\"\u001EM\"},{\"type\":\"Directive\",\"rawValue\":\"Y\"}],\"items\":[{\"type\":\"LabeledStatement\",\"label\":\"Y_Pi\",\"body\":{\"type\":\"SwitchStatementWithDefault\",\"discriminant\":{\"type\":\"ThisExpression\"},\"preDefaultCases\":[{\"type\":\"SwitchCase\",\"test\":{\"type\":\"AssignmentExpression\",\"binding\":{\"type\":\"StaticMemberExpression\",\"property\":\"CX\",\"object\":{\"type\":\"Super\"}},\"expression\":{\"type\":\"LiteralStringExpression\",\"value\":\"#a\"}},\"consequent\":[]},{\"type\":\"SwitchCase\",\"test\":{\"type\":\"UpdateExpression\",\"isPrefix\":false,\"operator\":\"++\",\"operand\":{\"type\":\"BindingIdentifier\",\"name\":\"lyz6mF2\"}},\"consequent\":[]},{\"type\":\"SwitchCase\",\"test\":{\"type\":\"ArrowExpression\",\"params\":{\"type\":\"FormalParameters\",\"items\":[],\"rest\":null},\"body\":{\"type\":\"FunctionBody\",\"directives\":[],\"statements\":[]}},\"consequent\":[]},{\"type\":\"SwitchCase\",\"test\":{\"type\":\"NewTargetExpression\"},\"consequent\":[]}],\"defaultCase\":{\"type\":\"SwitchDefault\",\"consequent\":[]},\"postDefaultCases\":[]}},{\"type\":\"TryFinallyStatement\",\"body\":{\"type\":\"Block\",\"statements\":[{\"type\":\"ForOfStatement\",\"left\":{\"type\":\"ArrayBinding\",\"elements\":[],\"restElement\":null},\"right\":{\"type\":\"LiteralInfinityExpression\"},\"body\":{\"type\":\"EmptyStatement\"}},{\"type\":\"BlockStatement\",\"block\":{\"type\":\"Block\",\"statements\":[]}}]},\"catchClause\":null,\"finalizer\":{\"type\":\"Block\",\"statements\":[{\"type\":\"SwitchStatement\",\"discriminant\":{\"type\":\"ArrowExpression\",\"params\":{\"type\":\"FormalParameters\",\"items\":[],\"rest\":null},\"body\":{\"type\":\"FunctionBody\",\"directives\":[],\"statements\":[]}},\"cases\":[]},{\"type\":\"VariableDeclarationStatement\",\"declaration\":{\"type\":\"VariableDeclaration\",\"kind\":\"let\",\"declarators\":[{\"type\":\"VariableDeclarator\",\"binding\":{\"type\":\"ArrayBinding\",\"elements\":[],\"restElement\":null},\"init\":null}]}}]}},{\"type\":\"Import\",\"defaultBinding\":{\"type\":\"BindingIdentifier\",\"name\":\"I645D\"},\"namedImports\":[{\"type\":\"ImportSpecifier\",\"name\":\"null\",\"binding\":{\"type\":\"BindingIdentifier\",\"name\":\"uqvE1fGVJOaiUwL\"}}],\"moduleSpecifier\":\"\"}]}", serialization1);

    Node randomAST2 = Fuzzer.generate(new Random(2), 5);
    String serialization2 = Serializer.serialize(randomAST2);
    assertEquals("{\"type\":\"Module\",\"directives\":[{\"type\":\"Directive\",\"rawValue\":\"\"},{\"type\":\"Directive\",\"rawValue\":\"nt\"}],\"items\":[{\"type\":\"ImportNamespace\",\"defaultBinding\":null,\"namespaceBinding\":{\"type\":\"BindingIdentifier\",\"name\":\"sFcZT\"},\"moduleSpecifier\":\"\"}]}", serialization2);

    Node randomAST3 = Fuzzer.generate(new Random(3), 5);
    String serialization3 = Serializer.serialize(randomAST3);
    assertEquals("{\"type\":\"Script\",\"directives\":[],\"statements\":[]}", serialization3);

    Node randomAST4 = Fuzzer.generate(new Random(4), 5);
    String serialization4 = Serializer.serialize(randomAST4);
    assertEquals("{\"type\":\"Script\",\"directives\":[{\"type\":\"Directive\",\"rawValue\":\"9\"},{\"type\":\"Directive\",\"rawValue\":\"\"}],\"statements\":[]}", serialization4);

    Node randomAST5 = Fuzzer.generate(new Random(5), 5);
    String serialization5 = Serializer.serialize(randomAST5);
    assertEquals("{\"type\":\"Module\",\"directives\":[{\"type\":\"Directive\",\"rawValue\":\";f\"},{\"type\":\"Directive\",\"rawValue\":\"I\u001F\"}],\"items\":[{\"type\":\"ImportNamespace\",\"defaultBinding\":{\"type\":\"BindingIdentifier\",\"name\":\"n\"},\"namespaceBinding\":{\"type\":\"BindingIdentifier\",\"name\":\"aO2kq\"},\"moduleSpecifier\":\"Vi\"},{\"type\":\"ExportFrom\",\"namedExports\":[{\"type\":\"ExportSpecifier\",\"name\":\"null\",\"exportedName\":\"\"},{\"type\":\"ExportSpecifier\",\"name\":\"}\u001E\",\"exportedName\":\";\"}],\"moduleSpecifier\":\"\"}]}", serialization5);
  }

  @Test
  public void testSerializerRandom10() {
    Node randomAST = Fuzzer.generate(new Random(0), 10);
    String serialization = Serializer.serialize(randomAST);
    assertEquals("{\"type\":\"Script\",\"directives\":[{\"type\":\"Directive\",\"rawValue\":\"\"},{\"type\":\"Directive\",\"rawValue\":\"[-\"},{\"type\":\"Directive\",\"rawValue\":\"S\"}],\"statements\":[{\"type\":\"TryFinallyStatement\",\"body\":{\"type\":\"Block\",\"statements\":[{\"type\":\"IfStatement\",\"test\":{\"type\":\"NewTargetExpression\"},\"consequent\":{\"type\":\"BlockStatement\",\"block\":{\"type\":\"Block\",\"statements\":[]}},\"alternate\":null},{\"type\":\"ClassDeclaration\",\"name\":{\"type\":\"BindingIdentifier\",\"name\":\"tS39gGdj8rSO\"},\"super\":null,\"elements\":[{\"type\":\"ClassElement\",\"isStatic\":\"false\",\"method\":{\"type\":\"Getter\",\"body\":{\"type\":\"FunctionBody\",\"directives\":[],\"statements\":[]},\"name\":{\"type\":\"ComputedPropertyName\",\"expression\":{\"type\":\"AssignmentExpression\",\"binding\":{\"type\":\"BindingIdentifier\",\"name\":\"eK0\"},\"expression\":{\"type\":\"LiteralBooleanExpression\",\"value\":true}}}}},{\"type\":\"ClassElement\",\"isStatic\":\"false\",\"method\":{\"type\":\"Getter\",\"body\":{\"type\":\"FunctionBody\",\"directives\":[],\"statements\":[]},\"name\":{\"type\":\"ComputedPropertyName\",\"expression\":{\"type\":\"ArrayExpression\",\"elements\":[]}}}}]}]},\"catchClause\":{\"type\":\"CatchClause\",\"binding\":{\"type\":\"StaticMemberExpression\",\"property\":\".\",\"object\":{\"type\":\"CompoundAssignmentExpression\",\"operator\":\"^=\",\"binding\":{\"type\":\"BindingIdentifier\",\"name\":\"CQoV6RQlbW\"},\"expression\":{\"type\":\"CompoundAssignmentExpression\",\"operator\":\"+=\",\"binding\":{\"type\":\"BindingIdentifier\",\"name\":\"nxL0$W59s2Cih\"},\"expression\":{\"type\":\"ThisExpression\"}}}},\"body\":{\"type\":\"Block\",\"statements\":[]}},\"finalizer\":{\"type\":\"Block\",\"statements\":[]}},{\"type\":\"ReturnStatement\",\"expression\":null},{\"type\":\"VariableDeclarationStatement\",\"declaration\":{\"type\":\"VariableDeclaration\",\"kind\":\"var\",\"declarators\":[{\"type\":\"VariableDeclarator\",\"binding\":{\"type\":\"ArrayBinding\",\"elements\":[],\"restElement\":{\"type\":\"ArrayBinding\",\"elements\":[],\"restElement\":null}},\"init\":null},{\"type\":\"VariableDeclarator\",\"binding\":{\"type\":\"ComputedMemberExpression\",\"expression\":{\"type\":\"ThisExpression\"},\"object\":{\"type\":\"CallExpression\",\"callee\":{\"type\":\"UnaryExpression\",\"operator\":\"+\",\"operand\":{\"type\":\"NewTargetExpression\"}},\"arguments\":[]}},\"init\":null},{\"type\":\"VariableDeclarator\",\"binding\":{\"type\":\"ArrayBinding\",\"elements\":[{\"type\":\"ObjectBinding\",\"properties\":[]},{\"type\":\"StaticMemberExpression\",\"property\":\"FK\",\"object\":{\"type\":\"Super\"}},{\"type\":\"ArrayBinding\",\"elements\":[],\"restElement\":null},null],\"restElement\":null},\"init\":null}]}},{\"type\":\"DebuggerStatement\"}]}", serialization);

    Node randomAST1 = Fuzzer.generate(new Random(1), 10);
    String serialization1 = Serializer.serialize(randomAST1);
    assertEquals("{\"type\":\"Module\",\"directives\":[{\"type\":\"Directive\",\"rawValue\":\"M\"},{\"type\":\"Directive\",\"rawValue\":\"\u001EM\"},{\"type\":\"Directive\",\"rawValue\":\"Y\"}],\"items\":[{\"type\":\"ExportAllFrom\",\"moduleSpecifier\":\"\"},{\"type\":\"TryFinallyStatement\",\"body\":{\"type\":\"Block\",\"statements\":[{\"type\":\"WithStatement\",\"object\":{\"type\":\"NewExpression\",\"callee\":{\"type\":\"ConditionalExpression\",\"test\":{\"type\":\"LiteralRegexExpression\",\"pattern\":\"/sR/\",\"flags\":\"\"},\"consequent\":{\"type\":\"NewTargetExpression\"},\"alternate\":{\"type\":\"ArrayExpression\",\"elements\":[]}},\"arguments\":[{\"type\":\"LiteralInfinityExpression\"},{\"type\":\"SpreadElement\",\"expression\":{\"type\":\"LiteralNullExpression\"}},{\"type\":\"UnaryExpression\",\"operator\":\"-\",\"operand\":{\"type\":\"ConditionalExpression\",\"test\":{\"type\":\"UnaryExpression\",\"operator\":\"+\",\"operand\":{\"type\":\"ThisExpression\"}},\"consequent\":{\"type\":\"ComputedMemberExpression\",\"expression\":{\"type\":\"ArrayExpression\",\"elements\":[]},\"object\":{\"type\":\"ArrowExpression\",\"params\":{\"type\":\"FormalParameters\",\"items\":[],\"rest\":null},\"body\":{\"type\":\"FunctionBody\",\"directives\":[],\"statements\":[]}}},\"alternate\":{\"type\":\"LiteralRegexExpression\",\"pattern\":\"/XoQVjmQ8/\",\"flags\":\"\"}}},{\"type\":\"SpreadElement\",\"expression\":{\"type\":\"TemplateExpression\",\"tag\":null,\"elements\":[]}}]},\"body\":{\"type\":\"WhileStatement\",\"test\":{\"type\":\"LiteralNumericExpression\",\"value\":0.522650632443011},\"body\":{\"type\":\"SwitchStatement\",\"discriminant\":{\"type\":\"ArrayExpression\",\"elements\":[]},\"cases\":[{\"type\":\"SwitchCase\",\"test\":{\"type\":\"ObjectExpression\",\"properties\":[]},\"consequent\":[]},{\"type\":\"SwitchCase\",\"test\":{\"type\":\"LiteralInfinityExpression\"},\"consequent\":[]},{\"type\":\"SwitchCase\",\"test\":{\"type\":\"LiteralInfinityExpression\"},\"consequent\":[]},{\"type\":\"SwitchCase\",\"test\":{\"type\":\"FunctionExpression\",\"name\":null,\"isGenerator\":true,\"params\":{\"type\":\"FormalParameters\",\"items\":[],\"rest\":null},\"body\":{\"type\":\"FunctionBody\",\"directives\":[],\"statements\":[]}},\"consequent\":[]}]}}},{\"type\":\"BlockStatement\",\"block\":{\"type\":\"Block\",\"statements\":[{\"type\":\"ForOfStatement\",\"left\":{\"type\":\"BindingIdentifier\",\"name\":\"OvB2tqAbEj\"},\"right\":{\"type\":\"BinaryExpression\",\"operator\":\"^\",\"left\":{\"type\":\"ThisExpression\"},\"right\":{\"type\":\"YieldGeneratorExpression\",\"expression\":{\"type\":\"ClassExpression\",\"name\":null,\"super\":null,\"elements\":[]}}},\"body\":{\"type\":\"WithStatement\",\"object\":{\"type\":\"LiteralNullExpression\"},\"body\":{\"type\":\"DebuggerStatement\"}}},{\"type\":\"ForInStatement\",\"left\":{\"type\":\"VariableDeclaration\",\"kind\":\"var\",\"declarators\":[{\"type\":\"VariableDeclarator\",\"binding\":{\"type\":\"ArrayBinding\",\"elements\":[],\"restElement\":null},\"init\":null}]},\"right\":{\"type\":\"CallExpression\",\"callee\":{\"type\":\"ComputedMemberExpression\",\"expression\":{\"type\":\"YieldGeneratorExpression\",\"expression\":{\"type\":\"CompoundAssignmentExpression\",\"operator\":\">>=\",\"binding\":{\"type\":\"StaticMemberExpression\",\"property\":\"\u0015n\",\"object\":{\"type\":\"IdentifierExpression\",\"name\":\"arguments\"}},\"expression\":{\"type\":\"CompoundAssignmentExpression\",\"operator\":\"&=\",\"binding\":{\"type\":\"BindingIdentifier\",\"name\":\"iDGg8g\"},\"expression\":{\"type\":\"UpdateExpression\",\"isPrefix\":false,\"operator\":\"++\",\"operand\":{\"type\":\"StaticMemberExpression\",\"property\":\",O\",\"object\":{\"type\":\"Super\"}}}}}},\"object\":{\"type\":\"CompoundAssignmentExpression\",\"operator\":\"%=\",\"binding\":{\"type\":\"StaticMemberExpression\",\"property\":\"UC\",\"object\":{\"type\":\"Super\"}},\"expression\":{\"type\":\"LiteralStringExpression\",\"value\":\"#a\"}}},\"arguments\":[]},\"body\":{\"type\":\"BlockStatement\",\"block\":{\"type\":\"Block\",\"statements\":[]}}}]}}]},\"catchClause\":null,\"finalizer\":{\"type\":\"Block\",\"statements\":[{\"type\":\"ExpressionStatement\",\"expression\":{\"type\":\"ArrayExpression\",\"elements\":[null,{\"type\":\"CompoundAssignmentExpression\",\"operator\":\"<<=\",\"binding\":{\"type\":\"BindingIdentifier\",\"name\":\"Tnq$2\"},\"expression\":{\"type\":\"ObjectExpression\",\"properties\":[]}},null]}},{\"type\":\"ForInStatement\",\"left\":{\"type\":\"ArrayBinding\",\"elements\":[{\"type\":\"BindingWithDefault\",\"binding\":{\"type\":\"StaticMemberExpression\",\"property\":\"+\u001F\",\"object\":{\"type\":\"Super\"}},\"init\":{\"type\":\"YieldGeneratorExpression\",\"expression\":{\"type\":\"LiteralStringExpression\",\"value\":\"4\"}}}],\"restElement\":{\"type\":\"StaticMemberExpression\",\"property\":\"\",\"object\":{\"type\":\"BinaryExpression\",\"operator\":\"instanceof\",\"left\":{\"type\":\"ArrayExpression\",\"elements\":[]},\"right\":{\"type\":\"FunctionExpression\",\"name\":null,\"isGenerator\":true,\"params\":{\"type\":\"FormalParameters\",\"items\":[],\"rest\":null},\"body\":{\"type\":\"FunctionBody\",\"directives\":[],\"statements\":[]}}}}},\"right\":{\"type\":\"LiteralStringExpression\",\"value\":\"+\"},\"body\":{\"type\":\"BlockStatement\",\"block\":{\"type\":\"Block\",\"statements\":[{\"type\":\"ContinueStatement\",\"label\":\"null\"}]}}}]}},{\"type\":\"Import\",\"defaultBinding\":{\"type\":\"BindingIdentifier\",\"name\":\"I645D\"},\"namedImports\":[{\"type\":\"ImportSpecifier\",\"name\":\"null\",\"binding\":{\"type\":\"BindingIdentifier\",\"name\":\"uqvE1fGVJOaiUwL\"}}],\"moduleSpecifier\":\"\"}]}", serialization1);

    Node randomAST2 = Fuzzer.generate(new Random(2), 10);
    String serialization2 = Serializer.serialize(randomAST2);
    assertEquals("{\"type\":\"Module\",\"directives\":[{\"type\":\"Directive\",\"rawValue\":\"\"},{\"type\":\"Directive\",\"rawValue\":\"nt\"}],\"items\":[{\"type\":\"ImportNamespace\",\"defaultBinding\":null,\"namespaceBinding\":{\"type\":\"BindingIdentifier\",\"name\":\"sFcZT\"},\"moduleSpecifier\":\"\"}]}", serialization2);

    Node randomAST3 = Fuzzer.generate(new Random(3), 10);
    String serialization3 = Serializer.serialize(randomAST3);
    assertEquals("{\"type\":\"Script\",\"directives\":[],\"statements\":[]}", serialization3);

    Node randomAST4 = Fuzzer.generate(new Random(4), 10);
    String serialization4 = Serializer.serialize(randomAST4);
    assertEquals("{\"type\":\"Script\",\"directives\":[{\"type\":\"Directive\",\"rawValue\":\"9\"},{\"type\":\"Directive\",\"rawValue\":\"\"}],\"statements\":[]}", serialization4);

    Node randomAST5 = Fuzzer.generate(new Random(5), 10);
    String serialization5 = Serializer.serialize(randomAST5);
    assertEquals("{\"type\":\"Module\",\"directives\":[{\"type\":\"Directive\",\"rawValue\":\";f\"},{\"type\":\"Directive\",\"rawValue\":\"I\u001F\"}],\"items\":[{\"type\":\"ImportNamespace\",\"defaultBinding\":{\"type\":\"BindingIdentifier\",\"name\":\"n\"},\"namespaceBinding\":{\"type\":\"BindingIdentifier\",\"name\":\"aO2kq\"},\"moduleSpecifier\":\"Vi\"},{\"type\":\"ExportFrom\",\"namedExports\":[{\"type\":\"ExportSpecifier\",\"name\":\"null\",\"exportedName\":\"\"},{\"type\":\"ExportSpecifier\",\"name\":\"}\u001E\",\"exportedName\":\";\"}],\"moduleSpecifier\":\"\"}]}", serialization5);
  }
}