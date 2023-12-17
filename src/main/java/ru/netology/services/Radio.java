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
    // конструкторы
}
