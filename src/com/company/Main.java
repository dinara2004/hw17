package com.company;

public class Main {

    public static void main(String[] args) {
//        Animal деген класс тузунуз жана бир метод кошунуз.
//        Анын 3 наследнигин тузунуз.
//
//        Shark деген класска attack(), Turtle деген класска swim() жана Eage деген класска fly() методторун тузосуз.
//        Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин
//        кошунуз.
//      instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
//        чыгарыныз.


                Animal shark = new Shark(520,"White",true);
                Animal turtle = new Turtle(12,"Green",75);
                Animal eagle = new Eagle(3.6,"Brown",320);


                Animal[] animals = {turtle, eagle, shark};

                for (Animal s : animals) {
                    if (s instanceof Shark) {
                        ((Shark) s).attack();
                    }
                    if (s.getClass().getName().equals("hw17.Shark")) {
                        ((Shark) s).attack();
                    }

                    if (s instanceof Turtle) {
                        ((Turtle) s).swim();
                    }
                    if (s.getClass().getName().equals("hw17.Turtle")) {
                        ((Turtle) s).swim();
                    }
                    if (s instanceof Eagle) {
                        ((Eagle) s).fly();
                    }
                    if (s.getClass().getName().equals("hw17.Eagle")) {
                        ((Eagle) s).fly();
                    }
                    System.out.println();
                }
                Shark[] sharks = {(Shark) animals[1]};
                Eagle[] eagles = {(Eagle) animals[1]};
                Turtle[] turtles = {(Turtle) animals[1]};







    }
}
