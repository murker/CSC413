package t4.csc413.smartchef;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.content.Intent;

import connectors.SearchTools;
import database.DataBaseManager;
import database.fridge.FridgeDB;
import database.fridge.FridgeLayout;
import database.recipedb.RecipeDBLayout;


/*
   Created by Poulomi 10/5/15.
 */

/**
 * Idea got from https://www.youtube.com/watch?v=tWCHDoO14aE
 * this java class is for displaying splash screen
 * splash screen starts at application startup
 * rotate animation  is supported for the png format
 * The splash screen window is closed automatically as soon as the main activity is displayed
 */
public class Splash extends Activity {
    /**
     * splash refers to res/layout/splash.xml.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        final ImageView iv = (ImageView) findViewById(R.id.imageView);
        final Animation an = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);

        iv.startAnimation(an);
        an.setAnimationListener(new Animation.AnimationListener() {
            /**
             * (non-Javadoc)
             * @param animation
             */
            @Override
            public void onAnimationStart(Animation animation) {

            }

            /**
             *(non-Javadoc)
             * @param animation
             */
            @Override
            public void onAnimationEnd(Animation animation) {

                finish();
                Intent i = new Intent(Splash.this,MainActivity.class);
                startActivity(i);
            }

            /**
             *(non-Javadoc)
             * @param animation
             */
            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });



    }
}
