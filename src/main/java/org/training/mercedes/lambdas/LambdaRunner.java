package org.training.mercedes.lambdas;

public class LambdaRunner {
    public static void main(String[] args) {
        String xyz = "xyz";
        IExecute execute1 = new ExecuteImpl();
        String execute = execute1.execute(10);
        System.out.println(execute);

        IExecute execute2 = new IExecute() {
            @Override
            public String execute(int count) {
                return "İşlemi " + count + " kez yaptım " + xyz;
            }

        };
        System.out.println(execute2.execute(10));

        IExecute execute3 = a -> "İşlemi " + a + " kez yaptım " + xyz;
        System.out.println(execute3.execute(10));

        IGreetings greetings1 = (s1, s2) -> "Merhaba " + s1 + " " + s2;
        String greet = greetings1.greet("osman",
                                        "yaycıoğlu");
        System.out.println(greet);

        IGreetings greetings2 = (s1, s2) -> {
            System.out.println("Greeting çalışıyor");
            return "Greetings " + s1 + " " + s2;
        };
        System.out.println(greetings2.greet("osman","yay"));

    }
}
