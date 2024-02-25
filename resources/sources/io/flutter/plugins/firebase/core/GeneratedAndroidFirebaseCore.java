package io.flutter.plugins.firebase.core;

import android.util.Log;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAndroidFirebaseCore {

    public interface FirebaseAppHostApi {
        void delete(String str, Result<Void> result);

        void setAutomaticDataCollectionEnabled(String str, Boolean bool, Result<Void> result);

        void setAutomaticResourceManagementEnabled(String str, Boolean bool, Result<Void> result);
    }

    private static class FirebaseAppHostApiCodec extends StandardMessageCodec {
        public static final FirebaseAppHostApiCodec INSTANCE = new FirebaseAppHostApiCodec();

        private FirebaseAppHostApiCodec() {
        }
    }

    public interface FirebaseCoreHostApi {
        void initializeApp(String str, PigeonFirebaseOptions pigeonFirebaseOptions, Result<PigeonInitializeResponse> result);

        void initializeCore(Result<List<PigeonInitializeResponse>> result);

        void optionsFromResource(Result<PigeonFirebaseOptions> result);
    }

    private static class FirebaseCoreHostApiCodec extends StandardMessageCodec {
        public static final FirebaseCoreHostApiCodec INSTANCE = new FirebaseCoreHostApiCodec();

        private FirebaseCoreHostApiCodec() {
        }

        /* access modifiers changed from: protected */
        public Object readValueOfType(byte b, ByteBuffer byteBuffer) {
            return b != Byte.MIN_VALUE ? b != -127 ? super.readValueOfType(b, byteBuffer) : PigeonInitializeResponse.fromMap((Map) readValue(byteBuffer)) : PigeonFirebaseOptions.fromMap((Map) readValue(byteBuffer));
        }

        /* access modifiers changed from: protected */
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Map<String, Object> map;
            if (obj instanceof PigeonFirebaseOptions) {
                byteArrayOutputStream.write(128);
                map = ((PigeonFirebaseOptions) obj).toMap();
            } else if (obj instanceof PigeonInitializeResponse) {
                byteArrayOutputStream.write(129);
                map = ((PigeonInitializeResponse) obj).toMap();
            } else {
                super.writeValue(byteArrayOutputStream, obj);
                return;
            }
            writeValue(byteArrayOutputStream, map);
        }
    }

    public static class PigeonFirebaseOptions {
        private String androidClientId;
        private String apiKey;
        private String appGroupId;
        private String appId;
        private String authDomain;
        private String databaseURL;
        private String deepLinkURLScheme;
        private String iosBundleId;
        private String iosClientId;
        private String measurementId;
        private String messagingSenderId;
        private String projectId;
        private String storageBucket;
        private String trackingId;

        public static final class Builder {
            private String androidClientId;
            private String apiKey;
            private String appGroupId;
            private String appId;
            private String authDomain;
            private String databaseURL;
            private String deepLinkURLScheme;
            private String iosBundleId;
            private String iosClientId;
            private String measurementId;
            private String messagingSenderId;
            private String projectId;
            private String storageBucket;
            private String trackingId;

            public PigeonFirebaseOptions build() {
                PigeonFirebaseOptions pigeonFirebaseOptions = new PigeonFirebaseOptions();
                pigeonFirebaseOptions.setApiKey(this.apiKey);
                pigeonFirebaseOptions.setAppId(this.appId);
                pigeonFirebaseOptions.setMessagingSenderId(this.messagingSenderId);
                pigeonFirebaseOptions.setProjectId(this.projectId);
                pigeonFirebaseOptions.setAuthDomain(this.authDomain);
                pigeonFirebaseOptions.setDatabaseURL(this.databaseURL);
                pigeonFirebaseOptions.setStorageBucket(this.storageBucket);
                pigeonFirebaseOptions.setMeasurementId(this.measurementId);
                pigeonFirebaseOptions.setTrackingId(this.trackingId);
                pigeonFirebaseOptions.setDeepLinkURLScheme(this.deepLinkURLScheme);
                pigeonFirebaseOptions.setAndroidClientId(this.androidClientId);
                pigeonFirebaseOptions.setIosClientId(this.iosClientId);
                pigeonFirebaseOptions.setIosBundleId(this.iosBundleId);
                pigeonFirebaseOptions.setAppGroupId(this.appGroupId);
                return pigeonFirebaseOptions;
            }

            public Builder setAndroidClientId(String str) {
                this.androidClientId = str;
                return this;
            }

            public Builder setApiKey(String str) {
                this.apiKey = str;
                return this;
            }

            public Builder setAppGroupId(String str) {
                this.appGroupId = str;
                return this;
            }

            public Builder setAppId(String str) {
                this.appId = str;
                return this;
            }

            public Builder setAuthDomain(String str) {
                this.authDomain = str;
                return this;
            }

            public Builder setDatabaseURL(String str) {
                this.databaseURL = str;
                return this;
            }

            public Builder setDeepLinkURLScheme(String str) {
                this.deepLinkURLScheme = str;
                return this;
            }

            public Builder setIosBundleId(String str) {
                this.iosBundleId = str;
                return this;
            }

            public Builder setIosClientId(String str) {
                this.iosClientId = str;
                return this;
            }

            public Builder setMeasurementId(String str) {
                this.measurementId = str;
                return this;
            }

            public Builder setMessagingSenderId(String str) {
                this.messagingSenderId = str;
                return this;
            }

            public Builder setProjectId(String str) {
                this.projectId = str;
                return this;
            }

            public Builder setStorageBucket(String str) {
                this.storageBucket = str;
                return this;
            }

            public Builder setTrackingId(String str) {
                this.trackingId = str;
                return this;
            }
        }

        private PigeonFirebaseOptions() {
        }

        static PigeonFirebaseOptions fromMap(Map<String, Object> map) {
            PigeonFirebaseOptions pigeonFirebaseOptions = new PigeonFirebaseOptions();
            pigeonFirebaseOptions.setApiKey((String) map.get("apiKey"));
            pigeonFirebaseOptions.setAppId((String) map.get("appId"));
            pigeonFirebaseOptions.setMessagingSenderId((String) map.get("messagingSenderId"));
            pigeonFirebaseOptions.setProjectId((String) map.get("projectId"));
            pigeonFirebaseOptions.setAuthDomain((String) map.get("authDomain"));
            pigeonFirebaseOptions.setDatabaseURL((String) map.get("databaseURL"));
            pigeonFirebaseOptions.setStorageBucket((String) map.get("storageBucket"));
            pigeonFirebaseOptions.setMeasurementId((String) map.get("measurementId"));
            pigeonFirebaseOptions.setTrackingId((String) map.get("trackingId"));
            pigeonFirebaseOptions.setDeepLinkURLScheme((String) map.get("deepLinkURLScheme"));
            pigeonFirebaseOptions.setAndroidClientId((String) map.get("androidClientId"));
            pigeonFirebaseOptions.setIosClientId((String) map.get("iosClientId"));
            pigeonFirebaseOptions.setIosBundleId((String) map.get("iosBundleId"));
            pigeonFirebaseOptions.setAppGroupId((String) map.get("appGroupId"));
            return pigeonFirebaseOptions;
        }

        public String getAndroidClientId() {
            return this.androidClientId;
        }

        public String getApiKey() {
            return this.apiKey;
        }

        public String getAppGroupId() {
            return this.appGroupId;
        }

        public String getAppId() {
            return this.appId;
        }

        public String getAuthDomain() {
            return this.authDomain;
        }

        public String getDatabaseURL() {
            return this.databaseURL;
        }

        public String getDeepLinkURLScheme() {
            return this.deepLinkURLScheme;
        }

        public String getIosBundleId() {
            return this.iosBundleId;
        }

        public String getIosClientId() {
            return this.iosClientId;
        }

        public String getMeasurementId() {
            return this.measurementId;
        }

        public String getMessagingSenderId() {
            return this.messagingSenderId;
        }

        public String getProjectId() {
            return this.projectId;
        }

        public String getStorageBucket() {
            return this.storageBucket;
        }

        public String getTrackingId() {
            return this.trackingId;
        }

        public void setAndroidClientId(String str) {
            this.androidClientId = str;
        }

        public void setApiKey(String str) {
            if (str != null) {
                this.apiKey = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }

        public void setAppGroupId(String str) {
            this.appGroupId = str;
        }

        public void setAppId(String str) {
            if (str != null) {
                this.appId = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }

        public void setAuthDomain(String str) {
            this.authDomain = str;
        }

        public void setDatabaseURL(String str) {
            this.databaseURL = str;
        }

        public void setDeepLinkURLScheme(String str) {
            this.deepLinkURLScheme = str;
        }

        public void setIosBundleId(String str) {
            this.iosBundleId = str;
        }

        public void setIosClientId(String str) {
            this.iosClientId = str;
        }

        public void setMeasurementId(String str) {
            this.measurementId = str;
        }

        public void setMessagingSenderId(String str) {
            if (str != null) {
                this.messagingSenderId = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }

        public void setProjectId(String str) {
            if (str != null) {
                this.projectId = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"projectId\" is null.");
        }

        public void setStorageBucket(String str) {
            this.storageBucket = str;
        }

        public void setTrackingId(String str) {
            this.trackingId = str;
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("apiKey", this.apiKey);
            hashMap.put("appId", this.appId);
            hashMap.put("messagingSenderId", this.messagingSenderId);
            hashMap.put("projectId", this.projectId);
            hashMap.put("authDomain", this.authDomain);
            hashMap.put("databaseURL", this.databaseURL);
            hashMap.put("storageBucket", this.storageBucket);
            hashMap.put("measurementId", this.measurementId);
            hashMap.put("trackingId", this.trackingId);
            hashMap.put("deepLinkURLScheme", this.deepLinkURLScheme);
            hashMap.put("androidClientId", this.androidClientId);
            hashMap.put("iosClientId", this.iosClientId);
            hashMap.put("iosBundleId", this.iosBundleId);
            hashMap.put("appGroupId", this.appGroupId);
            return hashMap;
        }
    }

    public static class PigeonInitializeResponse {
        private Boolean isAutomaticDataCollectionEnabled;
        private String name;
        private PigeonFirebaseOptions options;
        private Map<String, Object> pluginConstants;

        public static final class Builder {
            private Boolean isAutomaticDataCollectionEnabled;
            private String name;
            private PigeonFirebaseOptions options;
            private Map<String, Object> pluginConstants;

            public PigeonInitializeResponse build() {
                PigeonInitializeResponse pigeonInitializeResponse = new PigeonInitializeResponse();
                pigeonInitializeResponse.setName(this.name);
                pigeonInitializeResponse.setOptions(this.options);
                pigeonInitializeResponse.setIsAutomaticDataCollectionEnabled(this.isAutomaticDataCollectionEnabled);
                pigeonInitializeResponse.setPluginConstants(this.pluginConstants);
                return pigeonInitializeResponse;
            }

            public Builder setIsAutomaticDataCollectionEnabled(Boolean bool) {
                this.isAutomaticDataCollectionEnabled = bool;
                return this;
            }

            public Builder setName(String str) {
                this.name = str;
                return this;
            }

            public Builder setOptions(PigeonFirebaseOptions pigeonFirebaseOptions) {
                this.options = pigeonFirebaseOptions;
                return this;
            }

            public Builder setPluginConstants(Map<String, Object> map) {
                this.pluginConstants = map;
                return this;
            }
        }

        private PigeonInitializeResponse() {
        }

        static PigeonInitializeResponse fromMap(Map<String, Object> map) {
            PigeonInitializeResponse pigeonInitializeResponse = new PigeonInitializeResponse();
            pigeonInitializeResponse.setName((String) map.get("name"));
            Object obj = map.get("options");
            pigeonInitializeResponse.setOptions(obj == null ? null : PigeonFirebaseOptions.fromMap((Map) obj));
            pigeonInitializeResponse.setIsAutomaticDataCollectionEnabled((Boolean) map.get("isAutomaticDataCollectionEnabled"));
            pigeonInitializeResponse.setPluginConstants((Map) map.get("pluginConstants"));
            return pigeonInitializeResponse;
        }

        public Boolean getIsAutomaticDataCollectionEnabled() {
            return this.isAutomaticDataCollectionEnabled;
        }

        public String getName() {
            return this.name;
        }

        public PigeonFirebaseOptions getOptions() {
            return this.options;
        }

        public Map<String, Object> getPluginConstants() {
            return this.pluginConstants;
        }

        public void setIsAutomaticDataCollectionEnabled(Boolean bool) {
            this.isAutomaticDataCollectionEnabled = bool;
        }

        public void setName(String str) {
            if (str != null) {
                this.name = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }

        public void setOptions(PigeonFirebaseOptions pigeonFirebaseOptions) {
            if (pigeonFirebaseOptions != null) {
                this.options = pigeonFirebaseOptions;
                return;
            }
            throw new IllegalStateException("Nonnull field \"options\" is null.");
        }

        public void setPluginConstants(Map<String, Object> map) {
            if (map != null) {
                this.pluginConstants = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("name", this.name);
            PigeonFirebaseOptions pigeonFirebaseOptions = this.options;
            hashMap.put("options", pigeonFirebaseOptions == null ? null : pigeonFirebaseOptions.toMap());
            hashMap.put("isAutomaticDataCollectionEnabled", this.isAutomaticDataCollectionEnabled);
            hashMap.put("pluginConstants", this.pluginConstants);
            return hashMap;
        }
    }

    public interface Result<T> {
        void error(Throwable th);

        void success(T t);
    }

    /* access modifiers changed from: private */
    public static Map<String, Object> wrapError(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
