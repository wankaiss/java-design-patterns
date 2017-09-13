package com.gerald.abstractdocument.domain;

import com.gerald.abstractdocument.Document;

import java.util.Optional;

/**
 * @author Gerald_Yang.
 */
public interface HasPrice extends Document{
  String PROPERTY = "price";

  default Optional<Number> getPrice() {
    return Optional.ofNullable((Number) get(PROPERTY));
  }
}
