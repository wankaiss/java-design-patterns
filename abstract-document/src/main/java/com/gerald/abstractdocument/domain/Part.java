package com.gerald.abstractdocument.domain;

import com.gerald.abstractdocument.AbstractDocument;

import java.util.Map;

/**
 * @author Gerald_Yang.
 */
public class Part extends AbstractDocument implements HasType, HasModel, HasPrice {

  public Part(Map<String, Object> properties) {
    super(properties);
  }

}
