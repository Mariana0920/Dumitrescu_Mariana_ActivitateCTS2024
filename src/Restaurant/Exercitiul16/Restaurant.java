package Restaurant.Exercitiul16;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Observer> observers = new ArrayList<>();

    public void adaugaClient(Observer client) {
        observers.add(client);
    }

    public void stergeClient(Observer client) {
        observers.remove(client);
    }

    public void trimiteNotificare(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
