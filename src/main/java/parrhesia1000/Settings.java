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

package parrhesia1000;


import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import lombok.EqualsAndHashCode;
import parrhesia1000.ui.UiTheme;


@EqualsAndHashCode
public class Settings {

    public static final UiTheme DEFAULT_THEME = UiTheme.LIGHT;

    private final ObjectProperty<UiTheme> theme = new SimpleObjectProperty<>(DEFAULT_THEME);

    public UiTheme getTheme() {
        return theme.get();
    }

    public ObjectProperty<UiTheme> themeProperty() {
        return theme;
    }

    public void setTheme(UiTheme theme) {
        this.theme.set(theme);

    }

    @Override
    public String toString() {
        return "Settings{" +
                "theme=" + theme +
                "hash=" + hashCode() +
                '}';
    }
}
