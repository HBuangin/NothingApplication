package com.nxzzld.nothingappication.view

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.Gravity
import com.nxzzld.nothingappication.R

class LoadingDialog(context: Context) : Dialog(context, R.style.LoadingDialog) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window?.setGravity(Gravity.CENTER)
        setContentView(R.layout.view_loading_layout)
    }
}