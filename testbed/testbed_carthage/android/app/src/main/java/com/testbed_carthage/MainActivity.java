package com.testbed_carthage;

import com.facebook.react.ReactActivity;
import io.branch.rnbranch.*;
import android.content.Intent;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "testbed_carthage";
    }

    // Override onStart, onStop, onNewIntent:
    @Override
    protected void onStart() {
        super.onStart();
        RNBranchModule.initSession(this.getIntent().getData(), this);
    }

    @Override
    public void onNewIntent(Intent intent) {
        this.setIntent(intent);
    }
}
