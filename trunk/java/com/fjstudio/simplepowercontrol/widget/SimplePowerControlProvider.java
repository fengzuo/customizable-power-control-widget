package com.fjstudio.simplepowercontrol.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.widget.RemoteViews;
import android.widget.Toast;
import android.R;
import java.util.Random;

public class SimplePowerControlProvider extends AppWidgetProvider {

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        final int N = appWidgetIds.length;

        // Perform this loop procedure for each App Widget that belongs to this provider
        for (int i=0; i<N; i++) {
            int appWidgetId = appWidgetIds[i];

            // Create an Intent to launch ExampleActivity
            Intent intent = new Intent(context, SimplePowerControlProvider.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);

            final Intent onClickIntent = new Intent(context, SimplePowerControlProvider.class);

            // Get the layout for the App Widget and attach an on-click listener
            // to the button
//            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.appwidget_provider_layout);
//            views.setOnClickPendingIntent(R.id.wifiButton, pendingIntent);

            // Tell the AppWidgetManager to perform an update on the current app widget
            //appWidgetManager.updateAppWidget(appWidgetId, views);
        }
    }
}