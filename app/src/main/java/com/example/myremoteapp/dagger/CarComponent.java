package com.example.myremoteapp.dagger;

import com.example.myremoteapp.MainActivity;
import com.example.myremoteapp.car.Car;

import dagger.Component;

@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
