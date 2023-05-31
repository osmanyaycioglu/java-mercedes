package org.training.mercedes.generics;

import org.training.mercedes.Car;
import org.training.mercedes.immutables.CustomerIm;
import org.training.mercedes.immutables.CustomerIm2;

import java.util.ArrayList;
import java.util.List;

public class GenericRunner {
    public static void main(String[] args) {
        DataGenericHolder dataGenericHolder = new DataGenericHolder();
        dataGenericHolder.setData2(CustomerIm2.builder()
                                              .setName("osman")
                                              .setSurname("yaycıoğlu")
                                              .setAge(53)
                                              .setHeight(200)
                                              .setWeight(90)
                                              .build());
        dataGenericHolder.setData1(100);
        dataGenericHolder.setData1("osman");
        dataGenericHolder.setData1(100.13D);
        Object data1 = dataGenericHolder.getData1();
        if (data1 instanceof String){
            String str1 = (String) data1;
            System.out.println("String : " + str1);
        } else if (data1 instanceof Integer) {
            Integer integer = (Integer) data1;
            System.out.println("Integer : " + integer);

        } else if (data1 instanceof Double) {
            Double aDouble = (Double) data1;
            System.out.println("Double : " + aDouble);
        }

        GenericDataHolder<Integer,String> intStrData = new GenericDataHolder<Integer,String>();
        intStrData.setData1(100);
        intStrData.setData2("osman");
        String data2 = intStrData.getData2();
        GenericDataHolder<CustomerIm, Car> custCarData = new GenericDataHolder<>();
        custCarData.setData1(new CustomerIm("osman",
                                            "yaycıoğlu"));
        custCarData.setData2(new Car());
        CustomerIm data11 = custCarData.getData1();
        List<String> stringList = new ArrayList<>();
    }
}
