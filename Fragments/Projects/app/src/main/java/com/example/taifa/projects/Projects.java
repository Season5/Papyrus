package com.example.taifa.projects;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by taifa on 3/7/16.
 */
public class Projects {
    String  name = "None";
    String  address = "None";
    int holes =18;
    boolean isPublic;

    // Constructor for course
    Projects(String name) {
        this.name = name;
    }
    // Text representation of the class
    public String toString () {
        return name;
    }

    // Parcelable implementation
    public int describeContents() {
        return 0;
    }
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(name);
    }
    public static final Parcelable.Creator<Projects> CREATOR
            = new Parcelable.Creator<Projects>() {
        public Projects createFromParcel(Parcel in) {
            return new Projects(in);
        }
        public Projects[] newArray(int size) {
            return new Projects[size];
        }
    };
    private Projects(Parcel in) {
        name = in.readString();
    }
}

