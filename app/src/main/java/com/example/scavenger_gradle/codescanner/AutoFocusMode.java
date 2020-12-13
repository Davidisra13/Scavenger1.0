package com.example.scavenger_gradle.codescanner;

///**
// * Code scanner auto focus mode
// *
// * @see CodeScanner#setAutoFocusMode(com.example.scavenger_gradle.codescanner.CodeScanner)
// */
public enum AutoFocusMode {
    /**
     * Auto focus camera with the specified interval
     *
     * @see CodeScanner#setAutoFocusInterval(long)
     */
    SAFE,

    /**
     * Continuous auto focus, may not work on some devices
     */
    CONTINUOUS
}
