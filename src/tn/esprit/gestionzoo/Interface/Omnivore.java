package tn.esprit.gestionzoo.Interface;

public interface Omnivore <T> extends Carnivore,Herbivore<T>{
    void eatPlantAndMeet(T food);
}
