package kr.khs.studyfarm.network.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u00c6\u0003J?\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lkr/khs/studyfarm/network/request/UserInfo;", "", "birthYear", "", "cityInfo", "", "gender", "interesting", "(ILjava/util/List;ILjava/util/List;)V", "getBirthYear", "()I", "getCityInfo", "()Ljava/util/List;", "getGender", "getInteresting", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class UserInfo {
    private final int birthYear = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Integer> cityInfo = null;
    private final int gender = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.Integer> interesting = null;
    
    public final int getBirthYear() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getCityInfo() {
        return null;
    }
    
    public final int getGender() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getInteresting() {
        return null;
    }
    
    public UserInfo(@com.squareup.moshi.Json(name = "birth_year")
    int birthYear, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "city_info")
    java.util.List<java.lang.Integer> cityInfo, int gender, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> interesting) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kr.khs.studyfarm.network.request.UserInfo copy(@com.squareup.moshi.Json(name = "birth_year")
    int birthYear, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "city_info")
    java.util.List<java.lang.Integer> cityInfo, int gender, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> interesting) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}