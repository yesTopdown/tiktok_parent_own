package com.example.model;

/**
 * title: Owned
 * description:
 *
 * @author iok_own
 * date 2023/10/19 10:09
 */
public interface Owned<T> extends Id<T>{
    String getUid();
    void setUid(String uid);
}
