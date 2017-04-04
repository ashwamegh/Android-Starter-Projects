package com.github.shashank7200.miwok;

/**
 * Created by AshwaMegh on 04-04-2017.
 */

public class Word {
//    states
//    Default Translation of the Word
    private String mDefaultTranslation;


  //    Miwok Translation of the Word

    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get Default translation of word
     * @return
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get Miwok Translation of word
     * @return
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

}
