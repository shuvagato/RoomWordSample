package com.samsung.roomwordsample;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    @ColumnInfo(name = "meaning")
    private String mMeaning;

    public Word(@NonNull String word, @NonNull String meaning) {
        this.mWord = word;
        this.mMeaning = meaning;
    }

    public String getWord(){
        return this.mWord;
    }

    public String getMeaning() {
        return this.mMeaning;
    }
}