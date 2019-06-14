package com.rn_dus_testing;

import com.facebook.react.ReactActivity;
import com.flipkart.dus.DusReactApplicationDelegate;

public class MainActivity extends ReactActivity {

     /**
     * The name of the React Native bundle that needs
     * to be fetched from DUS in this activity. This
     * name could also be recieved from the intent fired to open
     * this activity
     */
    private final String bundleName = "example";
    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "rn_dus_testing";
    }
    @Override
    protected ReactActivityDelegate createReactActivityDelegate() {
        return new DusReactApplicationDelegate(this, getMainComponentName(), bundleName);
    }
}
