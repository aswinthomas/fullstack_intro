package com.aswindev.training.concepts

import android.graphics.Bitmap
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

fun main() {
    launch(Dispatchers.Main) {
        val deferred = async(Dispatchers.IO) {
            getOriginalBitmap()
        }
        // wait till image is obtained
        var bmp = deferred.await()

        val filterDeferred = async(Dispatchers.Default) {
            applyFilter(bmp)
        }
        // wait till filtered image is obtained
        bmp = filterDeferred.await()

        loadImageToView(bmp)
    }
}

private fun getOriginalBitmap() {

}

private fun applyFilter(bmp: Bitmap) {

}

private fun loadImageToView(bmp: Bitmap) {

}