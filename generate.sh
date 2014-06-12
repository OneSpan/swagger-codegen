#!/usr/bin/env sh

# Generate the schemas and their docs in the schemas doc

echo "Generating"

echo "-------------------------------------------------------------"
echo "Clean up Java models"
rm -fr ./generated-code/java/
echo "Generating Java"
./bin/runscala.sh com.silanis.SilanisJavaGenerator http://localhost:8080/aws/rest/api-docs

echo "-------------------------------------------------------------"
echo "Clean up CSharp models"
rm -fr ./generated-code/csharp/
echo "Generating CSharp"
./bin/runscala.sh com.silanis.SilanisCSharpGenerator http://localhost:8080/aws/rest/api-docs

echo "-------------------------------------------------------------"
echo "Clean up Ruby models"
rm -fr ./generated-code/ruby/
echo "Generating Ruby"
./bin/runscala.sh com.silanis.SilanisRubyGenerator http://localhost:8080/aws/rest/api-docs
