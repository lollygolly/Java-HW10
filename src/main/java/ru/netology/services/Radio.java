package ru.netology.services;

public class Radio {
    public int stationNumber; // Вводим класс номера радиостанции

    public int getStationNumber() { // Метод получения текущего номера радиостанции
        return stationNumber;
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

    public void next() { // Метод переключения номера радиостанции на следующий
        if (stationNumber < 9) {
            stationNumber = stationNumber + 1;
        }
        if(stationNumber >= 9) {
            stationNumber = 0;
        }
    }


    public void prev() { // Метод переключения номера радиостанции на следующий
        if (stationNumber > 0) {
            stationNumber = stationNumber - 1;
        }
        if (stationNumber <= 0) {
            stationNumber = 9;
        }
    }


    public int soundVolume; // Вводим класс громкости звука радиоприемника

    public int getGetSoundVolume() { // Метод получения текущей громкости звука
        return soundVolume;
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

