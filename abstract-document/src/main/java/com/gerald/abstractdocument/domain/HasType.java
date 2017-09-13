package com.gerald.abstractdocument.domain;

import com.gerald.abstractdocument.Document;

import java.util.Optional;

/**
 * @author Gerald_Yang.
 */
public interface HasType extends Document {

  String PROPERTY = "type";

  default Optional<String> getType() {
    return Optional.ofNullable((String) get(PROPERTY));
  }
}
