package com.gerald.abstractdocument.domain;

import com.gerald.abstractdocument.Document;

import java.util.Optional;

/**
 * @author Gerald_Yang.
 */
public interface HasModel extends Document {
  String PROPERTY = "model";

  default Optional<String> getModel() {
    return Optional.ofNullable((String) get(PROPERTY));
  }
}
