
package com.rnffazurenotifhub;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class RNFfRnAzureNotifhubModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNFfRnAzureNotifhubModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNFfRnAzureNotifhub";
  }
}