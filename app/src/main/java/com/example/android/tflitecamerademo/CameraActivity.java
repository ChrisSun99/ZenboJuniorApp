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

/** Main {@code Activity} class for the Camera app. */
public class CameraActivity extends RobotActivity implements ActivityCompat.OnRequestPermissionsResultCallback {
  public final static String TAG = CameraActivity.class.getSimpleName();
  public static RobotAPI mRobotAPI;
  public static Dialogs dialogs;
  public static SpeakConfig speakConfig = new SpeakConfig();

  public CameraActivity() {
    super(robotCallback, robotListenCallback);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_camera);
    if (null == savedInstanceState) {
      getFragmentManager()
              .beginTransaction()
              .replace(R.id.container, Camera2BasicFragment.newInstance())
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

  public static void sayWithExpression(){

    String speech = dialogs.greetings.get("female_kid_anger");
    Log.d(TAG, "say /w ex " + speech);

    //In debugging mode we ignore this for efficiency
    //mRobotAPI.robot.setExpression(generate_expression(speech));
    mRobotAPI.robot.setExpression(RobotFace.HAPPY);
    mRobotAPI.robot.speak(speech, speakConfig);
  }

  @Override
  protected void onResume() {
    super.onResume();
    mRobotAPI.robot.registerListenCallback(robotListenCallback);
    sayWithExpression();
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
