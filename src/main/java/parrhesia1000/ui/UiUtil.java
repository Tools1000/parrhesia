/*
 *     Dr.Rename - A Minimalistic Batch Renamer
 *
 *     Copyright (C) 2022
 *
 *     This file is part of Dr.Rename.
 *
 *     You can redistribute it and/or modify it under the terms of the GNU Affero
 *     General Public License as published by the Free Software Foundation, either
 *     version 3 of the License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful, but WITHOUT
 *     ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *     FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License
 *     for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package parrhesia1000.ui;

import javafx.scene.Node;
import parrhesia1000.AppConfig;

import java.util.Locale;
import java.util.Random;
import java.util.stream.Stream;


/**
 * Move to commons
 */
public class UiUtil {

    public static String getRandomColorString() {
        return String.format("#%06x", new Random().nextInt(256 * 256 * 256));
    }

    public static String getRandomRgbaColorString(double alpha) {
        return String.format(Locale.ENGLISH, "rgba(%d,%d,%d,%.2f)", new Random().nextInt(256), new Random().nextInt(256), new Random().nextInt(256), alpha);
    }

    public static void applyRandomColors(Node... elements) {
        Stream.of(elements).forEach(l -> l.setStyle("-fx-background-color: " + UiUtil.getRandomRgbaColorString(0.3) + ";"));
    }

    public static void applyRandomTextColors(Node... elements) {
        Stream.of(elements).forEach(l -> l.setStyle("-fx-text-fill: " + UiUtil.getRandomRgbaColorString(0.3) + ";"));
    }


    public static <T extends Node> T applyDebug(T node, AppConfig appConfig) {
        if (appConfig != null && appConfig.isDebug()) {
            applyRandomColors(node);
        }
        return node;
    }
}
