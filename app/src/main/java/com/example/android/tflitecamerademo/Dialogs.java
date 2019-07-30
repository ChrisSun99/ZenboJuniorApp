package com.example.android.tflitecamerademo;

import java.util.HashMap;
import java.util.Map;

public class Dialogs {
    public Map<String, String> command_error = new HashMap<>();
    public Map<String, String> youtube1 = new HashMap<>();
    public Map<String, String> photo1 = new HashMap<>();
    public Map<String, String> photo2 = new HashMap<>();
    public Map<String, String> photo3 = new HashMap<>();
    public Map<String, String> photo4 = new HashMap<>();
    public Map<String, String> share1 = new HashMap<>();
    public Map<String, String> share2 = new HashMap<>();
    public Map<String, String> share3 = new HashMap<>();

    public Dialogs(){
        command_error.put("en","There is an error in the command, please verify.");
        command_error.put("zh","There is an error in the command, please verify.");

        youtube1.put("en","The video will start shortly. Please wait.");
        youtube1.put("zh","準備播放...");

        photo1.put("en","Here\'s your photo!");
        photo1.put("zh","這是您的照片!");

        photo2.put("en","Press redo to retake it.");
        photo2.put("zh","請按重新開始");

        photo3.put("en","You can also share it.");
        photo3.put("zh","你可以跟朋友分享");

        photo4.put("en","When you are done, press done!");
        photo4.put("zh","當你看完了，請按『完成!』");

        share1.put("en","How would you like to share this content?");
        share1.put("zh","你想怎麼跟朋友分享這個檔案");

        share2.put("en","Your file is uploading, please wait a moment");
        share2.put("zh","正在上傳....請稍等一下");

        share3.put("en","Use this QR code to get your file!");
        share3.put("zh","掃描二維碼來得到您的檔案");

    }

}
