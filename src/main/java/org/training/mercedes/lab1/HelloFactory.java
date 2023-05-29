package org.training.mercedes.lab1;

import java.util.Arrays;
import java.util.List;

public class HelloFactory {

    private List<IHello> helloInterfaces = Arrays.asList(new HelloTR(),
                                                         new HelloENG(),
                                                         new HelloGER(),
                                                         new HelloESP(),
                                                         new HelloJP());

    public IHello createHelloImpl(int index) {
        if (index > helloInterfaces.size()) {
            return null;
        }
        return helloInterfaces.get(index - 1);
    }

    public void writeMenu() {
        for (int i = 0; i < helloInterfaces.size(); i++) {
            IHello hello = helloInterfaces.get(i);
            System.out.println((i + 1) + "-" + hello.shortDesc());
        }
    }

}
