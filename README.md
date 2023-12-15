### Compile project

```shell
javac -d bin --enable-preview --release 21 -cp "lib/*" $(find src/main/java -name "*.java") 
```

### Compile project with preview warnings

```shell
javac -d bin --enable-preview --release 21 -cp "lib/*" -Xlint:preview $(find src/main/java -name "*.java")
```

### Clean project

```shell
rm -rf bin
```

### Run code not containing preview features

```shell
java -cp "bin:lib/*" switchextensions.eu.chrost.Part01ArrowLabels 
```

### Run code containing preview features

```shell
java -cp "bin:lib/*" --enable-preview switchextensions.eu.chrost.Part04PatternMatching
```