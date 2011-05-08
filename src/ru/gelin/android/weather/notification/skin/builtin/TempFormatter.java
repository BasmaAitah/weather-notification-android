package ru.gelin.android.weather.notification.skin.builtin;

import ru.gelin.android.weather.Temperature;
import ru.gelin.android.weather.notification.skin.TemperatureUnit;

public class TempFormatter {
	
    public static String formatTemp(int temp, TemperatureUnit unit) {
        if (temp == Temperature.UNKNOWN) {
            return "";
        }
        switch (unit) {
        case C:
            return temp + "\u00B0C";
        case F:
            return temp + "\u00B0F";
        case CF:
            return temp + "\u00B0C";
        case FC:
            return temp + "\u00B0F";
        }
        return "";
    }
    
    public static String formatTemp(int tempC, int tempF, TemperatureUnit unit) {
        if (tempC == Temperature.UNKNOWN || tempF == Temperature.UNKNOWN) {
            return "";
        }
        switch (unit) {
        case C:
            return tempC + "\u00B0C";
        case F:
            return tempF + "\u00B0F";
        case CF:
            return tempC + "\u00B0C(" + tempF + "\u00B0F)";
        case FC:
            return tempF + "\u00B0F(" + tempC + "\u00B0C)";
        }
        return "";
    }

}
