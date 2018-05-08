package com.bignerdranch.android.Piano;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Masahra on 2018/4/12.
 */

public class SoundViewModel extends BaseObservable{
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox){
        mBeatBox = beatBox;
    }
@Bindable
    public String getTitle(){
        return mSound.getName();
    }

    public Sound getmSound()
    {
        return mSound;
    }

    public void setSound(Sound sound){
        mSound = sound;
        notifyChange();
    }

    public void onButtonClicked() {

        mBeatBox.play(mSound);
    }
}
