/*
 *  Weather API.
 *  Copyright (C) 2010  Denis Nelubin aka Gelin
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 *  http://gelin.ru
 *  mailto:den@gelin.ru
 */

package ru.gelin.android.weather;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *  Simple weather realization. Just holds the values.
 */
public class SimpleWeather implements Weather {

    /** Location */
    Location location;
    /** Time */
    Date time;
    /** Unit system */
    UnitSystem unit;
    TemperatureUnit tunit;
    WindSpeedUnit wsunit;
    /** List of conditions */
    List<WeatherCondition> conditions;
    
    /**
     *  Sets the location.
     */
    public void setLocation(Location location) {
        this.location = location;
    }
    
    /**
     *  Sets the time.
     */
    public void setTime(Date time) {
        this.time = time;
    }
    
    /**
     *  Sets the unit system.
     */
    @Deprecated
    public void setUnitSystem(UnitSystem unit) {
        this.unit = unit;
    }
    
    /**
     *  Sets the temperature unit.
     */
    public void setTemperatureUnit(TemperatureUnit unit) {
        this.tunit = unit;
    }
    
    /**
     *  Sets the wind speed unit.
     */
    public void setWindSpeedUnit(WindSpeedUnit unit) {
        this.wsunit = unit;
    }
    
    /**
     *  Sets the weather conditions list.
     */
    public void setConditions(List<WeatherCondition> conditions) {
        this.conditions = conditions;
    }
    
    //@Override
    public Location getLocation() {
        return this.location;
    }

    //@Override
    public Date getTime() {
        return this.time;
    }

    //@Override
    @Deprecated
    public UnitSystem getUnitSystem() {
        return this.unit;
    }
    
    //@Override
    public TemperatureUnit getTemperatureUnit() {
        return this.tunit;
    }
    
    //@Override
    public WindSpeedUnit getWindSpeedUnit() {
        return this.wsunit;
    }
    
    //@Override
    public List<WeatherCondition> getConditions() {
        if (this.conditions == null) {
            return new ArrayList<WeatherCondition>();
        }
        return this.conditions;
    }
    
    //@Override
    public boolean isEmpty() {
        if (this.time == null || this.time.getTime() == 0) {
            return true;
        }
        if (this.conditions == null || this.conditions.size() == 0) {
            return true;
        }
        return false;
    }

}
