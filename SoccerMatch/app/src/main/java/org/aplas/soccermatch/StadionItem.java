package org.aplas.soccermatch;

public class StadionItem {
    private String mStadionName;
    private int mStadionImage;
    public StadionItem(String stadionName, int stadionImage) {
        mStadionName = stadionName;
        mStadionImage = stadionImage;
    }
    public String getStadionName() {
        return mStadionName;
    }
    public int getStadionImage() {
        return mStadionImage;
    }
}
