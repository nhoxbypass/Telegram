/*
 * This is the source code of Telegram for Android v. 7.x.x.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Nikolai Kudashov, 2013-2020.
 */

package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;

public class BuildVars {

    public static boolean DEBUG_VERSION = false;
    public static boolean DEBUG_PRIVATE_VERSION = false;
    public static boolean LOGS_ENABLED = false;
    public static boolean USE_CLOUD_STRINGS = true;
    public static boolean CHECK_UPDATES = true;
    public static int BUILD_VERSION = 2264;
    public static String BUILD_VERSION_STRING = "7.6.0";
    public static int APP_ID = 4;
    public static String APP_HASH = "57459b4224d0e763ed88ddd90648fc16"; //obtain your own APP_HASH at https://core.telegram.org/api/obtaining_api_id
    public static String HOCKEY_APP_HASH = "5d41402abc4b2a76b9719d911017c592";
    public static String HOCKEY_APP_HASH_DEBUG = "5d41402abc4b2a76b9719d911017c592";
    //
    public static String SMS_HASH = DEBUG_VERSION ? "O2P2z+/jBpJ" : "oLeq9AcOZkT";
    public static String PLAYSTORE_APP_URL = "https://play.google.com/store/apps/details?id=org.telegram.messenger";

    static {
        if (ApplicationLoader.applicationContext != null) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", Context.MODE_PRIVATE);
            LOGS_ENABLED = sharedPreferences.getBoolean("logsEnabled", DEBUG_VERSION);
        }
    }
}
