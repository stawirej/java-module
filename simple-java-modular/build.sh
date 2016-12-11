#!/bin/bash

echo -e Clear workspace...
rm -R ./target

echo -e Compile...
./_compile.sh

echo -e Execute class...
./_execute.sh

echo -e
echo -e Package...
./_package.sh

echo -e
echo -e Execute module...
./_execute_module.sh

echo -e
echo -e Module info...
./_module_info.sh

echo -e Link - create a custom modular run-time image...
./_link.sh

echo -e Execute runtime image...
./target/ttomdayapp/bin/ttomday_module.bat 