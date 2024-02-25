package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    final int f42e;

    /* renamed from: f  reason: collision with root package name */
    final long f43f;

    /* renamed from: g  reason: collision with root package name */
    final long f44g;

    /* renamed from: h  reason: collision with root package name */
    final float f45h;

    /* renamed from: i  reason: collision with root package name */
    final long f46i;

    /* renamed from: j  reason: collision with root package name */
    final int f47j;

    /* renamed from: k  reason: collision with root package name */
    final CharSequence f48k;

    /* renamed from: l  reason: collision with root package name */
    final long f49l;

    /* renamed from: m  reason: collision with root package name */
    List<CustomAction> f50m;

    /* renamed from: n  reason: collision with root package name */
    final long f51n;

    /* renamed from: o  reason: collision with root package name */
    final Bundle f52o;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        private final String f53e;

        /* renamed from: f  reason: collision with root package name */
        private final CharSequence f54f;

        /* renamed from: g  reason: collision with root package name */
        private final int f55g;

        /* renamed from: h  reason: collision with root package name */
        private final Bundle f56h;

        static class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i2) {
                return new CustomAction[i2];
            }
        }

        CustomAction(Parcel parcel) {
            this.f53e = parcel.readString();
            this.f54f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f55g = parcel.readInt();
            this.f56h = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i2, Bundle bundle) {
            this.f53e = str;
            this.f54f = charSequence;
            this.f55g = i2;
            this.f56h = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            return new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), customAction.getExtras());
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f54f + ", mIcon=" + this.f55g + ", mExtras=" + this.f56h;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f53e);
            TextUtils.writeToParcel(this.f54f, parcel, i2);
            parcel.writeInt(this.f55g);
            parcel.writeBundle(this.f56h);
        }
    }

    static class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i2) {
            return new PlaybackStateCompat[i2];
        }
    }

    PlaybackStateCompat(int i2, long j2, long j3, float f2, long j4, int i3, CharSequence charSequence, long j5, List<CustomAction> list, long j6, Bundle bundle) {
        this.f42e = i2;
        this.f43f = j2;
        this.f44g = j3;
        this.f45h = f2;
        this.f46i = j4;
        this.f47j = i3;
        this.f48k = charSequence;
        this.f49l = j5;
        this.f50m = new ArrayList(list);
        this.f51n = j6;
        this.f52o = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f42e = parcel.readInt();
        this.f43f = parcel.readLong();
        this.f45h = parcel.readFloat();
        this.f49l = parcel.readLong();
        this.f44g = parcel.readLong();
        this.f46i = parcel.readLong();
        this.f48k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f50m = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f51n = parcel.readLong();
        this.f52o = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f47j = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        int i2 = Build.VERSION.SDK_INT;
        Bundle bundle = null;
        if (obj == null || i2 < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList2 = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction a2 : customActions) {
                arrayList2.add(CustomAction.a(a2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (i2 >= 22) {
            bundle = playbackState.getExtras();
        }
        return new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), bundle);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f42e + ", position=" + this.f43f + ", buffered position=" + this.f44g + ", speed=" + this.f45h + ", updated=" + this.f49l + ", actions=" + this.f46i + ", error code=" + this.f47j + ", error message=" + this.f48k + ", custom actions=" + this.f50m + ", active item id=" + this.f51n + "}";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f42e);
        parcel.writeLong(this.f43f);
        parcel.writeFloat(this.f45h);
        parcel.writeLong(this.f49l);
        parcel.writeLong(this.f44g);
        parcel.writeLong(this.f46i);
        TextUtils.writeToParcel(this.f48k, parcel, i2);
        parcel.writeTypedList(this.f50m);
        parcel.writeLong(this.f51n);
        parcel.writeBundle(this.f52o);
        parcel.writeInt(this.f47j);
    }
}
