package org.training.mercedes.lambdas;

public class ExecuteImpl implements IExecute {

    @Override
    public String execute(int count) {
        return "İşlemi " + count + " kez yaptım";
    }

}
