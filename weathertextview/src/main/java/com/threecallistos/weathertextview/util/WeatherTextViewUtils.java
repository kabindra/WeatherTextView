/*
 * Copyright 2015 Kabindra Shrestha
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.threecallistos.weathertextview.util;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Utilities for working with weather text views.
 *
 * @author Kabindra Shrestha
 */
public class WeatherTextViewUtils {

    private WeatherTextViewUtils() {
    }

    /**
     * Typeface initialization using the attributes. Used in WeatherTextView constructor.
     *
     * @param textView The weather text view
     * @param context  The context the widget is running in, through which it can
     *                 access the current theme, resources, etc.
     */
    public static void initTypeface(TextView textView, Context context) {
        setTypeface(textView, android.graphics.Typeface.createFromAsset(context.getAssets(), "fonts/WeatherIcons-Regular-Webfont.ttf"));
    }

    /**
     * Setup typeface for TextView. Wrapper over {@link android.widget.TextView#setTypeface(android.graphics.Typeface)}
     * for making the font anti-aliased.
     *
     * @param textView The text view
     * @param typeface The specify typeface
     */
    public static void setTypeface(TextView textView, Typeface typeface) {
        textView.setPaintFlags(textView.getPaintFlags() | Paint.SUBPIXEL_TEXT_FLAG | Paint.ANTI_ALIAS_FLAG);
        textView.setTypeface(typeface);
    }

}