package com.jashtec.utilfindr;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Das on 04/11/15.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "KbdEARjreJcwp6lRr3geYbrbDJMHDLlh58wAVNf2", "gVPr1u3pve0b6CxOQPte90yxk6lIMZvnYAl6a4OF");

    }
}
