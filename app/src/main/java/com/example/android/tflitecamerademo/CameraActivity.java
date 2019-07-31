package com.example.android.tflitecamerademo;

import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.util.Log;

import com.asus.robotframework.API.RobotAPI;
import com.asus.robotframework.API.RobotCallback;
import com.asus.robotframework.API.RobotCmdState;
import com.asus.robotframework.API.RobotCommand;
import com.asus.robotframework.API.RobotErrorCode;
import com.asus.robotframework.API.RobotFace;
import com.asus.robotframework.API.SpeakConfig;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.robot.asus.robotactivity.RobotActivity;

import org.json.JSONObject;

import java.util.Arrays;

/** Main {@code Activity} class for the Camera app. */
public class CameraActivity extends RobotActivity implements ActivityCompat.OnRequestPermissionsResultCallback {

  public static RobotAPI mRobotAPI;
  public static Dialogs dialogs;

  public CameraActivity(RobotCallback robotCallback, RobotCallback.Listen robotListenCallback) {
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
  }



  @Override
  protected void onPause() {
    mRobotAPI.robot.unregisterListenCallback();
    super.onPause();
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


  }
