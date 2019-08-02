package com.example.android.tflitecamerademo;

import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.util.Log;

import com.asus.robotframework.API.RobotAPI;
import com.asus.robotframework.API.RobotCallback;
import com.asus.robotframework.API.RobotErrorCode;
import com.asus.robotframework.API.RobotFace;
import com.robot.asus.robotactivity.RobotActivity;
import com.asus.robotframework.API.SpeakConfig;
import com.asus.robotframework.API.DialogSystem;
import org.json.JSONObject;
import android.app.Fragment;

import java.util.Map;

/** Main {@code Activity} class for the Camera app. */
public class CameraActivity extends RobotActivity implements Camera2BasicFragment.OnHeadlineSelectedListener{
  public final static String TAG = CameraActivity.class.getSimpleName();
  public static RobotAPI mRobotAPI;
  public static Dialogs dialogs;
  public static SpeakConfig speakConfig = new SpeakConfig();
  public Camera2BasicFragment fragment = Camera2BasicFragment.newInstance();
  public int counter = 0;
  public CameraActivity() {
    super(robotCallback, robotListenCallback);
  }

    @Override
    public void onAttachFragment(Fragment CFragment) {
        if (CFragment instanceof Camera2BasicFragment) {
            Camera2BasicFragment fragment = (Camera2BasicFragment) CFragment;
            fragment.setOnHeadlineSelectedListener(this);
        }
    }

    @Override
    public void onArticleSelected(Map<String, String> category) {
      if (counter == 0) {
       String speech = dialogs.greetings.get(String.format(("%1$s_%2$s_%3$s"), category.get("Gender"), category.get("Age"), category.get("Emotion")));
       mRobotAPI.robot.speak(speech, speakConfig);
       Log.d(TAG, "say /w ex " + "Helllllllllloooooooo");
       counter ++;
      }
    }


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_camera);
    if (null == savedInstanceState) {
      getFragmentManager()
              .beginTransaction()
              .replace(R.id.container, fragment)
              .commit();
    }

    mRobotAPI = new RobotAPI(this, robotCallback);
    dialogs = new Dialogs();

    //Initial speech config
    speakConfig.timeout(30);
    speakConfig.volume(60);
    speakConfig.languageId(DialogSystem.LANGUAGE_ID_ZH_TW);
    speakConfig.alwaysListenState(SpeakConfig.MODE_FOREVER);
  }

  @Override
  protected void onResume() {
    super.onResume();
    mRobotAPI.robot.registerListenCallback(robotListenCallback);
    mRobotAPI.robot.setExpression(RobotFace.HAPPY);
  }

  @Override
  protected void onPause() {
    mRobotAPI.robot.unregisterListenCallback();
    //mRobotAPI.release();
    super.onPause();
    mRobotAPI.robot.stopSpeakAndListen();
  }


  @Override
  protected void onDestroy() {
    super.onDestroy();
  }

  public static RobotCallback robotCallback = new RobotCallback() {
    @Override
    public void onResult(int cmd, int serial, RobotErrorCode err_code, Bundle result) {
      super.onResult(cmd, serial, err_code, result);
    }
    };

  public static RobotCallback.Listen robotListenCallback = new RobotCallback.Listen() {

    @Override
    public void onFinishRegister() {

    }

    @Override
    public void onVoiceDetect(JSONObject jsonObject) {

    }

    @Override
    public void onSpeakComplete(String s, String s1) {

    }

    @Override
    public void onEventUserUtterance(JSONObject jsonObject) {

    }

    @Override
    public void onResult(JSONObject jsonObject) {

    }

    @Override
    public void onRetry(JSONObject jsonObject) {

    }
  };



}
