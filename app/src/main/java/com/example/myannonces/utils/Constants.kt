package com.example.myannonces.utils

import android.app.Activity
import android.content.Intent
import android.provider.MediaStore

object Constants {


    // Firebase Constants
    // This  is used for the collection name for USERS.
    const val USERS: String = "users"

    const val MYSHOPPAL_PREFERENCES: String = "MyShopPalPrefs"
    const val LOGGED_IN_USERNAME: String = "logged_in_username"

    // Intent extra constants.
    const val EXTRA_USER_DETAILS: String = "extra_user_details"

    // TODO Step 4: Add a unique code for asking the Read Storage Permission.
    // START
    //A unique code for asking the Read Storage Permission using this we will be check and identify in the method onRequestPermissionsResult in the Base Activity.
    const val READ_STORAGE_PERMISSION_CODE = 2
    // TODO Step 1: Add a unique code to select the image from the storage. Using this code we will identify the image URI once it is selected.
    // START
    // A unique code of image selection from Phone Storage.
    const val PICK_IMAGE_REQUEST_CODE = 1
    // END

    // TODO Step 2: Request the intent to select the image using the unique code.
    // START
    /**
     * A function for user profile image selection from phone storage.
     */
    fun showImageChooser(activity: Activity) {
        // An intent for launching the image selection of phone storage.
        val galleryIntent = Intent(
                Intent.ACTION_PICK,
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        )
        // Launches the image selection of phone storage using the constant code.
        activity.startActivityForResult(galleryIntent, PICK_IMAGE_REQUEST_CODE)
    }
}