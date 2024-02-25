package com.google.firebase.installations.q;

import com.google.firebase.h;
import com.google.firebase.installations.q.d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    private File a;
    private final h b;

    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(h hVar) {
        this.b = hVar;
    }

    private File a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    File filesDir = this.b.j().getFilesDir();
                    this.a = new File(filesDir, "PersistedInstallation." + this.b.p() + ".json");
                }
            }
        }
        return this.a;
    }

    private JSONObject c() {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public d b(d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.d());
            jSONObject.put("Status", dVar.g().ordinal());
            jSONObject.put("AuthToken", dVar.b());
            jSONObject.put("RefreshToken", dVar.f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.h());
            jSONObject.put("ExpiresInSecs", dVar.c());
            jSONObject.put("FisError", dVar.e());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.b.j().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(a())) {
                return dVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    public d d() {
        JSONObject c = c();
        String optString = c.optString("Fid", (String) null);
        int optInt = c.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = c.optString("AuthToken", (String) null);
        String optString3 = c.optString("RefreshToken", (String) null);
        long optLong = c.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = c.optLong("ExpiresInSecs", 0);
        String optString4 = c.optString("FisError", (String) null);
        d.a a2 = d.a();
        a2.d(optString);
        a2.g(a.values()[optInt]);
        a2.b(optString2);
        a2.f(optString3);
        a2.h(optLong);
        a2.c(optLong2);
        a2.e(optString4);
        return a2.a();
    }
}
