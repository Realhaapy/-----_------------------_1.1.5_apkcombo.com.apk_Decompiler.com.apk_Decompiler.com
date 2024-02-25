package com.facebook.internal;

import com.facebook.g0;

public enum t {
    Login(0),
    Share(1),
    Message(2),
    Like(3),
    GameRequest(4),
    AppGroupCreate(5),
    AppGroupJoin(6),
    AppInvite(7),
    DeviceShare(8),
    GamingFriendFinder(9),
    GamingGroupIntegration(10),
    Referral(11),
    GamingContextCreate(12),
    GamingContextSwitch(13),
    GamingContextChoose(14),
    TournamentShareDialog(15);
    

    /* renamed from: e  reason: collision with root package name */
    private final int f1535e;

    private t(int i2) {
        this.f1535e = i2;
    }

    public final int c() {
        g0 g0Var = g0.a;
        return g0.h() + this.f1535e;
    }
}
