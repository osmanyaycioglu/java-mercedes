package org.training.mercedes.files;

import org.training.mercedes.immutables.CustomerIm2;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileRunner {
    public static void main(String[] args) {

        try {
            File file = new File("customer.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Line : " + line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Path path = Paths.get("file.xtx");
            Path path2 = Paths.get("/var/xyz","file.txt");
            System.out.println(path.toAbsolutePath());
            System.out.println(path2.toAbsolutePath());
            System.out.println(path2.toUri());
            System.out.println(path2.toString());

            byte[] bytes = Files.readAllBytes(Paths.get("customer.txt"));

            ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
            long aLong = byteBuffer.getLong();
            System.out.println("İlk 8 byte long : " + String.format("0x%08X", aLong));

            Map<String, CustomerIm2> customerMap = new HashMap<>();
            System.out.println("-----------------");
            List<String> stringList = Files.readAllLines(Paths.get("customer.txt"),
                                                         Charset.forName("UTF-8"));
            for (String s : stringList) {
                String[] split = s.split(",");
                if (split.length == 5) {
                    String name = split[0];
                    String surname = split[1];
                    int age = Integer.parseInt(split[2]);
                    int height = Integer.parseInt(split[3]);
                    int weight = Integer.parseInt(split[4]);
                    CustomerIm2 customerIm2 = CustomerIm2.builder()
                                                         .setName(name)
                                                         .setSurname(surname)
                                                         .setAge(age)
                                                         .setHeight(height)
                                                         .setWeight(weight)
                                                         .build();
                    customerMap.put(name + " " + surname,
                                    customerIm2);
                }
            }
            System.out.println(customerMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
