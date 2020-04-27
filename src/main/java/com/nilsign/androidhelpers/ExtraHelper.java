package com.nilsign.androidhelpers;

import android.app.Activity;
import android.os.Bundle;
import java.io.Serializable;

public final class ExtraHelper {

  private ExtraHelper() {
  }

  public static <T extends Serializable> T getExtra(String key, Bundle bundle, Activity activity) {
    return bundle == null
        ? (T) activity.getIntent().getSerializableExtra(key);
        : (T) bundle.getSerializable(key);
  }

  public static <T extends Serializable> void putExtra(String key, T value, Bundle bundle) {
    bundle.putSerializable(key, value);
  }
}
