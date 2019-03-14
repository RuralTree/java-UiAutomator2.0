package com.example.myandroidtest;

import android.app.Instrumentation;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.view.KeyEvent;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MyAndroidTest {
    public Instrumentation instrumentation;
    public UiDevice uiDevice;

    @Before
    public  void setUp(){
        instrumentation = InstrumentationRegistry.getInstrumentation();
        uiDevice = UiDevice.getInstance(instrumentation);
//        //解锁
//        uiDevice.swipe(197,1122,197,623,10);
//        //输入密码

    }

    @Test
    public void androidTest() throws RemoteException, InterruptedException {
        Thread.sleep(2000);

        uiDevice.pressKeyCode(KeyEvent.KEYCODE_HOME);
        uiDevice.pressKeyCode(KeyEvent.KEYCODE_HOME);
        Thread.sleep(2000);
        uiDevice.findObject(By.text("计算器")).click();
         Thread.sleep(2000);
         uiDevice.findObject(By.res("com.android.calculator2:id/digit_1")).click();
         uiDevice.findObject(By.res("com.android.calculator2:id/op_add")).click();
         uiDevice.findObject(By.res("com.android.calculator2:id/digit_1")).click();
         uiDevice.findObject(By.res("com.android.calculator2:id/eq")).click();
         Thread.sleep(2000);
         uiDevice.findObject(By.res("com.android.calculator2:id/del")).longClick();

//        uiDevice.pressRecentApps();
//        uiDevice.findObject(By.res("com.google.android.dialer:id/search_edit_text").text("Search contacts & places")).setText("123");
//        uiDevice.findObject(By.checked(false).res("com.android.settings:id/switchWidget")).click();
    }

    @Test
    public void wechatTest() throws RemoteException, InterruptedException {
        Thread.sleep(2000);

        uiDevice.pressKeyCode(KeyEvent.KEYCODE_HOME);
        uiDevice.pressKeyCode(KeyEvent.KEYCODE_HOME);
        Thread.sleep(2000);
        uiDevice.findObject(By.text("微信")).click();
        Thread.sleep(2000);
        //uiDevice.swipe(380,887,380,1564,10);
        uiDevice.findObject(By.res("com.tencent.mm:id/b5o").text("王帅")).click();
        uiDevice.findObject(By.res("com.tencent.mm:id/amd")).click();
        uiDevice.findObject(By.res("com.tencent.mm:id/xs").desc("[微笑]")).click();
        uiDevice.findObject(By.res("com.tencent.mm:id/ami").text("发送")).click();

//        uiDevice.pressRecentApps();
//        uiDevice.findObject(By.res("com.google.android.dialer:id/search_edit_text").text("Search contacts & places")).setText("123");
//        uiDevice.findObject(By.checked(false).res("com.android.settings:id/switchWidget")).click();
    }
}
