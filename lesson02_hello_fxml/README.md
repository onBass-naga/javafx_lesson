# lesson01_maven_hello

動作確認環境
```
$ java --version
openjdk 11.0.10 2021-01-19 LTS
OpenJDK Runtime Environment Zulu11.45+27-CA (build 11.0.10+9-LTS)
OpenJDK 64-Bit Server VM Zulu11.45+27-CA (build 11.0.10+9-LTS, mixed mode)
$ mvn --version
Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
```

ライブラリのインストール
```
$ mvn install
```

実行
```
$ mvn clean javafx:run
```

パッケージング
```
$ mvn clean javafx:jlink
$ ./target/hellofx/bin/launcher
```

Ctrl+Cで終了
