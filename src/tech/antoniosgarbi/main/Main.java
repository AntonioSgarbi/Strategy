package tech.antoniosgarbi.main;

import tech.antoniosgarbi.Context;
import tech.antoniosgarbi.OperationAdd;
import tech.antoniosgarbi.OperationMultiply;
import tech.antoniosgarbi.OperationSubtract;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

    }
}
