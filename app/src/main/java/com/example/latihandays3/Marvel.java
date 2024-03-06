package com.example.latihandays3;


import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Marvel implements Parcelable {
    private String Name;
    private String Type;
    private String age;

    public Marvel() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    protected Marvel(Parcel in) {
        Name = in.readString();
        Type = in.readString();
        age = in.readString();
    }

    public static final Creator<Marvel> CREATOR = new Creator<Marvel>() {
        @Override
        public Marvel createFromParcel(Parcel in) {
            return new Marvel(in);
        }

        @Override
        public Marvel[] newArray(int size) {
            return new Marvel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeString(Type);
        dest.writeString(age);
    }
}
