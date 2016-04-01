package com.example.akramkhan.onborading;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.flaviofaria.kenburnsview.RandomTransitionGenerator;
import com.flaviofaria.kenburnsview.Transition;
//import com.goka.kenburnsview.KenBurnsView;
//import com.goka.kenburnsview.LoopViewPager;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Akram Khan on 27-03-2016.
 */
public class OnboardingFragment1 extends Fragment {
    private KenBurnsView mBackgroundImageKbv;
    private LinearLayout mBackgroundLl;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle s) {
        View view =  inflater.inflate(
                R.layout.onboarding_screen1,
                container,
                false
        );
        KenBurnsView kbv = (KenBurnsView) view.findViewById(R.id.image);
        kbv.setTransitionListener(new KenBurnsView.TransitionListener() {
            @Override
            public void onTransitionStart(Transition transition) {

            }
            @Override
            public void onTransitionEnd(Transition transition) {

            }
        });

        AccelerateDecelerateInterpolator ACCELERATE_DECELERATE = new AccelerateDecelerateInterpolator();
        RandomTransitionGenerator generator = new RandomTransitionGenerator(8000, ACCELERATE_DECELERATE);
//duration = 10000ms = 10s and interpolator = ACCELERATE_DECELERATE
        kbv.setTransitionGenerator(generator); //set new transition on kbv

        return view;
    }


}