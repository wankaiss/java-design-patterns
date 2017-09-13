package com.gerald.abstractdocument.domain;

import com.gerald.abstractdocument.Document;

import java.util.stream.Stream;

/**
 * @author Gerald_Yang.
 */
public interface HasParts extends Document{
  String PROPERTY = "parts";

  default Stream<Part> getParts() {
    return children(PROPERTY, Part::new);
  }
}
