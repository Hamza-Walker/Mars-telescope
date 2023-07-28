package com.walker.logic;

import com.walker.data.TelescopeImage;
import com.walker.data.Weather;
import com.walker.io.MapReader;
import com.walker.logic.builder.TelescopeImageBuilder;

import java.io.FileNotFoundException;

public class TelescopeImageDirector {
    private final MapReader mapReader;
    private final CloudGenerator cloudGenerator;
    private final TelescopeImageBuilder telescopeImageBuilder;

    public TelescopeImageDirector(MapReader mapReader, CloudGenerator cloudGenerator, TelescopeImageBuilder telescopeImageBuilder) {
        this.mapReader = mapReader;
        this.cloudGenerator = cloudGenerator;
        this.telescopeImageBuilder = telescopeImageBuilder;
    }

    public TelescopeImage createOldOcularImage(String imageFile, String mapFile, Weather weather) throws FileNotFoundException {
        telescopeImageBuilder.reset();

        // Add the building steps to get to the desired result

        return telescopeImageBuilder.getResult();
    }
    public TelescopeImage createHawkEyeImage(String imageFile, String mapFile, Weather weather) throws FileNotFoundException {
        telescopeImageBuilder.reset();

        // Add the building steps to get to the desired result

        return telescopeImageBuilder.getResult();
    }
}
