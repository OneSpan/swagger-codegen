package com.silanis

import com.wordnik.swagger.codegen.BasicCSharpGenerator

/**
 * Created by greg on 13/05/14.
 */
object SilanisCSharpGenerator extends BasicCSharpGenerator {
  def main(args: Array[String]) = generateClient(args)

  // location of templates
  override def templateDir = "csharp-silanis"

  // where to write generated code
  override def destinationDir = "generated-code/csharp/src"

  override def reservedWords = Set("abstract", "continue", "for", "new", "switch", "assert",
    "default", "if", "synchronized", "do", "goto", "private", "this", "break",
    "implements", "protected", "throw", "else", "import", "public", "throws", "case",
     "instanceof", "return", "transient", "catch", "extends", "try", "final",
    "interface", "static", "void", "class", "finally", "strictfp", "volatile", "const",
    "native", "super", "while")

  override def typeMapping = Map(
    "array" -> "IList",
    "boolean" -> "Boolean",
    "string" -> "String",
    "int" -> "Int32",
    "float" -> "float",
    "long" -> "long",
    "double" -> "Double",
    "object" -> "object",
    "Date" -> "DateTime",
    "date" -> "DateTime")

  apiTemplateFiles.clear()
  // package for models
  override def modelPackage = Some("Silanis.ESL.API")

  override def supportingFiles = List()

  enumModelTemplateFiles += ("enum.mustache" -> ".cs")
}
