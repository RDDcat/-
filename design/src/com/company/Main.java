package com.company;

import com.company.Builder.DefaultUserBuilder;
import com.company.Builder.User;
import com.company.Builder.UserBuilder;
import com.company.Singleton.*;

public class Main {

    public static void main(String[] args) {
        /*System.out.println(Singleton1.getInstance());
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton3.getInstance());
        System.out.println(Singleton4.getInstance());
        System.out.println(Singleton5.getInstance());
        System.out.println(Singleton1.getInstance());
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton3.getInstance());
        System.out.println(Singleton4.getInstance());
        System.out.println(Singleton5.getInstance());*/

        DefaultUserBuilder builder = new DefaultUserBuilder();
        User user = builder.uid(10).name("병그니").tier("실버4").build();
        user.Show();


        int a = 100;
        Set s1 = new Set();
        Set1 s2 = new Set1();
        example(s1, a);
        example(s2, a);

    }

    public static void example(Sets s, int a){
        a = s.Do(a);
        System.out.println(a);
    }
}

