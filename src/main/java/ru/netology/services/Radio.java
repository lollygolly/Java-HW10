package ru.netology.services;

public class Radio {
    // поля
    private int amountStations = 10; // СОЗДАЕМ ПОЛЕ, В КОТОРОМ БУДЕТ ХРАНИТСЯ КОЛИЧЕСТВО РАДИОСТАНЦИЙ
    private int stationNumber; // СОЗДАЕМ ПОЛЕ, В КОТОРОМ БУДУТ ХРАНИТСЯ НОМЕРА РАДИОСТАНЦИЙ
    private int soundVolume; // СОЗДАЕМ ПОЛЕ, В КОТОРОМ БУДУТ ХРАНИТСЯ ЗНАЧЕНИЯ ГРОМКОСТИ ЗВУКА


    // конструкторы
    public Radio() {
    }

    public Radio(int amountStations) { // Конструктор для задания количества станций
        if (amountStations > 0) {
            this.amountStations = amountStations;
        }
    }

    // геттеры
    public int getAmountStations() { // Метод получения количества радиостанций
        return amountStations;
    }

    public int getStationNumber() { // Метод получения текущего номера радиостанции
        return stationNumber;
    }

    public int getSoundVolume() { // Метод получения текущей громкости звука
        return soundVolume;
    }

    // сеттеры
    public void setAmountStations(int newAmountStations) { // Метод изменения количества радиостанций
        if (newAmountStations <= 0) {
            return;
        }
        amountStations = newAmountStations;
    }

    public void setStationNumber(int newStationNumber) { //Метод изменения номера радиостанции с ограничением от 0 до 9
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > amountStations - 1) {
            return;
        }
        stationNumber = newStationNumber;
    }

    public void setSoundVolume(int newSoundVolume) { //Метод изменения текущей громкости с ограничением от 0 до 100
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 100) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    // методы с номером станции
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

