package com.nuuwa.android.geoquiz;

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mAnswerable;

    public Question(int textResId, boolean answerTrue, boolean answerable) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mAnswerable = answerable;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isAnswerable() {
        return mAnswerable;
    }

    public void setAnswerable(boolean answerable) {
        this.mAnswerable = answerable;
    }
}
