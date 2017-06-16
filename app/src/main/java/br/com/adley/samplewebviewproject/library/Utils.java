package br.com.adley.samplewebviewproject.library;

import android.annotation.SuppressLint;
import android.os.Environment;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Adley.Damaceno on 16/06/2017.
 * Common and helper methods.
 */

public class Utils {
    public static boolean checkInternet(){
        return true;
    }

    // Create an image file
    @SuppressLint("SimpleDateFormat")
    public static File createImageFile() throws IOException {
        String timeStamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
        String imageFileName = "img_"+timeStamp+"_";
        File storageDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        return File.createTempFile(imageFileName,".jpg",storageDir);
    }
}
