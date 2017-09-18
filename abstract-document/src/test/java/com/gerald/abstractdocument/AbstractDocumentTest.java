/**
 * abstract-doucument - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.abstractdocument;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class AbstractDocumentTest {

  public static final String KEY = "key";
  public static final String VALUE = "value";

  private class DocumentImplementation extends AbstractDocument {
    DocumentImplementation(Map<String, Object> properties) {
      super(properties);
    }
  }

  private DocumentImplementation document = new DocumentImplementation(new HashMap<>());

  @Test
  public void shouldPutAndGetValue() {
    document.put(KEY, VALUE);
    assertEquals(VALUE, document.get(KEY));
  }

  @Test
  public void shouldRetrieveChildren() {
    HashMap<String, Object> child1 = new HashMap<>();
    HashMap<String, Object> child2 = new HashMap<>();
    List<Map<String, Object>> children = Arrays.asList(child1, child2);

    document.put(KEY, children);

    Stream<DocumentImplementation> childrenStream = document.children(KEY,
        DocumentImplementation::new);
    assertNotNull(children);
    assertEquals(2, childrenStream.count());
  }

  @Test
  public void shouldRetrieveEmptyStreamForNonExistingChildren() {
    Stream<DocumentImplementation> children = document.children(KEY, DocumentImplementation::new);
    assertNotNull(children);
    assertEquals(0, children.count());
  }

  @Test
  public void shouldIncludePropsInToString() {
    Map<String, Object> props = new HashMap<>();
    props.put(KEY, VALUE);
    DocumentImplementation document = new DocumentImplementation(props);
    assertNotNull(document.toString().contains(KEY));
    assertNotNull(document.toString().contains(VALUE));
  }
}
