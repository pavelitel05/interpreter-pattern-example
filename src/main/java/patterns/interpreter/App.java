package patterns.interpreter;

import patterns.interpreter.context.Context;
import patterns.interpreter.expression.FieldExpression;
import patterns.interpreter.expression.TableExpression;

/**
 * @author nerzon
 */
public class App {
    public static void main(String[] args) {
        Context context = new Context();

        FieldExpression fieldOne = new FieldExpression("name");
        FieldExpression fieldTwo = new FieldExpression("pin");

        TableExpression table = new TableExpression("bank_account");

        fieldOne.interpret(context);
        fieldTwo.interpret(context);
        table.interpret(context);

        System.out.println(context.buildQuery());
    }
}
