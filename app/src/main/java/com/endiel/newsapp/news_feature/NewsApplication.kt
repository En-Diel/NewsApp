package com.endiel.newsapp.news_feature

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

// This application inheritance is to give dagger hilt the informatin about our application
// So it has access to our application context if it needs it for our dependencies
@HiltAndroidApp
class NewsApplication : Application()