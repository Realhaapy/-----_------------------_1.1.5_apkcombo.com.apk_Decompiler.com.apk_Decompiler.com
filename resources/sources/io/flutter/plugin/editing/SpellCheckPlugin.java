package io.flutter.plugin.editing;

import android.os.Bundle;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import io.flutter.embedding.engine.systemchannels.SpellCheckChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.localization.LocalizationPlugin;
import java.util.ArrayList;
import java.util.Locale;

public class SpellCheckPlugin implements SpellCheckChannel.SpellCheckMethodHandler, SpellCheckerSession.SpellCheckerSessionListener {
    private static final int MAX_SPELL_CHECK_SUGGESTIONS = 5;
    private final SpellCheckChannel mSpellCheckChannel;
    private SpellCheckerSession mSpellCheckerSession;
    private final TextServicesManager mTextServicesManager;
    MethodChannel.Result pendingResult;

    public SpellCheckPlugin(TextServicesManager textServicesManager, SpellCheckChannel spellCheckChannel) {
        this.mTextServicesManager = textServicesManager;
        this.mSpellCheckChannel = spellCheckChannel;
        spellCheckChannel.setSpellCheckMethodHandler(this);
    }

    public void destroy() {
        this.mSpellCheckChannel.setSpellCheckMethodHandler((SpellCheckChannel.SpellCheckMethodHandler) null);
        SpellCheckerSession spellCheckerSession = this.mSpellCheckerSession;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void initiateSpellCheck(String str, String str2, MethodChannel.Result result) {
        if (this.pendingResult != null) {
            result.error("error", "Previous spell check request still pending.", (Object) null);
            return;
        }
        this.pendingResult = result;
        performSpellCheck(str, str2);
    }

    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        ArrayList arrayList;
        MethodChannel.Result result;
        if (sentenceSuggestionsInfoArr.length == 0) {
            result = this.pendingResult;
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
            for (int i2 = 0; i2 < sentenceSuggestionsInfo.getSuggestionsCount(); i2++) {
                SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i2);
                int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
                if (suggestionsCount > 0) {
                    int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i2);
                    String str = ("" + String.valueOf(offsetAt) + ".") + String.valueOf((sentenceSuggestionsInfo.getLengthAt(i2) + offsetAt) - 1) + ".";
                    for (int i3 = 0; i3 < suggestionsCount; i3++) {
                        str = str + suggestionsInfoAt.getSuggestionAt(i3) + "\n";
                    }
                    arrayList.add(str.substring(0, str.length() - 1));
                }
            }
            result = this.pendingResult;
        }
        result.success(arrayList);
        this.pendingResult = null;
    }

    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }

    public void performSpellCheck(String str, String str2) {
        str.split("-");
        Locale localeFromString = LocalizationPlugin.localeFromString(str);
        if (this.mSpellCheckerSession == null) {
            this.mSpellCheckerSession = this.mTextServicesManager.newSpellCheckerSession((Bundle) null, localeFromString, this, true);
        }
        this.mSpellCheckerSession.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }
}
