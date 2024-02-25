package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final String f10e;

    /* renamed from: f  reason: collision with root package name */
    private final CharSequence f11f;

    /* renamed from: g  reason: collision with root package name */
    private final CharSequence f12g;

    /* renamed from: h  reason: collision with root package name */
    private final CharSequence f13h;

    /* renamed from: i  reason: collision with root package name */
    private final Bitmap f14i;

    /* renamed from: j  reason: collision with root package name */
    private final Uri f15j;

    /* renamed from: k  reason: collision with root package name */
    private final Bundle f16k;

    /* renamed from: l  reason: collision with root package name */
    private final Uri f17l;

    /* renamed from: m  reason: collision with root package name */
    private MediaDescription f18m;

    static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i2) {
            return new MediaDescriptionCompat[i2];
        }
    }

    public static final class b {
        private String a;
        private CharSequence b;
        private CharSequence c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f19d;

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f20e;

        /* renamed from: f  reason: collision with root package name */
        private Uri f21f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f22g;

        /* renamed from: h  reason: collision with root package name */
        private Uri f23h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.a, this.b, this.c, this.f19d, this.f20e, this.f21f, this.f22g, this.f23h);
        }

        public b b(CharSequence charSequence) {
            this.f19d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f22g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f20e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f21f = uri;
            return this;
        }

        public b f(String str) {
            this.a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f23h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f10e = parcel.readString();
        this.f11f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f12g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f13h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f14i = (Bitmap) parcel.readParcelable(classLoader);
        this.f15j = (Uri) parcel.readParcelable(classLoader);
        this.f16k = parcel.readBundle(classLoader);
        this.f17l = (Uri) parcel.readParcelable(classLoader);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f10e = str;
        this.f11f = charSequence;
        this.f12g = charSequence2;
        this.f13h = charSequence3;
        this.f14i = bitmap;
        this.f15j = uri;
        this.f16k = bundle;
        this.f17l = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x0080
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0080
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            android.media.MediaDescription r9 = (android.media.MediaDescription) r9
            java.lang.String r3 = r9.getMediaId()
            r2.f(r3)
            java.lang.CharSequence r3 = r9.getTitle()
            r2.i(r3)
            java.lang.CharSequence r3 = r9.getSubtitle()
            r2.h(r3)
            java.lang.CharSequence r3 = r9.getDescription()
            r2.b(r3)
            android.graphics.Bitmap r3 = r9.getIconBitmap()
            r2.d(r3)
            android.net.Uri r3 = r9.getIconUri()
            r2.e(r3)
            android.os.Bundle r3 = r9.getExtras()
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L_0x004c
            android.support.v4.media.session.MediaSessionCompat.a(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L_0x004d
        L_0x004c:
            r5 = r0
        L_0x004d:
            if (r5 == 0) goto L_0x0065
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x005f
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L_0x005f
            goto L_0x0066
        L_0x005f:
            r3.remove(r4)
            r3.remove(r6)
        L_0x0065:
            r0 = r3
        L_0x0066:
            r2.c(r0)
            if (r5 == 0) goto L_0x006f
            r2.g(r5)
            goto L_0x007a
        L_0x006f:
            r0 = 23
            if (r1 < r0) goto L_0x007a
            android.net.Uri r0 = r9.getMediaUri()
            r2.g(r0)
        L_0x007a:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.a()
            r0.f18m = r9
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Object b() {
        int i2;
        MediaDescription mediaDescription = this.f18m;
        if (mediaDescription != null || (i2 = Build.VERSION.SDK_INT) < 21) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f10e);
        builder.setTitle(this.f11f);
        builder.setSubtitle(this.f12g);
        builder.setDescription(this.f13h);
        builder.setIconBitmap(this.f14i);
        builder.setIconUri(this.f15j);
        Bundle bundle = this.f16k;
        if (i2 < 23 && this.f17l != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f17l);
        }
        builder.setExtras(bundle);
        if (i2 >= 23) {
            builder.setMediaUri(this.f17l);
        }
        MediaDescription build = builder.build();
        this.f18m = build;
        return build;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f11f + ", " + this.f12g + ", " + this.f13h;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f10e);
            TextUtils.writeToParcel(this.f11f, parcel, i2);
            TextUtils.writeToParcel(this.f12g, parcel, i2);
            TextUtils.writeToParcel(this.f13h, parcel, i2);
            parcel.writeParcelable(this.f14i, i2);
            parcel.writeParcelable(this.f15j, i2);
            parcel.writeBundle(this.f16k);
            parcel.writeParcelable(this.f17l, i2);
            return;
        }
        ((MediaDescription) b()).writeToParcel(parcel, i2);
    }
}
