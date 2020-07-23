package com.example.myremoteapp.dagger;

import com.example.myremoteapp.car.DieselEngine;
import com.example.myremoteapp.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower() {
        return horsePower;
    }

    @Provides
    Engine provideEngine (DieselEngine engine) {
        return engine;
    }


}
