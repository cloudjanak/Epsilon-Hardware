package com.epsilonhardware;

import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.OneSignalHmsEventBridge;

public class YourHmsMessageService extends HmsMessageService {
   public void onNewToken(String token) {
        // ...
        // Forward event on to OneSignal SDK
        OneSignalHmsEventBridge.onNewToken(this, token);
    }

    @Override
    public void onMessageReceived(RemoteMessage message) {
        // ...
        // Forward event on to OneSignal SDK
        OneSignalHmsEventBridge.onMessageReceived(this, message);
    }
}