package com.zybooks.studyhelperhomework;

public class Subject {

    private String mSubject;
    private long mUpdateTime;

    public Subject() {}

    public Subject(String text) {
        mSubject = text;
        mUpdateTime = System.currentTimeMillis();
    }

    public String getText() {
        return mSubject;
    }

    public void setText(String subject) {
        mSubject = subject;
    }

    public int getUpdateTime() {
        return (int) mUpdateTime;
    }

    public void setUpdateTime(long updateTime) {
        mUpdateTime = updateTime;
    }
}
