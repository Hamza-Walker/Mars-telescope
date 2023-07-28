package com.walker.logic.builder;


import com.walker.data.TelescopeImage;
import com.walker.data.TelescopeType;
import com.walker.data.TerrainElement;
import com.walker.data.Weather;

import java.awt.*;
import java.util.List;

public interface TelescopeImageBuilder {

    void reset();
    void setImageFile(String imageFile);
    void setTelescopeType(TelescopeType telescopeType);
    void setMapData(List<String> mapData);
    void setTerrainElementColor(TerrainElement terrainElement);
    void setTerrainElementColor(TerrainElement terrainElement, Color color);
    void setUnitSize(int unitSize);
    void setBlurPatchSize(int blurPatchRadius);
    void setNoiseAmplitude(double noiseAmplitude);
    void setWeather(Weather weather);
    void addPixelFault(int x, int y);
    TelescopeImage getResult();
}

