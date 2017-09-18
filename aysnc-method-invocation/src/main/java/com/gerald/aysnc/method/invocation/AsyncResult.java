/**
 * aysnc-method-invocation - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.aysnc.method.invocation;

import java.util.concurrent.ExecutionException;

/**
 *
 * AsyncResult interface
 *
 * @param <T> parameter returned when getValue is invoked
 */
public interface AsyncResult<T> {

  /**
   *
   * Status of the async task execution.
   *
   * @return <code>true</code> if execution is completed or failed
   */
  boolean isComplete();

  /**
   * Gets the value of completed async task.
   *
   * @return evaluated value or throws ExecutionException if execution has failed
   * @throws ExecutionException ExecutionException if execution has failed, containing the root cause
   */
  T getValue() throws ExecutionException;

  /**
   * Blocks the current thread until the async task is completed.
   *
   * @throws InterruptedException if the execution is interrupted
   */
  void await() throws InterruptedException;
}
