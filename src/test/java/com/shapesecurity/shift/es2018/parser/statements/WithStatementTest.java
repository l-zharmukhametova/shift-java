package com.shapesecurity.shift.es2018.parser.statements;

import com.shapesecurity.functional.data.ImmutableList;
import com.shapesecurity.shift.es2018.ast.Block;
import com.shapesecurity.shift.es2018.ast.BlockStatement;
import com.shapesecurity.shift.es2018.ast.EmptyStatement;
import com.shapesecurity.shift.es2018.ast.ExpressionStatement;
import com.shapesecurity.shift.es2018.ast.IdentifierExpression;
import com.shapesecurity.shift.es2018.ast.LiteralNumericExpression;
import com.shapesecurity.shift.es2018.ast.WithStatement;
import com.shapesecurity.shift.es2018.parser.ParserTestCase;
import com.shapesecurity.shift.es2018.parser.JsError;

import org.junit.Test;

public class WithStatementTest extends ParserTestCase {
    @Test
    public void testWithStatement() throws JsError {
        testScript("with(1);", new WithStatement(new LiteralNumericExpression(1.0), new EmptyStatement()));

        testScript("with (x) foo", new WithStatement(new IdentifierExpression("x"), new ExpressionStatement(
                new IdentifierExpression("foo")
        )));

        testScript("with (x) foo", new WithStatement(new IdentifierExpression("x"), new ExpressionStatement(
                new IdentifierExpression("foo")
        )));

        testScript("with (x) { foo }", new WithStatement(new IdentifierExpression("x"), new BlockStatement(
                new Block(ImmutableList.of(new ExpressionStatement(new IdentifierExpression("foo"))))
        )));
    }
}
