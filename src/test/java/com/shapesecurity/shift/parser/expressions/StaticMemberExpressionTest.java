package com.shapesecurity.shift.parser.expressions;

import com.shapesecurity.shift.ast.IdentifierExpression;
import com.shapesecurity.shift.ast.StaticMemberExpression;
import com.shapesecurity.shift.parser.ParserTestCase;
import com.shapesecurity.shift.parser.JsError;

import org.junit.Test;

public class StaticMemberExpressionTest extends ParserTestCase {
    @Test
    public void testStaticMemberExpression() throws JsError {
        testScript("a.b", new StaticMemberExpression(new IdentifierExpression("a"), "b"));

        testScript("a.b.c", new StaticMemberExpression(new StaticMemberExpression(new IdentifierExpression("a"), "b"), "c"));

        testScript("a.$._.B0", new StaticMemberExpression(new StaticMemberExpression(
                new StaticMemberExpression(new IdentifierExpression("a"), "$"), "_"), "B0"));

        testScript("a.if", new StaticMemberExpression(new IdentifierExpression("a"), "if"));

        testScript("a.true", new StaticMemberExpression(new IdentifierExpression("a"), "true"));

        testScript("a.false", new StaticMemberExpression(new IdentifierExpression("a"), "false"));

        testScript("a.null", new StaticMemberExpression(new IdentifierExpression("a"), "null"));
    }
}
