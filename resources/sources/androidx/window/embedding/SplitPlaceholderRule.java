package androidx.window.embedding;

import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import m.y.d.g;
import m.y.d.l;

@ExperimentalWindowApi
public final class SplitPlaceholderRule extends SplitRule {
    private final Set<ActivityFilter> filters;
    private final Intent placeholderIntent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitPlaceholderRule(Set<ActivityFilter> set, Intent intent, int i2, int i3, float f2, int i4) {
        super(i2, i3, f2, i4);
        l.d(set, "filters");
        l.d(intent, "placeholderIntent");
        this.placeholderIntent = intent;
        this.filters = r.G(set);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SplitPlaceholderRule(Set set, Intent intent, int i2, int i3, float f2, int i4, int i5, g gVar) {
        this(set, intent, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0.5f : f2, (i5 & 32) != 0 ? 3 : i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPlaceholderRule) || !super.equals(obj) || !super.equals(obj)) {
            return false;
        }
        SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) obj;
        return l.a(this.filters, splitPlaceholderRule.filters) && l.a(this.placeholderIntent, splitPlaceholderRule.placeholderIntent);
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public final Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    public int hashCode() {
        return (((super.hashCode() * 31) + this.filters.hashCode()) * 31) + this.placeholderIntent.hashCode();
    }

    public final SplitPlaceholderRule plus$window_release(ActivityFilter activityFilter) {
        l.d(activityFilter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(activityFilter);
        return new SplitPlaceholderRule(r.G(linkedHashSet), this.placeholderIntent, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }
}
