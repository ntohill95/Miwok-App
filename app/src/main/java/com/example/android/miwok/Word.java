package com.example.android.miwok;

import android.view.View;

/**
 * Created by Niamh on 13/06/2017.
 */

public class Word  {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResource;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * Word used on next line to be the same as class name
     */
    public Word(String defaultTranslation, String miwokTranslation, int AudioResource) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResource = AudioResource;

    }
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int AudioResource) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResource = AudioResource;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID(){
        return mImageResourceID;
    }
/* Returns whether or not there is an image in this word
* If it is not equal to NO_IMAGE_PROVIDED then there is an image and should return true*/
    public boolean hasImage(){
    return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    public int getAudioResource() {
        return mAudioResource;
    }
    }
