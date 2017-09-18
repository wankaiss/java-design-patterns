/**
 * aysnc-method-invocation - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.aysnc.method.invocation;

import java.util.Optional;

/**
 *
 * AsyncCallback interface
 *
 * @param <T>
 *
 */
public interface AsyncCallback<T> {

  /**
   * Complete handler which is executed when async task is completed or fails execution.
   * @param value the evaluated value from async task, undefined when execution fails
   * @param ex empty value if execution succeeds, some exception if executions fails
   */
  void onComplete(T value, Optional<Exception> ex);

}
