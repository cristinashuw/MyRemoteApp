package com.example.myremoteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myremoteapp.car.Car;
import com.example.myremoteapp.dagger.CarComponent;
import com.example.myremoteapp.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();
        component.inject(this);

        car.drive();
    }
}