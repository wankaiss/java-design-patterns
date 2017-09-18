/**
 * abstract-doucument - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
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
