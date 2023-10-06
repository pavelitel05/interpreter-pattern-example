package patterns.interpreter.expression;

import patterns.interpreter.context.Context;

/**
 * @author nerzon
 */
public abstract class AbstractExpression {
    public abstract void interpret(Context context);
}
