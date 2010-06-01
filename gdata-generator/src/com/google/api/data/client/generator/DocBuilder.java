/*
 * Copyright (c) 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.api.data.client.generator;

import java.io.PrintWriter;

/**
 * @author Yaniv Inbar
 */
final class DocBuilder {

  String comment;

  int indentNumSpaces;

  int sinceMinor;

  DocBuilder container;

  void generate(PrintWriter out) {
    boolean showComment = comment != null;
    boolean showSince =
        sinceMinor > (container == null ? 0 : container.sinceMinor);
    if (showComment || showSince) {
      if (showComment && !showSince && indentNumSpaces + comment.length() <= 72) {
        out.println(indent() + "/** " + comment + " */");
      } else {
        out.println(indent() + "/**");
        if (comment != null) {
          out.println(indent() + " * " + comment);
        }
        if (showSince) {
          if (comment != null) {
            out.println(indent() + " *");
          }
          out.println(indent() + " * @since 2." + sinceMinor);
        }
        out.println(indent() + " */");
      }
    }
  }

  private String indent() {
    return AbstractJavaFileGenerator.indent(indentNumSpaces);
  }

  static void generateComment(PrintWriter out, int indentNumSpaces,
      String comment) {
    DocBuilder docBuilder = new DocBuilder();
    docBuilder.indentNumSpaces = indentNumSpaces;
    docBuilder.comment = comment;
    docBuilder.generate(out);
  }
}