package com.gerald.abstractdocument.domain;

import com.gerald.abstractdocument.AbstractDocument;

import java.util.Map;

/**
 * @author Gerald_Yang.
 */
public class Car extends AbstractDocument implements HasModel, HasParts, HasPrice {

  public Car(Map<String, Object> properties) {
    super(properties);
  }
}
