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

    // то, что ламбок навалял

    public Radio() {
    }

    public Radio(int amountStations, int stationNumber, int soundVolume) {
        this.amountStations = amountStations;
        this.stationNumber = stationNumber;
        this.soundVolume = soundVolume;
    }

    public int getAmountStations() {
        return this.amountStations;
    }

    public int getStationNumber() {
        return this.stationNumber;
    }

    public int getSoundVolume() {
        return this.soundVolume;
    }

    public void setAmountStations(int amountStations) {
        this.amountStations = amountStations;
    }

    public void setStationNumber(int stationNumber) {
        this.stationNumber = stationNumber;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Radio)) {
            return false;
        } else {
            Radio other = (Radio)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getAmountStations() != other.getAmountStations()) {
                return false;
            } else if (this.getStationNumber() != other.getStationNumber()) {
                return false;
            } else {
                return this.getSoundVolume() == other.getSoundVolume();
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Radio;
    }

    public int hashCode() {
        int PRIME = true;
        int result = 1;
        result = result * 59 + this.getAmountStations();
        result = result * 59 + this.getStationNumber();
        result = result * 59 + this.getSoundVolume();
        return result;
    }

    public String toString() {
        int var10000 = this.getAmountStations();
        return "Radio(amountStations=" + var10000 + ", stationNumber=" + this.getStationNumber() + ", soundVolume=" + this.getSoundVolume() + ")";
    }
}