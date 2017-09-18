/**
 * adapter - java-design-patterns
 * Copyright © 2017 www.youbanban.com (yangqianhui@youbanban.com)
 *
 * This project belongs to Shanghai Run Great lmt information, you can not share, copy and do anything
 * by these code!
 */
package com.gerald.adapter;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;


/**
 * Created by Gerald_Yang on 2017/9/14.
 */
public class AdapterPatternTest {
  private Map<String, Object> beans;

  private static final String FISHING_BEAN = "fisher";
  private static final String ROWING_BEAN = "captain";

  @Before
  public void setup() {
    beans = new HashMap<>();
    FishingBoatAdapter fishingBoatAdapter = spy(new FishingBoatAdapter());
    beans.put(FISHING_BEAN, fishingBoatAdapter);

    Captain captain = new Captain();
    captain.setRowingBoat((FishingBoatAdapter)beans.get(FISHING_BEAN));
    beans.put(ROWING_BEAN, captain);
  }

  /**
   * This test asserts that when we use the row() method on a captain bean(client), it is
   * internally calling sail method on the fishing boat object. The Adapter ({@link FishingBoatAdapter}
   * ) converts the interface of the target class ( {@link FishingBoat}) into a suitable one
   * expected by the client ({@link Captain} ).
   */
  @Test
  public void testAdapter() {
    RowingBoat captain = (RowingBoat) beans.get(ROWING_BEAN);

    captain.row();

    RowingBoat adapter = (RowingBoat) beans.get(FISHING_BEAN);
    verify(adapter).row();
  }
}
