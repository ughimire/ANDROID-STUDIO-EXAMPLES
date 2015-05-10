package com.kocolondon.basicclassproject;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Soldier rambo = new Soldier();
        rambo.soldierType = "Green Beret";
        rambo.health = 150;

        Soldier vassily = new Soldier();
        vassily.soldierType = "Snipper";
        vassily.health = 50;

        Soldier wellington = new Soldier();
        wellington.soldierType = "Sailor";
        wellington.health = 100;//He's tough but no green beret

        Log.i("Rambo's health = ", " " + rambo.health);
        Log.i("Vassily's health = ", "" + vassily.health);
        Log.i("Wellington's health = ", "" + wellington.health);

        rambo.shootEnemy();
        vassily.shootEnemy();
        wellington.shootEnemy();
    }
}
