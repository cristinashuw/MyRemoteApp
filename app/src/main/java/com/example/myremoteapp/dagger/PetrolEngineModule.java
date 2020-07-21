package com.example.myremoteapp.dagger;

import com.example.myremoteapp.car.Engine;
import com.example.myremoteapp.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);


}
