package com.example.android.tflitecamerademo;

import java.util.HashMap;
import java.util.Map;

public class Dialogs {
    // Kids
    public Map<String, String> female_kid_anger = new HashMap<>();
    public Map<String, String> female_kid_disgust = new HashMap<>();
    public Map<String, String> female_kid_fear = new HashMap<>();
    public Map<String, String> female_kid_happiness = new HashMap<>();
    public Map<String, String> female_kid_neutral = new HashMap<>();
    public Map<String, String> female_kid_sadness = new HashMap<>();
    public Map<String, String> female_kid_surprise = new HashMap<>();

    public Map<String, String> male_kid_anger = new HashMap<>();
    public Map<String, String> male_kid_disgust = new HashMap<>();
    public Map<String, String> male_kid_fear = new HashMap<>();
    public Map<String, String> male_kid_happiness = new HashMap<>();
    public Map<String, String> male_kid_neutral = new HashMap<>();
    public Map<String, String> male_kid_sadness = new HashMap<>();
    public Map<String, String> male_kid_surprise = new HashMap<>();

    // Adults
    public Map<String, String> female_adult_anger = new HashMap<>();
    public Map<String, String> female_adult_disgust = new HashMap<>();
    public Map<String, String> female_adult_fear = new HashMap<>();
    public Map<String, String> female_adult_happiness = new HashMap<>();
    public Map<String, String> female_adult_neutral = new HashMap<>();
    public Map<String, String> female_adult_sadness = new HashMap<>();
    public Map<String, String> female_adult_surprise = new HashMap<>();

    public Map<String, String> male_adult_anger = new HashMap<>();
    public Map<String, String> male_adult_disgust = new HashMap<>();
    public Map<String, String> male_adult_fear = new HashMap<>();
    public Map<String, String> male_adult_happiness = new HashMap<>();
    public Map<String, String> male_adult_neutral = new HashMap<>();
    public Map<String, String> male_adult_sadness = new HashMap<>();
    public Map<String, String> male_adult_surprise = new HashMap<>();


    // Senior Adults
    public Map<String, String> female_senior_anger = new HashMap<>();
    public Map<String, String> female_senior_disgust = new HashMap<>();
    public Map<String, String> female_senior_fear = new HashMap<>();
    public Map<String, String> female_senior_happiness = new HashMap<>();
    public Map<String, String> female_senior_neutral = new HashMap<>();
    public Map<String, String> female_senior_sadness = new HashMap<>();
    public Map<String, String> female_senior_surprise = new HashMap<>();


    public Map<String, String> male_senior_anger = new HashMap<>();
    public Map<String, String> male_senior_disgust = new HashMap<>();
    public Map<String, String> male_senior_fear = new HashMap<>();
    public Map<String, String> male_senior_happiness = new HashMap<>();
    public Map<String, String> male_senior_neutral = new HashMap<>();
    public Map<String, String> male_senior_sadness = new HashMap<>();
    public Map<String, String> male_senior_surprise = new HashMap<>();


    public Dialogs(){
        // Kids
        female_kid_anger.put("zh","孩子，你為什麼看起來很生氣的樣子?");
        female_kid_disgust.put("zh","孩子，你怎麼了?");
        female_kid_fear.put("zh","孩子，你怎麼了?");
        female_kid_happiness.put("zh","孩子, 你看起來很開心喔！");
        female_kid_neutral.put("zh","孩子, 今天心情怎麼樣？");
        female_kid_sadness.put("zh","孩子, 您怎麼了？");
        female_kid_surprise.put("zh", "孩子，你看起來很驚訝!");

        male_kid_anger.put("zh","孩子，你為什麼看起來很生氣的樣子?");
        male_kid_disgust.put("zh","孩子，你怎麼了？");
        male_kid_fear.put("zh", "孩子, 您怎麼了？");
        male_kid_happiness.put("zh", "孩子, 你怎麼了？");
        male_kid_neutral.put("zh", "孩子, 你怎麼了？");
        male_kid_sadness.put("zh", "孩子, 你怎麼了？");
        male_kid_surprise.put("zh", "孩子, 你怎麼了？");

        // Adults
        female_adult_anger.put("zh","女士，你為什麼看起來很生氣的樣子?");
        female_adult_disgust.put("zh","女士，你怎麼了?");
        female_adult_fear.put("zh","女士，你為什麼看起來很緊張？");
        female_adult_happiness.put("zh","女士，你看起來氣色很棒喔!");
        female_adult_neutral.put("zh","女士，今天心情怎麼樣?");
        female_adult_sadness.put("zh","女士，你怎麼看起來不開心?");
        female_adult_surprise.put("zh", "女士，你看起來很驚訝!");

        male_adult_anger.put("zh","先生，你為什麼看起來很生氣的樣子?");
        male_adult_disgust.put("zh","先生，您怎麼了？");
        male_adult_fear.put("zh", "先生, 您怎麼了？");
        male_adult_happiness.put("zh", "先生, 您怎麼了？");
        male_adult_neutral.put("zh", "先生, 您怎麼了？");
        male_adult_sadness.put("zh", "先生, 您怎麼了？");
        male_adult_surprise.put("zh", "先生, 您怎麼了？");

        //Senior Adults
        female_senior_anger.put("zh","阿姨，您為什麼看起來很生氣的樣子?");
        female_senior_disgust.put("zh","阿姨，您怎麼了？");
        female_senior_fear.put("zh","阿姨，您怎麼了？");
        female_senior_happiness.put("zh","阿姨，您看起來氣色很好喔！");
        female_senior_neutral.put("zh","阿姨，您怎麼了？");
        female_senior_sadness.put("zh","阿姨，您怎麼了？");
        female_senior_surprise.put("zh", "阿姨，你看起來很驚訝!");

        male_senior_anger.put("zh","先生，您為什麼看起來很生氣的樣子?");
        male_senior_disgust.put("zh","先生, 您怎麼了？");
        male_senior_fear.put("zh", "先生, 您怎麼了？");
        male_senior_happiness.put("zh", "先生, 您怎麼了？");
        male_senior_neutral.put("zh", "先生, 您怎麼了？");
        male_senior_sadness.put("zh", "先生, 您怎麼了？");
        male_senior_surprise.put("zh", "先生, 您怎麼了？");
    }

}
