// SPDX-License-Identifier: GPL-2.0-or-later

package org.dolphinemu.dolphinemu.features.settings.model;

import androidx.annotation.NonNull;

public class LegacyFloatSetting extends AbstractLegacySetting implements AbstractFloatSetting
{
  private final float mDefaultValue;

  public LegacyFloatSetting(String file, String section, String key, float defaultValue)
  {
    super(file, section, key);
    mDefaultValue = defaultValue;
  }

  @Override
  public float getFloat(@NonNull Settings settings)
  {
    return settings.getSection(mFile, mSection).getFloat(mKey, mDefaultValue);
  }

  @Override
  public void setFloat(@NonNull Settings settings, float newValue)
  {
    settings.getSection(mFile, mSection).setFloat(mKey, newValue);
  }
}
