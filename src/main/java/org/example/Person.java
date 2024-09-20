package org.example;

public class Person {
        String firstName;
        String lastName;
        int age;
        String ulke;
        int sira;
        int not;


        public Person(String firstName, String lastName ,int age){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
        public Person(String firstName, String lastName ,int age, String ulke, int sira ,int not){
            this(firstName, lastName, age);
            this.ulke = ulke;
            this.sira = sira;
            this.not = not;
        }
        public String getFirstName (){
            return firstName;
        }

        public String getLastName (){
            return lastName;
        }
        public int getAge (){
            return age;
        }
        public boolean isTeen (){
            return age >= 13 && 19 >= age;
        }
}
