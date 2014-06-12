package com.silanis

import com.wordnik.swagger.codegen.BasicJavaGenerator

/**
 * Created by greg on 9/05/14.
 */
object SilanisJavaGenerator  extends BasicJavaGenerator {
  def main(args: Array[String]) = generateClient(args)

  // location of templates
  override def templateDir = "java-esl"

  // where to write generated code
  val destinationRoot = "generated-code/java"
  override def destinationDir = destinationRoot + "/src"

  // api invoker package
  override def invokerPackage = Some("com.silanis.esl.api")

  // package for models
  override def modelPackage = Some("com.silanis.esl.api.model")

  apiTemplateFiles.clear()

  additionalParams ++= Map(
    "artifactId" -> "esl-java-model",
    "artifactVersion" -> "10.4.3",
    "groupId" -> "com.silanis.esl")

  override def reservedWords = Set("abstract", "continue", "for", "new", "switch", "assert",
    "default", "if", "synchronized", "boolean", "do", "goto", "private",
    "this", "break", "double", "implements", "protected", "throw", "byte", "else",
    "import", "public", "throws", "case", "instanceof", "return", "transient",
    "catch", "extends", "int", "short", "try", "char", "final", "interface", "static",
    "void", "class", "finally", "long", "strictfp", "volatile", "const", "float",
    "native", "super", "while")


  // supporting classes
  override def supportingFiles = List(
    ("baseModel.mustache", destinationDir + java.io.File.separator + modelPackage.get.replaceAll("\\.", java.io.File.separator), "Model.java"),
    ("result.mustache", destinationDir + java.io.File.separator + modelPackage.get.replaceAll("\\.", java.io.File.separator), "Result.java"),
    ("pom.mustache", destinationRoot, "pom.xml"))

  enumModelTemplateFiles += ("enum.mustache" -> ".java")
}