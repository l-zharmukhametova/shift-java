package com.shapesecurity.shift.parser.expressions;

import com.shapesecurity.shift.ast.*;
import com.shapesecurity.shift.ast.operators.BinaryOperator;
import com.shapesecurity.shift.parser.ParserTestCase;
import com.shapesecurity.shift.parser.JsError;

import org.junit.Test;

public class ComputedMemberExpressionTest extends ParserTestCase {
    @Test
    public void testComputedMemberExpression() throws JsError {
        testScript("a[b, c]", new ComputedMemberExpression(new IdentifierExpression("a"), new BinaryExpression(
                new IdentifierExpression("b"), BinaryOperator.Sequence, new IdentifierExpression("c"))));

        testScript("a[b]", new ComputedMemberExpression(new IdentifierExpression("a"), new IdentifierExpression("b")));

        testScript("a[b] = b", new AssignmentExpression(new ComputedMemberAssignmentTarget(new IdentifierExpression("a"), new IdentifierExpression("b")), new IdentifierExpression("b")));

        testScript("(a[b]||(c[d]=e))", new BinaryExpression(new ComputedMemberExpression(
                new IdentifierExpression("a"), new IdentifierExpression("b")), BinaryOperator.LogicalOr, new AssignmentExpression(
                new ComputedMemberAssignmentTarget(new IdentifierExpression("c"), new IdentifierExpression("d")),
                new IdentifierExpression("e"))));

        testScript("a&&(b=c)&&(d=e)", new BinaryExpression(new BinaryExpression(
                new IdentifierExpression("a"), BinaryOperator.LogicalAnd, new AssignmentExpression(new AssignmentTargetIdentifier("b"),
                new IdentifierExpression("c"))), BinaryOperator.LogicalAnd, new AssignmentExpression(new AssignmentTargetIdentifier("d"),
                new IdentifierExpression("e"))));
    }
}
