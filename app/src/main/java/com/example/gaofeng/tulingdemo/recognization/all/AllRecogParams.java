package com.example.gaofeng.tulingdemo.recognization.all;

import android.app.Activity;

import com.baidu.speech.asr.SpeechConstant;
import com.example.gaofeng.tulingdemo.recognization.CommonRecogParams;

import java.util.Arrays;

/**
 * Created by gaofeng on 2018/4/4
 */

public class AllRecogParams extends CommonRecogParams {


    private static final String TAG = "NluRecogParams";

    public AllRecogParams(Activity context) {
        super(context);
        stringParams.addAll(Arrays.asList(
                SpeechConstant.NLU,
                "_language",
                "_model"));

        intParams.addAll(Arrays.asList(
                SpeechConstant.DECODER,
                SpeechConstant.PROP));

        boolParams.addAll(Arrays.asList(SpeechConstant.DISABLE_PUNCTUATION, "_nlu_online"));

        // copyOfflineResource(context);
    }


}
