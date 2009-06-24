/* Copyright (c) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.google.gdata.model.gd;

import com.google.gdata.data.DateTime;
import com.google.gdata.model.DefaultRegistry;
import com.google.gdata.model.Element;
import com.google.gdata.model.ElementCreator;
import com.google.gdata.model.ElementKey;
import com.google.gdata.model.QName;
import com.google.gdata.util.Namespaces;

/**
 * The time the object was last viewed.
 *
 * 
 */
public class LastViewed extends Element {

  /**
   * The key for this element.
   */
  public static final ElementKey<DateTime,
      LastViewed> KEY = ElementKey.of(new QName(Namespaces.gNs, "lastViewed"),
      DateTime.class, LastViewed.class);

  /*
   * Generate the default metadata for this element.
   */
  static {
    ElementCreator builder =
        DefaultRegistry.build(KEY).setContentRequired(false);
  }

  /**
   * Default mutable constructor.
   */
  public LastViewed() {
    this(KEY);
  }

  /**
   * Create an instance using a different key.
   */
  public LastViewed(ElementKey<DateTime, ? extends LastViewed> key) {
    super(key);
  }

  /**
   * Constructs a new instance by doing a shallow copy of data from an existing
   * {@link Element} instance. Will use the given {@link ElementKey} as the key
   * for the element.
   *
   * @param key The key to use for this element.
   * @param source source element
   */
  public LastViewed(ElementKey<DateTime, ? extends LastViewed> key,
      Element source) {
    super(key, source);
  }

  /**
   * Constructs a new instance with the given value.
   *
   * @param value value.
   */
  public LastViewed(DateTime value) {
    this();
    setValue(value);
  }

   @Override
   public LastViewed lock() {
     return (LastViewed) super.lock();
   }

  /**
   * Returns the value.
   *
   * @return value
   */
  public DateTime getValue() {
    return super.getTextValue(KEY);
  }

  /**
   * Sets the value.
   *
   * @param value value or <code>null</code> to reset
   */
  public LastViewed setValue(DateTime value) {
    super.setTextValue(value);
    return this;
  }

  /**
   * Returns whether it has the value.
   *
   * @return whether it has the value
   */
  public boolean hasValue() {
    return super.hasTextValue();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!sameClassAs(obj)) {
      return false;
    }
    LastViewed other = (LastViewed) obj;
    return eq(getValue(), other.getValue());
  }

  @Override
  public int hashCode() {
    int result = getClass().hashCode();
    if (getValue() != null) {
      result = 37 * result + getValue().hashCode();
    }
    return result;
  }

  @Override
  public String toString() {
    return "{LastViewed value=" + getTextValue() + "}";
  }

}