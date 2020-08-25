package ru.sbrf.generics;

import java.util.ArrayList;
import java.util.List;

public class Alg <T> {
    public  void calcSuper(List<? super Animal> param){
        param.add(new Cat());
        param.add(new Animal());
        param.add(new Dog());

        ((Animal)param.get(1)).testAnimal();
        ((Cat)param.get(0)).testCat();
        // param.add(new ru.sbrf.generics.Bio()); //compile time error

        System.out.println(param);
    }

    public  void calcExtends(List<? extends Animal> param){

        param.add(null);
//        param.add(new ru.sbrf.generics.Cat());     //compile time error
//        param.add(new ru.sbrf.generics.Animal());  //compile time error
//        param.add(new ru.sbrf.generics.Bio());     //compile time error

        System.out.println(param.get(1));
    }

}
