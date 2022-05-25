#!/bin/bash

WORKDIR=$( cd $( dirname ${BASH_SOURCE[0]})/ && pwd )

if ! hash mvn 2>/dev/null; then
    echo "[ERROR] Cant find mvn binary, aborting"
    exit 1
fi

echo "[INFO] Building app..."
echo
cd ${WORKDIR} && mvn clean package
res=$?
if [[ $res -ne 0 ]]; then
    echo
    echo "[ERROR] Build failed"
    exit $res
fi
echo
echo "[INFO] Build completed"
echo "[INFO] Your uberjar is: ${WORKDIR}/target/playground.jar"
echo "[INFO] Run it like this: ./run.sh"
exit 0
