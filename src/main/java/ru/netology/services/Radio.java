package ru.netology.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    // поля
    private int amountStations = 10; // СОЗДАЕМ ПОЛЕ, В КОТОРОМ БУДЕТ ХРАНИТСЯ КОЛИЧЕСТВО РАДИОСТАНЦИЙ
    private int stationNumber; // СОЗДАЕМ ПОЛЕ, В КОТОРОМ БУДУТ ХРАНИТСЯ НОМЕРА РАДИОСТАНЦИЙ
    private int soundVolume; // СОЗДАЕМ ПОЛЕ, В КОТОРОМ БУДУТ ХРАНИТСЯ ЗНАЧЕНИЯ ГРОМКОСТИ ЗВУКА

    public Radio(int amountStations) { // Конструктор для задания количества станций
        if (amountStations > 0) {
            this.amountStations = amountStations;
        }
    }

    // Методы, которые не генерируются аннотациями
    public void next() { // Метод переключения номера радиостанции на следующий
        if (stationNumber != amountStations - 1) {
            stationNumber++;
        } else {
            stationNumber = 0;
        }
    }

    public void prev() { // Метод переключения номера радиостанции на предыдущий
        if (stationNumber != 0) {
            stationNumber--;
        } else {
            stationNumber = amountStations - 1;
        }
    }

    // методы с громкостью звука
    public void increaseSoundVolumeByOne() { //Метод увеличения громкости на один
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }
    }

    public void decreaseSoundVolumeByOne() { //Метод уменьшения громкости на один
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }
}