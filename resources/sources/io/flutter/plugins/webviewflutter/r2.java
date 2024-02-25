package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class r2 {
    public static /* synthetic */ void A(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                webViewHostApi.goBack(Long.valueOf(number.longValue()));
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static void B(BinaryMessenger binaryMessenger, GeneratedAndroidWebView.WebViewHostApi webViewHostApi) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.create", a());
        if (webViewHostApi != null) {
            basicMessageChannel.setMessageHandler(new o1(webViewHostApi));
        } else {
            basicMessageChannel.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.dispose", a());
        if (webViewHostApi != null) {
            basicMessageChannel2.setMessageHandler(new z0(webViewHostApi));
        } else {
            basicMessageChannel2.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.loadData", a());
        if (webViewHostApi != null) {
            basicMessageChannel3.setMessageHandler(new x0(webViewHostApi));
        } else {
            basicMessageChannel3.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.loadDataWithBaseUrl", a());
        if (webViewHostApi != null) {
            basicMessageChannel4.setMessageHandler(new y0(webViewHostApi));
        } else {
            basicMessageChannel4.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.loadUrl", a());
        if (webViewHostApi != null) {
            basicMessageChannel5.setMessageHandler(new k1(webViewHostApi));
        } else {
            basicMessageChannel5.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.postUrl", a());
        if (webViewHostApi != null) {
            basicMessageChannel6.setMessageHandler(new n1(webViewHostApi));
        } else {
            basicMessageChannel6.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.getUrl", a());
        if (webViewHostApi != null) {
            basicMessageChannel7.setMessageHandler(new f1(webViewHostApi));
        } else {
            basicMessageChannel7.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.canGoBack", a());
        if (webViewHostApi != null) {
            basicMessageChannel8.setMessageHandler(new q0(webViewHostApi));
        } else {
            basicMessageChannel8.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.canGoForward", a());
        if (webViewHostApi != null) {
            basicMessageChannel9.setMessageHandler(new e1(webViewHostApi));
        } else {
            basicMessageChannel9.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.goBack", a());
        if (webViewHostApi != null) {
            basicMessageChannel10.setMessageHandler(new s0(webViewHostApi));
        } else {
            basicMessageChannel10.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.goForward", a());
        if (webViewHostApi != null) {
            basicMessageChannel11.setMessageHandler(new h1(webViewHostApi));
        } else {
            basicMessageChannel11.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.reload", a());
        if (webViewHostApi != null) {
            basicMessageChannel12.setMessageHandler(new c1(webViewHostApi));
        } else {
            basicMessageChannel12.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.clearCache", a());
        if (webViewHostApi != null) {
            basicMessageChannel13.setMessageHandler(new a1(webViewHostApi));
        } else {
            basicMessageChannel13.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.evaluateJavascript", a());
        if (webViewHostApi != null) {
            basicMessageChannel14.setMessageHandler(new d1(webViewHostApi));
        } else {
            basicMessageChannel14.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.getTitle", a());
        if (webViewHostApi != null) {
            basicMessageChannel15.setMessageHandler(new r0(webViewHostApi));
        } else {
            basicMessageChannel15.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.scrollTo", a());
        if (webViewHostApi != null) {
            basicMessageChannel16.setMessageHandler(new p0(webViewHostApi));
        } else {
            basicMessageChannel16.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.scrollBy", a());
        if (webViewHostApi != null) {
            basicMessageChannel17.setMessageHandler(new u0(webViewHostApi));
        } else {
            basicMessageChannel17.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel18 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.getScrollX", a());
        if (webViewHostApi != null) {
            basicMessageChannel18.setMessageHandler(new l1(webViewHostApi));
        } else {
            basicMessageChannel18.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel19 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.getScrollY", a());
        if (webViewHostApi != null) {
            basicMessageChannel19.setMessageHandler(new w0(webViewHostApi));
        } else {
            basicMessageChannel19.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel20 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.setWebContentsDebuggingEnabled", a());
        if (webViewHostApi != null) {
            basicMessageChannel20.setMessageHandler(new m1(webViewHostApi));
        } else {
            basicMessageChannel20.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel21 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.setWebViewClient", a());
        if (webViewHostApi != null) {
            basicMessageChannel21.setMessageHandler(new v0(webViewHostApi));
        } else {
            basicMessageChannel21.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel22 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.addJavaScriptChannel", a());
        if (webViewHostApi != null) {
            basicMessageChannel22.setMessageHandler(new g1(webViewHostApi));
        } else {
            basicMessageChannel22.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel23 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.removeJavaScriptChannel", a());
        if (webViewHostApi != null) {
            basicMessageChannel23.setMessageHandler(new b1(webViewHostApi));
        } else {
            basicMessageChannel23.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel24 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.setDownloadListener", a());
        if (webViewHostApi != null) {
            basicMessageChannel24.setMessageHandler(new i1(webViewHostApi));
        } else {
            basicMessageChannel24.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel25 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.setWebChromeClient", a());
        if (webViewHostApi != null) {
            basicMessageChannel25.setMessageHandler(new t0(webViewHostApi));
        } else {
            basicMessageChannel25.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
        BasicMessageChannel basicMessageChannel26 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.setBackgroundColor", a());
        if (webViewHostApi != null) {
            basicMessageChannel26.setMessageHandler(new j1(webViewHostApi));
        } else {
            basicMessageChannel26.setMessageHandler((BasicMessageChannel.MessageHandler) null);
        }
    }

    public static MessageCodec<Object> a() {
        return GeneratedAndroidWebView.WebViewHostApiCodec.INSTANCE;
    }

    public static /* synthetic */ void b(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    webViewHostApi.create(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("useHybridCompositionArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void c(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                webViewHostApi.dispose(Long.valueOf(number.longValue()));
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void d(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                webViewHostApi.goForward(Long.valueOf(number.longValue()));
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void e(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                webViewHostApi.reload(Long.valueOf(number.longValue()));
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void f(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Boolean bool = (Boolean) arrayList.get(1);
                if (bool != null) {
                    webViewHostApi.clearCache(Long.valueOf(number.longValue()), bool);
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("includeDiskFilesArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void g(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    webViewHostApi.evaluateJavascript(Long.valueOf(number.longValue()), str, new GeneratedAndroidWebView.Result<String>(hashMap, reply) {
                        final /* synthetic */ BasicMessageChannel.Reply val$reply;
                        final /* synthetic */ Map val$wrapped;

                        public void error(
/*
Method generation error in method: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.1.error(java.lang.Throwable):void, dex: classes.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.1.error(java.lang.Throwable):void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/

                        public void success(
/*
Method generation error in method: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.1.success(java.lang.String):void, dex: classes.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.1.success(java.lang.String):void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    });
                    return;
                }
                throw new NullPointerException("javascriptStringArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
            reply.reply(hashMap);
        }
    }

    public static /* synthetic */ void h(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", webViewHostApi.getTitle(Long.valueOf(number.longValue())));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void i(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                if (number2 != null) {
                    Number number3 = (Number) arrayList.get(2);
                    if (number3 != null) {
                        webViewHostApi.scrollTo(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()), Long.valueOf(number3.longValue()));
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("yArg unexpectedly null.");
                }
                throw new NullPointerException("xArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void j(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                if (number2 != null) {
                    Number number3 = (Number) arrayList.get(2);
                    if (number3 != null) {
                        webViewHostApi.scrollBy(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()), Long.valueOf(number3.longValue()));
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("yArg unexpectedly null.");
                }
                throw new NullPointerException("xArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void k(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", webViewHostApi.getScrollX(Long.valueOf(number.longValue())));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void l(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", webViewHostApi.getScrollY(Long.valueOf(number.longValue())));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void m(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Boolean bool = (Boolean) ((ArrayList) obj).get(0);
            if (bool != null) {
                webViewHostApi.setWebContentsDebuggingEnabled(bool);
                hashMap.put("result", (Object) null);
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("enabledArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void n(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    String str2 = (String) arrayList.get(2);
                    if (str2 != null) {
                        String str3 = (String) arrayList.get(3);
                        if (str3 != null) {
                            webViewHostApi.loadData(Long.valueOf(number.longValue()), str, str2, str3);
                            hashMap.put("result", (Object) null);
                            reply.reply(hashMap);
                            return;
                        }
                        throw new NullPointerException("encodingArg unexpectedly null.");
                    }
                    throw new NullPointerException("mimeTypeArg unexpectedly null.");
                }
                throw new NullPointerException("dataArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void o(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                if (number2 != null) {
                    webViewHostApi.setWebViewClient(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("webViewClientInstanceIdArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void p(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                if (number2 != null) {
                    webViewHostApi.addJavaScriptChannel(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("javaScriptChannelInstanceIdArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void q(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                if (number2 != null) {
                    webViewHostApi.removeJavaScriptChannel(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("javaScriptChannelInstanceIdArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void r(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                if (number2 != null) {
                    webViewHostApi.setDownloadListener(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("listenerInstanceIdArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void s(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                if (number2 != null) {
                    webViewHostApi.setWebChromeClient(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("clientInstanceIdArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void t(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                Number number2 = (Number) arrayList.get(1);
                if (number2 != null) {
                    webViewHostApi.setBackgroundColor(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
                    hashMap.put("result", (Object) null);
                    reply.reply(hashMap);
                    return;
                }
                throw new NullPointerException("colorArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void u(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    String str2 = (String) arrayList.get(2);
                    if (str2 != null) {
                        String str3 = (String) arrayList.get(3);
                        if (str3 != null) {
                            String str4 = (String) arrayList.get(4);
                            if (str4 != null) {
                                String str5 = (String) arrayList.get(5);
                                if (str5 != null) {
                                    webViewHostApi.loadDataWithBaseUrl(Long.valueOf(number.longValue()), str, str2, str3, str4, str5);
                                    hashMap.put("result", (Object) null);
                                    reply.reply(hashMap);
                                    return;
                                }
                                throw new NullPointerException("historyUrlArg unexpectedly null.");
                            }
                            throw new NullPointerException("encodingArg unexpectedly null.");
                        }
                        throw new NullPointerException("mimeTypeArg unexpectedly null.");
                    }
                    throw new NullPointerException("dataArg unexpectedly null.");
                }
                throw new NullPointerException("baseUrlArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void v(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    Map map = (Map) arrayList.get(2);
                    if (map != null) {
                        webViewHostApi.loadUrl(Long.valueOf(number.longValue()), str, map);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("headersArg unexpectedly null.");
                }
                throw new NullPointerException("urlArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void w(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number != null) {
                String str = (String) arrayList.get(1);
                if (str != null) {
                    byte[] bArr = (byte[]) arrayList.get(2);
                    if (bArr != null) {
                        webViewHostApi.postUrl(Long.valueOf(number.longValue()), str, bArr);
                        hashMap.put("result", (Object) null);
                        reply.reply(hashMap);
                        return;
                    }
                    throw new NullPointerException("dataArg unexpectedly null.");
                }
                throw new NullPointerException("urlArg unexpectedly null.");
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void x(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", webViewHostApi.getUrl(Long.valueOf(number.longValue())));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void y(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", webViewHostApi.canGoBack(Long.valueOf(number.longValue())));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }

    public static /* synthetic */ void z(GeneratedAndroidWebView.WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
        HashMap hashMap = new HashMap();
        try {
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number != null) {
                hashMap.put("result", webViewHostApi.canGoForward(Long.valueOf(number.longValue())));
                reply.reply(hashMap);
                return;
            }
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        } catch (Error | RuntimeException e2) {
            hashMap.put("error", GeneratedAndroidWebView.wrapError(e2));
        }
    }
}
