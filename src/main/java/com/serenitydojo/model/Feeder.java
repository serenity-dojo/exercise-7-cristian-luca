package com.serenitydojo.model;

import static com.serenitydojo.model.FoodType.*;

public class Feeder {
    public FoodType feeds(AnimalType animal, boolean isPremium) {
        FoodType food;
        switch (animal) {
            case CAT:
                food = (isPremium) ? SALMON : TUNA;
                break;
            case DOG:
                food = (isPremium) ? DELUXE_DOG_FOOD : DOG_FOOD;
                break;
            case HAMSTER:
                food = (isPremium) ? LETTUCE : CABBAGE;
                break;
            default:
                food = CABBAGE;
        }
        return food;
       /*
        if (animal.equals("Cat")) {
//            if(isPremium)
//                return "Salmon";
//            else
//                return "Tuna";
            return (isPremium


            ) ? "Salmon" : "Tuna"; //ternary operator
        } else if (animal.equals("Dog")) {
            return "Dog Food";
//        } else {
//            return "Cabbage";
//        }
//
        }
        return "Cabbage";
   */
    }
}
