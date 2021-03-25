#!/bin/sh
./gradlew build --continuous -PskipDownload=true --console=plain &
./gradlew bootRun -PskipDownload=true --console=plain
