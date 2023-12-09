package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldGetStationNumber() {
        Radio rad = new Radio();
        rad.stationNumber = 5;

        int expected = 5;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberWithinBorders() {
        Radio rad = new Radio();
        rad.setStationNumber(3);

        int expected = 3;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetStationNumberBelowZero() {
        Radio rad = new Radio();
        rad.stationNumber = 2;
        rad.setStationNumber(-2);

        int expected = 2;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberAboveZero() {
        Radio rad = new Radio();
        rad.stationNumber = 8;
        rad.setStationNumber(11);

        int expected = 8;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationNumberWithinBorders() {
        Radio rad = new Radio();
        rad.setStationNumber(7);
        rad.next();

        int expected = 8;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNumberWithinBorders() {
        Radio rad = new Radio();
        rad.setStationNumber(7);
        rad.prev();

        int expected = 6;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFirstStationNumber() {
        Radio rad = new Radio();
        rad.setStationNumber(9);
        rad.next();

        int expected = 0;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnLastStationNumber() {
        Radio rad = new Radio();
        rad.setStationNumber(0);
        rad.prev();

        int expected = 9;
        int actual = rad.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetSoundVolume() {
        Radio rad = new Radio();
        rad.soundVolume = 50;

        int expected = 50;
        int actual = rad.getGetSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeWithinBorders() {
        Radio rad = new Radio();
        rad.soundVolume = 50;
        rad.setSoundVolume(70);

        int expected = 70;
        int actual = rad.getGetSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeBelowZero() {
        Radio rad = new Radio();
        rad.soundVolume = 50;
        rad.setSoundVolume(-50);

        int expected = 50;
        int actual = rad.getGetSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeAboveAHundred() {
        Radio rad = new Radio();
        rad.soundVolume = 50;
        rad.setSoundVolume(120);

        int expected = 50;
        int actual = rad.getGetSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeWithinBorders() {
        Radio rad = new Radio();
        rad.setSoundVolume(50);
        rad.increaseSoundVolumeByOne();

        int expected = 51;
        int actual = rad.getGetSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolumeWithinBorders() {
        Radio rad = new Radio();
        rad.setSoundVolume(50);
        rad.decreaseSoundVolumeByOne();

        int expected = 49;
        int actual = rad.getGetSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseSoundVolumeAboveAHundred() {
        Radio rad = new Radio();
        rad.setSoundVolume(100);
        rad.increaseSoundVolumeByOne();

        int expected = 100;
        int actual = rad.getGetSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseSoundVolumeBelowZero() {
        Radio rad = new Radio();
        rad.setSoundVolume(0);
        rad.decreaseSoundVolumeByOne();

        int expected = 0;
        int actual = rad.getGetSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}
