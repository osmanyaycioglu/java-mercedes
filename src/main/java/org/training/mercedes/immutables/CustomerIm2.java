package org.training.mercedes.immutables;

public class CustomerIm2 {
    private final String name;
    private final String surname;
    private final int age;
    private final int weight;
    private final int height;

    private CustomerIm2(String name,
                        String surname,
                        int age,
                        int weight,
                        int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public static CustomerIm2Builder builder() {
        return new CustomerIm2Builder();
    }

    public static class CustomerIm2Builder {
        private String name;
        private String surname;
        private int age;
        private int weight;
        private int height;

        private CustomerIm2Builder() {
        }

        public String getName() {
            return name;
        }

        public CustomerIm2Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getSurname() {
            return surname;
        }

        public CustomerIm2Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public int getAge() {
            return age;
        }

        public CustomerIm2Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getWeight() {
            return weight;
        }

        public CustomerIm2Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public int getHeight() {
            return height;
        }

        public CustomerIm2Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public CustomerIm2 build() {
            return new CustomerIm2(name,
                                   surname,
                                   age,
                                   weight,
                                   height);
        }
    }
}
