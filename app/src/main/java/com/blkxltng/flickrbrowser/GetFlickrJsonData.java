package com.blkxltng.flickrbrowser;

import java.util.List;

/**
 * Created by firej on 4/6/2017.
 */

class GetFlickrJsonData implements GetRawData.OnDownloadComplete {

    private static final String TAG = "GetFlickrJsonData";

    private List<Photo> mPhotoList = null;
    private String mBaseURL;
    private String mLanguage;
    private boolean mMatchAll;

    private final OnDataAvailable mCallback;

    interface OnDataAvailable {
        void onDataAvailable(List<Photo> data, DownloadStatus status);
    }
}
