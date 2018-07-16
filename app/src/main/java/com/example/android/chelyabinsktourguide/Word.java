package com.example.android.chelyabinsktourguide;

public class Word {

    private String mName;

    private int mImageResourceID, descriptionID, phoneID, addressID, webSiteID;

    public Word(String name, int mDescription, int mPhone, int mAddress, int mSite, int imageResourceID){
        mName = name;
        descriptionID = mDescription;
        phoneID = mPhone;
        mImageResourceID = imageResourceID;
        addressID = mAddress;
        webSiteID = mSite;
    }


    public String getmName() {
        return mName;
    }

    public int getmImage() {
        return mImageResourceID;
    }

    public int getPhoneID() {
        return phoneID;
    }

    public int getDescriptionID() {
        return descriptionID;
    }

    public int getWebSiteID() {
        return webSiteID;
    }

    public int getAddressID() {
        return addressID;
    }
}
