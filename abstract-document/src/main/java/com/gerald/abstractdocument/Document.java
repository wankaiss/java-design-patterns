package com.gerald.abstractdocument;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author Gerald_Yang.
 */
public interface Document {

  /**
   * Puts the value related to the key
   *
   * @param key element key
   * @param value element value
   * @return
   */
  Void put(String key, Object value);

  Object get(String key);

  <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor);
}
