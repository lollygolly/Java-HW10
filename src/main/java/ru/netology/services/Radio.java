package ru.netology.services;

public class Radio {
    private int stationNumber; // СОЗДАЕМ ПОЛЕ, В КОТОРОМ БУДУТ ХРАНИТСЯ НОМЕРА РАДИОСТАНЦИЙ
    private int soundVolume; // СОЗДАЕМ ПОЛЕ, В КОТОРОМ БУДУТ ХРАНИТСЯ ЗНАЧЕНИЯ ГРОМКОСТИ ЗВУКА


    public int getStationNumber() { // Метод получения текущего номера радиостанции
        return stationNumber;
    }

    public int getSoundVolume() { // Метод получения текущей громкости звука
        return soundVolume;
    }


    public void setStationNumber(int newStationNumber) { //Метод изменения номера радиостанции с ограничением от 0 до 9
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > 9) {
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


    public void next() { // Метод переключения номера радиостанции на следующий
        if (stationNumber != 9) {
            stationNumber++;
        } else {
            stationNumber = 0;
        }
    }

    public void prev() { // Метод переключения номера радиостанции на предыдущий
        if (stationNumber != 0) {
            stationNumber--;
        } else {
            stationNumber = 9;
        }
    }


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

