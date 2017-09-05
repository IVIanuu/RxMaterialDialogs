/*
 * Copyright 2017 Manuel Wrage
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ivianuu.rxmaterialdialogscommons.color;

import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;

import com.afollestad.materialdialogs.MaterialDialog;
import com.ivianuu.rxmaterialdialogs.base.DialogEvent;

/**
 * Represents color chooser dialog event
 */
public final class ColorChooserDialogEvent extends DialogEvent {

    private final int selectedColor;

    ColorChooserDialogEvent(@NonNull MaterialDialog dialog, @ColorInt int selectedColor) {
        super(dialog);
        this.selectedColor = selectedColor;
    }

    /**
     * Returns the selected color of this event
     */
    @ColorInt
    public int getSelectedColor() {
        return selectedColor;
    }
}
