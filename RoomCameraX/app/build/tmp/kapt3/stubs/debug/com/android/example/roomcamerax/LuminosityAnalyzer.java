package com.android.example.roomcamerax;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B,\u0012%\u0010\u0002\u001a!\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0002R-\u0010\u0002\u001a!\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/android/example/roomcamerax/LuminosityAnalyzer;", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "listener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "luma", "", "Lcom/android/example/roomcamerax/LumaListener;", "(Lkotlin/jvm/functions/Function1;)V", "analyze", "image", "Landroidx/camera/core/ImageProxy;", "toByteArray", "", "Ljava/nio/ByteBuffer;", "app_debug"})
final class LuminosityAnalyzer implements androidx.camera.core.ImageAnalysis.Analyzer {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<java.lang.Double, kotlin.Unit> listener = null;
    
    public LuminosityAnalyzer(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Double, kotlin.Unit> listener) {
        super();
    }
    
    private final byte[] toByteArray(java.nio.ByteBuffer $this$toByteArray) {
        return null;
    }
    
    @java.lang.Override
    public void analyze(@org.jetbrains.annotations.NotNull
    androidx.camera.core.ImageProxy image) {
    }
}