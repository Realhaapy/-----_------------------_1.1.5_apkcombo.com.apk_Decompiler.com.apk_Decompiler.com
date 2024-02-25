package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import io.flutter.plugin.common.MethodCall;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ImagePickerCache {
    private static final String FLUTTER_IMAGE_PICKER_IMAGE_PATH_KEY = "flutter_image_picker_image_path";
    private static final String MAP_KEY_ERROR_CODE = "errorCode";
    private static final String MAP_KEY_ERROR_MESSAGE = "errorMessage";
    static final String MAP_KEY_IMAGE_QUALITY = "imageQuality";
    static final String MAP_KEY_MAX_HEIGHT = "maxHeight";
    static final String MAP_KEY_MAX_WIDTH = "maxWidth";
    static final String MAP_KEY_PATH = "path";
    static final String MAP_KEY_PATH_LIST = "pathList";
    private static final String MAP_KEY_TYPE = "type";
    static final String SHARED_PREFERENCES_NAME = "flutter_image_picker_shared_preference";
    private static final String SHARED_PREFERENCE_ERROR_CODE_KEY = "flutter_image_picker_error_code";
    private static final String SHARED_PREFERENCE_ERROR_MESSAGE_KEY = "flutter_image_picker_error_message";
    private static final String SHARED_PREFERENCE_IMAGE_QUALITY_KEY = "flutter_image_picker_image_quality";
    private static final String SHARED_PREFERENCE_MAX_HEIGHT_KEY = "flutter_image_picker_max_height";
    private static final String SHARED_PREFERENCE_MAX_WIDTH_KEY = "flutter_image_picker_max_width";
    private static final String SHARED_PREFERENCE_PENDING_IMAGE_URI_PATH_KEY = "flutter_image_picker_pending_image_uri";
    private static final String SHARED_PREFERENCE_TYPE_KEY = "flutter_image_picker_type";
    private SharedPreferences prefs;

    ImagePickerCache(Context context) {
        this.prefs = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
    }

    private void setMaxDimension(Double d2, Double d3, int i2) {
        SharedPreferences.Editor edit = this.prefs.edit();
        if (d2 != null) {
            edit.putLong(SHARED_PREFERENCE_MAX_WIDTH_KEY, Double.doubleToRawLongBits(d2.doubleValue()));
        }
        if (d3 != null) {
            edit.putLong(SHARED_PREFERENCE_MAX_HEIGHT_KEY, Double.doubleToRawLongBits(d3.doubleValue()));
        }
        if (i2 <= -1 || i2 >= 101) {
            edit.putInt(SHARED_PREFERENCE_IMAGE_QUALITY_KEY, 100);
        } else {
            edit.putInt(SHARED_PREFERENCE_IMAGE_QUALITY_KEY, i2);
        }
        edit.apply();
    }

    private void setType(String str) {
        this.prefs.edit().putString(SHARED_PREFERENCE_TYPE_KEY, str).apply();
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        this.prefs.edit().clear().apply();
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> getCacheMap() {
        boolean z;
        Set<String> stringSet;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        if (!this.prefs.contains(FLUTTER_IMAGE_PICKER_IMAGE_PATH_KEY) || (stringSet = this.prefs.getStringSet(FLUTTER_IMAGE_PICKER_IMAGE_PATH_KEY, (Set) null)) == null) {
            z = false;
        } else {
            arrayList.addAll(stringSet);
            hashMap.put(MAP_KEY_PATH_LIST, arrayList);
            z = true;
        }
        if (this.prefs.contains(SHARED_PREFERENCE_ERROR_CODE_KEY)) {
            hashMap.put(MAP_KEY_ERROR_CODE, this.prefs.getString(SHARED_PREFERENCE_ERROR_CODE_KEY, ""));
            if (this.prefs.contains(SHARED_PREFERENCE_ERROR_MESSAGE_KEY)) {
                hashMap.put(MAP_KEY_ERROR_MESSAGE, this.prefs.getString(SHARED_PREFERENCE_ERROR_MESSAGE_KEY, ""));
            }
        } else {
            z2 = z;
        }
        if (z2) {
            if (this.prefs.contains(SHARED_PREFERENCE_TYPE_KEY)) {
                hashMap.put(MAP_KEY_TYPE, this.prefs.getString(SHARED_PREFERENCE_TYPE_KEY, ""));
            }
            if (this.prefs.contains(SHARED_PREFERENCE_MAX_WIDTH_KEY)) {
                hashMap.put(MAP_KEY_MAX_WIDTH, Double.valueOf(Double.longBitsToDouble(this.prefs.getLong(SHARED_PREFERENCE_MAX_WIDTH_KEY, 0))));
            }
            if (this.prefs.contains(SHARED_PREFERENCE_MAX_HEIGHT_KEY)) {
                hashMap.put(MAP_KEY_MAX_HEIGHT, Double.valueOf(Double.longBitsToDouble(this.prefs.getLong(SHARED_PREFERENCE_MAX_HEIGHT_KEY, 0))));
            }
            hashMap.put(MAP_KEY_IMAGE_QUALITY, this.prefs.contains(SHARED_PREFERENCE_IMAGE_QUALITY_KEY) ? Integer.valueOf(this.prefs.getInt(SHARED_PREFERENCE_IMAGE_QUALITY_KEY, 100)) : 100);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public String retrievePendingCameraMediaUriPath() {
        return this.prefs.getString(SHARED_PREFERENCE_PENDING_IMAGE_URI_PATH_KEY, "");
    }

    /* access modifiers changed from: package-private */
    public void saveDimensionWithMethodCall(MethodCall methodCall) {
        setMaxDimension((Double) methodCall.argument(MAP_KEY_MAX_WIDTH), (Double) methodCall.argument(MAP_KEY_MAX_HEIGHT), methodCall.argument(MAP_KEY_IMAGE_QUALITY) == null ? 100 : ((Integer) methodCall.argument(MAP_KEY_IMAGE_QUALITY)).intValue());
    }

    /* access modifiers changed from: package-private */
    public void savePendingCameraMediaUriPath(Uri uri) {
        this.prefs.edit().putString(SHARED_PREFERENCE_PENDING_IMAGE_URI_PATH_KEY, uri.getPath()).apply();
    }

    /* access modifiers changed from: package-private */
    public void saveResult(ArrayList<String> arrayList, String str, String str2) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList);
        SharedPreferences.Editor edit = this.prefs.edit();
        if (arrayList != null) {
            edit.putStringSet(FLUTTER_IMAGE_PICKER_IMAGE_PATH_KEY, hashSet);
        }
        if (str != null) {
            edit.putString(SHARED_PREFERENCE_ERROR_CODE_KEY, str);
        }
        if (str2 != null) {
            edit.putString(SHARED_PREFERENCE_ERROR_MESSAGE_KEY, str2);
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public void saveTypeWithMethodCallName(String str) {
        String str2;
        if (str.equals("pickImage") || str.equals("pickMultiImage")) {
            str2 = "image";
        } else if (str.equals("pickVideo")) {
            str2 = "video";
        } else {
            return;
        }
        setType(str2);
    }
}
