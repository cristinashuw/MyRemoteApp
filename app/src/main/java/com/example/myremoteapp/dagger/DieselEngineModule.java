package com.example.myremoteapp.dagger;

import com.example.myremoteapp.car.DieselEngine;
import com.example.myremoteapp.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);


}
