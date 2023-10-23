package com.android.example.roomcamerax.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\'J!\u0010\f\u001a\u00020\u00032\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000e\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\'\u00a8\u0006\u0013"}, d2 = {"Lcom/android/example/roomcamerax/data/UserDao;", "", "delete", "", "user", "Lcom/android/example/roomcamerax/data/User;", "findByName", "first", "", "last", "getAll", "", "insertAll", "users", "", "([Lcom/android/example/roomcamerax/data/User;)V", "loadAllByIds", "userIds", "", "app_debug"})
@androidx.room.Dao
public abstract interface UserDao {
    
    @androidx.room.Query(value = "SELECT * FROM user")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.android.example.roomcamerax.data.User> getAll();
    
    @androidx.room.Query(value = "SELECT * FROM user WHERE uid IN (:userIds)")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.android.example.roomcamerax.data.User> loadAllByIds(@org.jetbrains.annotations.NotNull
    int[] userIds);
    
    @androidx.room.Query(value = "SELECT * FROM user WHERE first_name LIKE :first AND last_name LIKE :last LIMIT 1")
    @org.jetbrains.annotations.NotNull
    public abstract com.android.example.roomcamerax.data.User findByName(@org.jetbrains.annotations.NotNull
    java.lang.String first, @org.jetbrains.annotations.NotNull
    java.lang.String last);
    
    @androidx.room.Insert
    public abstract void insertAll(@org.jetbrains.annotations.NotNull
    com.android.example.roomcamerax.data.User... users);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.android.example.roomcamerax.data.User user);
}