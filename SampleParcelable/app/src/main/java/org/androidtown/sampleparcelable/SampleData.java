package org.androidtown.sampleparcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by MK on 2016-06-15.
 */
public class SampleData implements Parcelable {
    int number;
    String message;

    public SampleData(int number,String message) {
        this.message = message;
        this.number = number;
    }

    protected SampleData(Parcel in) {
        number = in.readInt();
        message = in.readString();
    }

    public static final Creator<SampleData> CREATOR = new Creator<SampleData>() {
        @Override
        public SampleData createFromParcel(Parcel in) {
            return new SampleData(in);
        }

        @Override
        public SampleData[] newArray(int size) {
            return new SampleData[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(number);
        dest.writeString(message);
    }
}
