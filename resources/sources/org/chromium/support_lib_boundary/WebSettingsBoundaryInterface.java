package org.chromium.support_lib_boundary;

public interface WebSettingsBoundaryInterface {
    int getDisabledActionModeMenuItems();

    boolean getOffscreenPreRaster();

    boolean getSafeBrowsingEnabled();

    void setDisabledActionModeMenuItems(int i2);

    void setOffscreenPreRaster(boolean z);

    void setSafeBrowsingEnabled(boolean z);
}
