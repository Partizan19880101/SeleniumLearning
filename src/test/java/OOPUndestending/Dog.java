package OOPUndestending;

import org.testng.annotations.Listeners;

class Dog extends Animal{

    @Override
    void voice() {
        mx = "Гав-гав";
        for (int i = 1; i <= age; i++) {
            System.out.println(mx);
        }
        super.voice();
    }
}

    class Cat extends Animal{

     @Override
    void voice() {
        mx = "Мяу-Мяу";
        for (int i = 1; i <= age; i++) {
            System.out.println(mx);
        }
        super.voice();
    }
        public static void main(String[] args) {
            Dog dog = new Dog();
            Cat cat = new Cat();
            cat.name = "Мурзик";
            cat.age = 4;
            dog.age = 2; // нельзя, поле age скрыто
            dog.name = "Жучка"; // переименовать собаку тоже нельзя, поле name скрыто

            dog.voice(); // это можно, метод voice() открытый
            cat.voice();
            System.out.println(cat.age);
            System.out.println(dog.age);
            System.out.println(dog.name + " " + cat.name);
            System.out.println(cat.name);
            PlaySound playSound = new PlaySound();
            playSound.playSound(cat);
            playSound.playSound(dog);

        }
    }



    class PlaySound {

        void playSound(Animal animal) {
            animal.voice();
        }

        void retrieveUser(int id) {
            DataAccess dataAccess;
            boolean networkConnectionExists = false;
            if (networkConnectionExists) {
                dataAccess = new BackEnd();
            } else {
                dataAccess = new Database();
            }
            dataAccess.getUserValue(id);
        }
    }

    interface DataAccess {
        void getUserValue(int id);
    }

    class Database implements DataAccess {


        @Override
        public void getUserValue(int id) {
            //Connect to database and retrieve it
        }
    }

    class BackEnd implements DataAccess {


        @Override
        public void getUserValue(int id) {
            //Connect to back office
        }
    }